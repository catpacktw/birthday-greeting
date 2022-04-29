package com.birthday.greeting.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * 生日祝賀語查詢參數封裝
 *
 * @author HY Lin
 */
@Data
@NoArgsConstructor
public class BirthdayMessageDTO {

    /**
     * 生日
     */
    private String birthday;

}
