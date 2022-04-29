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
     * 依據生日返回該日生日人祝賀語
     * 假設今天為8/8
     *
     * @param request 生日
     * @return 祝賀語VO
     */
    @GetMapping("/today")
    public ResResult<List<BirthdayMessageVO>> getTodayBirthdayMessage(BirthdayMessageDTO request) {
        if (request.getBirthday() == null) {
            request.setBirthday("08-08");
        }
        return ResResult.ok(birthdayMessageService.getBirthdayMessage(request));
    }
}
