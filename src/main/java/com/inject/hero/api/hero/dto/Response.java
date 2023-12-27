package com.inject.hero.api.hero.dto;

import lombok.Builder;

import java.util.Date;
import java.util.List;


public class Response<T> {
    private int code;
    private String status;
    private String message;
    private T data;
    private List<ErrorMessage> errors;
    private Date timestamp;

    public Response() {
        this.code = 200;
        this.status = "success";
        this.timestamp = new Date();
    }

    public int getCode() {
        return code;
    }

    public Response<T> setCode(int code) {
        this.code = code;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Response<T> setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public Response<T> setMessage(String message) {
        this.message = message;
        return this;
    }

    public T getData() {
        return data;
    }

    public Response<T> setData(T data) {
        this.data = data;
        return this;
    }

    public List<ErrorMessage> getErrors() {
        return errors;
    }
    public Response<T> setErrors(List<ErrorMessage> errors) {
        this.errors = errors;
        return this;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

}