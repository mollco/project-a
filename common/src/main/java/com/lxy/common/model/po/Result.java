package com.lxy.common.model.po;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Result <T>{
    /**
     * 响应码
     */
    private Integer code;
    /**
     * 提示信息
     */
    private String message;
    /**
     * 返回结果
     */
    private T data;
    public static <T> Result<T> success(T data) {
        return new Result<>(200, "success", data);
    }
    public static <T> Result<T> success(String message, T data) {
        return new Result<>(200, message, data);
    }
    public static <T> Result<T> fail(Integer code, String message) {
        return new Result<>(code, message, null);
    }
}
