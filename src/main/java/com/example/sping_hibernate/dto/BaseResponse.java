package com.example.sping_hibernate.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.http.HttpStatus;

public class BaseResponse<T> {
    @JsonProperty("success")
    private boolean success;
    @JsonProperty("statusCode")
    private int statusCode;
    @JsonProperty("message")
    private String message;
    @JsonProperty("data")
    private T data;

    @JsonCreator
    public BaseResponse(boolean success, int statusCode, String message, T data) {
        this.success = success;
        this.statusCode = statusCode;
        this.message = message;
        this.data = data;
    }

    public static  <G> BaseResponse<G> success(String message, G data) {
        return new BaseResponse<G>(true, HttpStatus.OK.value(), message, data);
    }

    public static <G> BaseResponse<G> error(String message, int statusCode) {
        return new BaseResponse<G>(false, statusCode, message, null);
    }
// Constructors, getters, setters, etc.
}
