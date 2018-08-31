package com.zdzc.util;

/**
 * Created by liuw on 2017/8/30.
 */
public class StatusCode {

    public static final int OK = 1;//成功

    public static final int EMPTY = 0;//数据库不存在该信息

    public static final int ACCESS_DENIED = 2;//token验证不通过，访问被拒绝

    public static final int ERROR = 3;//服务器发生异常

    public static final int NOT_IN_THE_SAME_DAY = 4;//查询间隔跨度超过一天

}
