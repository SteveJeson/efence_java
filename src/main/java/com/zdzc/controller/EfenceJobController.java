package com.zdzc.controller;

import com.zdzc.entity.EfenceJob;
import com.zdzc.service.EfenceJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/job")
public class EfenceJobController {
    @Autowired
    private EfenceJobService service;

    @RequestMapping("/create")
    public Map<String, Object> createJob(@RequestBody EfenceJob efenceJob) {
        Map<String, Object> resultMap = new HashMap<>();
        try{
            service.insertEfenceJob(efenceJob);
            resultMap.put("statusCode", 200);
            resultMap.put("success", true);
            resultMap.put("message", "新建任务成功！");
        }catch (Exception e) {
            e.printStackTrace();
            resultMap.put("statusCode", 500);
            resultMap.put("success", false);
            resultMap.put("message", "新建任务失败！");
        }
        return resultMap;
    }
}
