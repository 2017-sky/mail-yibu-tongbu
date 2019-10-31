package nuc.bean.mailyibutongbu;

import com.sun.org.apache.bcel.internal.generic.NEW;
import javafx.scene.text.Text;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.swing.text.html.HTML;
import java.io.File;

@SpringBootTest
class MailYibuTongbuApplicationTests {

    @Autowired
    JavaMailSenderImpl mailSender;

//    @Test
//    void contextLoads() {
//        SimpleMailMessage message = new SimpleMailMessage();
//        message.setSubject("通知-今晚开会(地点)");
//        message.setText("我马上就回去了，等我打游戏，欧克，把平板电充满");
//
//        //  message.setTo("2670242704@qq.com");
//        message.setTo("2741052899@qq.com","886525234@qq.com");
//        message.setFrom("1354140848@qq.com");
//        mailSender.send(message);
//    }
//
//
//    @Test
//    void contextLoads1() throws MessagingException {
//        //1创建一个复杂的消息邮件
//     MimeMessage mimeMessage = mailSender.createMimeMessage();
//     MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);
//        //邮件设置
//        helper.setSubject("通知-今晚开会(地点)");
//        helper.setText("<b style='color:red'>我回去了<b/>",true);
//        //  message.setTo("2670242704@qq.com");
//        //helper.setTo("2741052899@qq.com","886525234@qq.com");
//        helper.setTo("2741052899@qq.com");
//        helper.setFrom("1354140848@qq.com");
//       //上传文件
//        helper.addAttachment("",new File(""));
//        helper.addAttachment("",new File(""));
//         mailSender.send(mimeMessage);
//    }
//
//


}
