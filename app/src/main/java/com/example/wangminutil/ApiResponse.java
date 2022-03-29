package com.example.wangminutil;

public class ApiResponse<T> {

    public static final int CODE_SUCCESS = 0;
    public static final int CODE_ERROR = 1;

    public int code; //状态码
    public String msg; //信息
    public T data; //数据

    public ApiResponse(int code, String msg) {
        this.code = code;
        this.msg = msg;
        this.data = null;
    }

    public ApiResponse(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static int getCodeSuccess() {
        return CODE_SUCCESS;
    }

    public static int getCodeError() {
        return CODE_ERROR;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}