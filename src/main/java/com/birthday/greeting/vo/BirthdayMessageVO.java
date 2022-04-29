package com.birthday.greeting.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 生日祝賀VO
 *
 * @author HY Lin
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BirthdayMessageVO {

    /**
     * 標題
     */
    private String subject;

    /**
     * 內容
     */
    private String message;
}
