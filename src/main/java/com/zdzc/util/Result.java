package com.zdzc.util;

import java.io.Serializable;

/**
 * Created by liuw on 2017/8/30.
 * Result:响应的结果对象
 */
public class Result implements Serializable{

    private static final long serialVersionUID = 4430730525169395590L;

    private boolean success;
    /**
     * 信息
     */
    private String message = "";

    /**

     * 状态码
     */

    private int statusCode;

    public Result() {
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
}
