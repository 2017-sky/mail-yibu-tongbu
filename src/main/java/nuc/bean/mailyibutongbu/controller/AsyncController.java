package nuc.bean.mailyibutongbu.controller;

import nuc.bean.mailyibutongbu.service.AsynService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//public class AsyncController {
//@Autowired
//    AsynService asynService;
//
//
//@GetMapping("/hello")
//   public String hello(){
//       asynService.hello();
//       return "success";
//   }
//
//
//}
