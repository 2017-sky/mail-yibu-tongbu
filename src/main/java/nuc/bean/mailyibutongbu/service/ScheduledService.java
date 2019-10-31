package nuc.bean.mailyibutongbu.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.swing.*;

//@Service
//public class ScheduledService {
//    /**
//     *second(秒) ,minute（分）,hour（时）,day of month（日）,month（月）,day of week（周几）
//     *
//     * 0 * * * * MON-FRI
//     *周一到周五
//     */
//    //@Scheduled(cron ="0 * * * * MON-SAT")
//    //@Scheduled(cron = "0,1,2,3,4,5 * * * * MON-SAT")
//   // @Scheduled(cron = "0-4 * * * * MON-SAT")
//   @Scheduled(cron = "0/4 * * * * MON-SAT")//每4秒执行一次
//   // @Scheduled(cron = "0 0/5 14,18 * * ?")//每天的14点整，和18点整，每隔5分钟执行一次
//    //@Scheduled(cron = "0 15 10 ？ * 1-6")//每个月的周一到周六10:15分执行一次
//    //@Scheduled(cron = "0 0 2 ？ * 6L")//每个月的最后一个周六凌晨2点执行一次
//    //@Scheduled(cron = "0 0 2 LW * ?")//每个月的最后一个工作日凌晨2点执行一次
//    //@Scheduled(cron = "0 0 2-4 ？ * 1#1")//每个月的第一个周一凌晨2点倒4点期间，每个整点都执行一次
//    public void hello(){
//        System.out.println("hello...");
//    }
//
//}
