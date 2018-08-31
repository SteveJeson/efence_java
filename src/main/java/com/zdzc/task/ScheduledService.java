package com.zdzc.task;

import com.zdzc.entity.GpsSnapshot;
import com.zdzc.service.SnapshotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/8/31 0031.
 */
//@Component
//@Order(2)
public class ScheduledService {

//    @Autowired
//    private SnapshotService snapshotService;
//
//    @Scheduled(cron = "0/5 * * * * *")
//    public void scheduled(){
//        Map<String, Object> param = new HashMap<>();
//        param.put("dbName", "gps_main");
//        List<GpsSnapshot> snapshotList = snapshotService.selectAll(param);
//
//        System.out.println(snapshotList.size() + " -----------------time: " + System.currentTimeMillis());
//    }
}
