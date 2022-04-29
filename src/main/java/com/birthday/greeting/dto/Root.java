package com.birthday.greeting.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 通用返回封裝
 *
 * @author HY Lin
 * @since 2022/4/27 10:10 PM
 */
@Data
@Builder
@AllArgsConstructor
@XmlRootElement
public class Root<T> {

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

    public static <T> Root<T> ok() {
        return ok(null);
    }

    public static <T> Root<T> ok(T data) {
        return Root.<T>builder()
                .code(0)
                .msg("success")
                .data(data)
                .timestamp(System.currentTimeMillis())
                .build();
    }
}
