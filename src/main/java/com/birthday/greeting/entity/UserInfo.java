package com.birthday.greeting.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

/**
 * 使用者Entity
 *
 * @author HY Lin
 * @since 2022/4/27 10:39 PM
 */
@Data
@Document
@AllArgsConstructor
public class UserInfo {

    /**
     * 流水號
     */
    @Id
    private String id;

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
