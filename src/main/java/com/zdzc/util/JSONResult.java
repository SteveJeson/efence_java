package com.zdzc.util;

import java.io.Serializable;

/**
 * Created by liuw on 2017/8/30.
 * JSONResult : Response JSONResult for RESTful,封装返回JSON格式的数据
 */
public class JSONResult<T> extends Result implements Serializable{

    private static final long serialVersionUID = -8101932431986977359L;

    /**
     * 数据
     */
    private T data;


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


    /**
     * 自定义返回的结果
     * @param data
     * @param message
     * @param success
     */
    public JSONResult(boolean success, int statusCode, String message, T data) {
        super.setSuccess(success);
        super.setStatusCode(statusCode);
        super.setMessage(message);
        this.data = data;
    }

    public JSONResult(boolean success, int statusCode, String message) {
        super.setSuccess(success);
        super.setStatusCode(statusCode);
        super.setMessage(message);
    }

    /**
     * 成功返回数据和消息
     * @param data
     * @param message
     */
    public JSONResult(T data, String message) {
        this.data = data;
        this.setMessage(message);
        this.setStatusCode(StatusCode.OK);
    }

    /**
     * 成功返回消息
     * @param message
     */
    public JSONResult(String message) {
        this.setMessage(message);
        this.setStatusCode(StatusCode.OK);
    }

    /**
     * 成功返回数据
     */
    public JSONResult() {
        this.setStatusCode(StatusCode.OK);
    }

    /**
     * 成功返回数据
     * @param data
     */
    public JSONResult(T data) {
        this.data = data;
        this.setStatusCode(StatusCode.OK);
    }

    public static JSONResult getResult(JSONResult result, boolean success, int statusCode, String message){
        if (result != null){
            result.setSuccess(success);
            if (!success || statusCode == StatusCode.ERROR || statusCode == StatusCode.ACCESS_DENIED || statusCode == StatusCode.EMPTY){
                result.setData(null);
            }
            result.setStatusCode(statusCode);
            result.setMessage(message);
        }
        return  result;
    }
}
