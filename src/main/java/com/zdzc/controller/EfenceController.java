package com.zdzc.controller;


import com.zdzc.entity.Efence;
import com.zdzc.service.EfenceService;
import com.zdzc.task.EfenceTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/8/30 0030.
 */
@RestController
public class EfenceController {

    @Autowired
    private EfenceService efenceService;

    @RequestMapping("/test")
    public Map<String, Object> test() throws Exception{
//        EfenceTask et1 = new EfenceTask("et1");
//        executor.execute(et1);
//        EfenceTask et2 = new EfenceTask("et2");
//        executor.execute(et2);
//        Thread.sleep(5000);
//        et1.stopWork();
//        Thread.sleep(3000);
//        System.out.println(executor.getActiveCount());
        Map<String, Object> result = new HashMap<>();
        Efence efence = efenceService.selectEfenceByCode("999");
        result.put("result", efence);
        return result;
    }
}
