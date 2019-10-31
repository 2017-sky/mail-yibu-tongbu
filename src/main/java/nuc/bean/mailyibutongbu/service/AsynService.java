package nuc.bean.mailyibutongbu.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsynService {
//高数spring这是一个异步方法
    @Async
 public void hello()  {
     try {
         Thread.sleep(5000);
     } catch (InterruptedException e) {
         e.printStackTrace();
     }
     System.out.println("处理数据中。。。。");
 }


}
