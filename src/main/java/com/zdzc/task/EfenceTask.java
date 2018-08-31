package com.zdzc.task;

import com.zdzc.entity.Efence;
import com.zdzc.service.EfenceService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/8/30 0030.
 */
public class EfenceTask implements Runnable {
    private boolean stop = false;
    private Map<String, Integer> deviceStatus = new HashMap<>();//存放设备是否在围栏内的状态
    private String efenceCode;//围栏编号
    private int alarmType;//报警类型，1：进栏报警，2：出栏报警，3：进出栏报警
    private List<String> deviceCodeList;//
    private int interval;//任务执行间隔，单位 秒
    private EfenceService efenceService;

    public EfenceTask(String efenceCode, int alarmType, List<String> deviceCodeList, int interval, EfenceService efenceService){
        this.efenceCode = efenceCode;
        this.alarmType = alarmType;
        this.deviceCodeList = deviceCodeList;
        this.interval = interval;
        this.efenceService = efenceService;
    }

    @Override
    public void run() {
        try {
            startWork();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    void startWork() throws Exception{
        //1.获取电子围栏的坐标和类型
        Efence efence = efenceService.selectEfenceByCode(efenceCode);
        if (efence == null){
            stop = true;
        }
        while (!stop){
            //2.获取所有设备最新经纬度信息

            //3.遍历设备号列表，处理逻辑
            for (String deviceCode : deviceCodeList){
                //4.根据设备号得到设备最新经纬度信息

                //5.根据设备最新坐标和电子围栏坐标和类型，判断设备此刻在围栏内部还是在围栏外部

                //6.根据设备号查询 deviceStatus 中是否有该设备的状态信息
                if (deviceStatus.containsKey(deviceCode)){
                    //6.1.1 有，获取已保存的状态信息
                    int status = deviceStatus.get(deviceCode);
                    //6.1.2 拿 status 和 5 中的结果相比较是否相同，status = 0 表示在围栏内部，status = 1 表示在围栏外部

                    //6.1.3 如果比较结果不同

                        //6.1.3.1 把 5 中的结果更新到 deviceStatus 中

                        //6.1.3.2 结合 5 中的结果，deviceStatus 的结果以及 type 的值，进行如下处理

                            //6.1.3.2.1 当 type == 1 且 5 的结果是 0 且 deviceStatus 的结果是 1 时，表示设备进栏，组装进栏报警信息

                            //6.1.3.2.2 当 type == 2 且 5 的结果是 1 且 deviceStatus 的结果是 0 时，表示设备出栏，组装出栏报警信息

                            //6.1.3.2.3 当 type == 3 时，再结合 5 的结果和 deviceStatus 的结果，组装进栏或出栏报警信息

                            //6.1.3.2.4 通过 producer 把报警信息发送到 mq 上

                    //6.1.4 如果比较结果相同，不做其他处理
                }else {
                    //6.2.1 deviceStatus 中没有该设备的信息，直接把 deviceCode 作为 key，5 的结果作为 value，存入 deviceStatus 中

                }
            }
            //7. 整个逻辑每个 interval 秒后执行一次
            Thread.sleep(interval * 1000);
        }
    }

    public void stopWork(){
        stop = true;
    }


}
