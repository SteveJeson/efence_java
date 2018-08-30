package com.zdzc.task;

import java.util.Date;
import java.util.concurrent.ExecutorService;

/**
 * Created by Administrator on 2018/8/30 0030.
 */
public class EfenceTask implements Runnable {
    private String str;
    private boolean stop = false;
    public EfenceTask(String str){
        this.str = str;
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
        while (!stop){
            System.out.println(str);
            Thread.sleep(1000);
        }
    }

    public void stopWork(){
        stop = true;
    }
}
