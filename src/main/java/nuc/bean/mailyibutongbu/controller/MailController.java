package nuc.bean.mailyibutongbu.controller;

import nuc.bean.mailyibutongbu.entity.Mail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.TemplateEngine;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@RestController
@RequestMapping("/2017-sky")
public class MailController {
    private static Logger LOG= LoggerFactory.getLogger(MailController.class);
    @Autowired
    private JavaMailSender mailSender;


//     发送普通邮件,json数据，可以通过ajax来测试（没写），我只是通过Postman完成测试
    @PostMapping("/sendMail")
    public String sendMail(@RequestBody Mail mail) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(mail.getSender());
        message.setTo(mail.getReceiver());
        message.setSubject(mail.getSubject());
        message.setText(mail.getText());
        mailSender.send(message);
        LOG.info("发送成功!");
        return "发送成功！";
    }

    //表单完成测试（index.html(只是简单的测试，没写校验)）
    @PostMapping("/sendMail1")
    public String sendMail1(@RequestParam("sender") String sender,@RequestParam("receiver") String receiver,@RequestParam("subject") String subject,@RequestParam("text") String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(sender);
        message.setTo(receiver);
        message.setSubject(subject);
        message.setText(text);
        mailSender.send(message);
        LOG.info("发送成功!");
        return "发送成功！";
    }

    //  发送附件
    @PostMapping("/sendAttachments")
    public String sendAttachmentsMail(@RequestBody Mail mail) throws MessagingException {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        helper.setFrom(mail.getSender());
        helper.setTo(mail.getReceiver());
        helper.setSubject(mail.getSubject());
        helper.setText(mail.getText());
        FileSystemResource file = new FileSystemResource(new File("图片名"));
        helper.addAttachment("2.jpg", file);
        mailSender.send(mimeMessage);
        return "发送成功!";

    }

    //发送文件
    @PostMapping("/sendInlineMail")
    public String sendInlineMail(@RequestBody Mail mail) throws Exception {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        helper.setFrom(mail.getSender());
        helper.setTo(mail.getReceiver());
        helper.setSubject(mail.getSubject());
        //这里的text 是html
        helper.setText(mail.getText(), true);
        FileSystemResource file = new FileSystemResource(new File("8.png"));
        helper.addInline("文件", file);
        mailSender.send(mimeMessage);
        return "发送成功!";
    }




}
