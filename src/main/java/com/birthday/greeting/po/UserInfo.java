package com.birthday.greeting.po;

import lombok.Data;

import java.time.LocalDate;

/**
 * 使用者Entity
 *
 * @author HY Lin
 * @since 2022/4/27 10:39 PM
 */
@Data
public class UserInfo {

    /**
     * 流水號
     */
    private Long id;

    /**
     * 名
     */
    private String firstName;

    /**
     * 姓氏
     */
    private String lastName;

    /**
     * 性別: 0-無性別, 1-男, 2-女
     */
    private Integer gender;

    /**
     * 生日
     */
    private LocalDate birthday;

    /**
     * 電子信箱
     */
    private String email;
}
