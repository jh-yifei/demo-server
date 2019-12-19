package com.yifei.demo.utils.core;

public class ResultInfo {
    private int code; // 默认成功码
    private String message; // 默认成功
    private int total; // 默认总数
    private Object result; // 返回结果

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
