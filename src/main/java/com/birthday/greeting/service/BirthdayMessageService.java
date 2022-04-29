package com.birthday.greeting.service;

import com.birthday.greeting.dto.request.BirthdayMessageDTO;
import com.birthday.greeting.vo.BirthdayMessageVO;

import java.util.List;

/**
 * 生日祝賀語Service
 *
 * @author HY Lin
 * @since 2022/4/27 11:16 PM
 */
public interface BirthdayMessageService {

    /**
     * 依據請求條件返回生日祝賀訊息
     *
     * @param request 請求條件
     * @return 祝賀訊息封裝VO
     */
    List<BirthdayMessageVO> getBirthdayMessage(BirthdayMessageDTO request);
}
