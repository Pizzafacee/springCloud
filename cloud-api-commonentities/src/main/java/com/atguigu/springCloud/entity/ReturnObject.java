package com.atguigu.springCloud.entity;

public class ReturnObject<T> {
   private Integer code;
   private String message;
   private T object;

    public ReturnObject(Integer code, String message, T object) {
        this.code = code;
        this.message = message;
        this.object = object;
    }

    public ReturnObject() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public ReturnObject(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
