package com.zdzc.controller;


import com.zdzc.entity.Efence;
import com.zdzc.service.EfenceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/8/30 0030.
 */
@RestController
@RequestMapping("/efence")
public class EfenceController {

    private static final Logger logger = LoggerFactory.getLogger(EfenceController.class);

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

    @RequestMapping("/create")
    public Map<String, Object> createEfence(@RequestBody Efence efence) {
        Map<String, Object> resultMap = new HashMap<>();
        try{
            efenceService.insertEfence(efence);
            resultMap.put("statusCode", 200);
            resultMap.put("success", true);
            resultMap.put("message", "创建电子围栏成功！");
        }catch (Exception e) {
            resultMap.put("statusCode", 500);
            resultMap.put("success", false);
            resultMap.put("message", "创建电子围栏失败！");
        }
        return resultMap;
    }

}
