package com.zdzc.controller;


import com.zdzc.task.EfenceTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/8/30 0030.
 */
@RestController
public class EfenceController {

    @Autowired
    private ThreadPoolTaskExecutor executor;

    @RequestMapping("/test")
    public void test() throws Exception{
        EfenceTask et1 = new EfenceTask("et1");
        executor.execute(et1);
        EfenceTask et2 = new EfenceTask("et2");
        executor.execute(et2);
        Thread.sleep(5000);
        et1.stopWork();
        Thread.sleep(3000);
        System.out.println(executor.getActiveCount());
    }
}
