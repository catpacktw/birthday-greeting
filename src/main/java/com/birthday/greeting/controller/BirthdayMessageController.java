package com.birthday.greeting.controller;

import com.birthday.greeting.dto.ResResult;
import com.birthday.greeting.dto.request.BirthdayMessageDTO;
import com.birthday.greeting.service.BirthdayMessageService;
import com.birthday.greeting.vo.BirthdayMessageVO;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 生日祝賀語Controller
 *
 * @author HY Lin
 * @since 2022/4/27 10:10 PM
 */
@AllArgsConstructor
@RestController
@RequestMapping("/birthday-message")
public class BirthdayMessageController {

    private final BirthdayMessageService birthdayMessageService;

    /**
     * 向x歲以上使用者發送祝賀信
     * 假設為49歲
     *
     * @param request 年齡
     * @return 祝賀語VO
     */
    @GetMapping("/today")
    public ResResult<List<BirthdayMessageVO>> getTodayBirthdayMessage(BirthdayMessageDTO request) {
        if (request.getAge() == null) {
            request.setAge(49);
        }
        return ResResult.ok(birthdayMessageService.getBirthdayMessage(request));
    }
}
