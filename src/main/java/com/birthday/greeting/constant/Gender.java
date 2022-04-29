package com.birthday.greeting.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 性別
 *
 * @author HY Lin
 * @since 2022/4/29 6:50 PM
 */
@AllArgsConstructor
public enum Gender {

    /**
     * 0-無性別
     * 1-男
     * 2-女
     */
    NON(0),
    MALE(1),
    FEMALE(2);

    @Getter
    private final Integer code;

}
