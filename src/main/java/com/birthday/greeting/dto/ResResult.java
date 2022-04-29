package com.birthday.greeting.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * 通用返回封裝
 *
 * @author HY Lin
 * @since 2022/4/27 10:10 PM
 */
@Data
@Builder
@AllArgsConstructor
public class ResResult<T> {

    /**
     * 返回碼
     */
    private int code;

    /**
     * 相關訊息
     */
    private String msg;

    /**
     * 時間戳
     */
    private long timestamp;

    /**
     * 內容主體
     */
    private T data;

    public static <T> ResResult<T> ok() {
        return ok(null);
    }

    public static <T> ResResult<T> ok(T data) {
        return ResResult.<T>builder()
                .code(0)
                .msg("success")
                .data(data)
                .timestamp(System.currentTimeMillis())
                .build();
    }
}
