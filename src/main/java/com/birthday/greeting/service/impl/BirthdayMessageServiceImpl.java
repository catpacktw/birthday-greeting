package com.birthday.greeting.service.impl;

import com.birthday.greeting.constant.Gender;
import com.birthday.greeting.constant.MsgCode;
import com.birthday.greeting.dao.UserInfoMapper;
import com.birthday.greeting.dto.request.BirthdayMessageDTO;
import com.birthday.greeting.po.UserInfo;
import com.birthday.greeting.service.BirthdayMessageService;
import com.birthday.greeting.util.MsgUtil;
import com.birthday.greeting.vo.BirthdayMessageVO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 生日祝賀語Service
 *
 * @author HY Lin
 * @since 2022/4/27 11:23 PM
 */
@Service
@AllArgsConstructor
public class BirthdayMessageServiceImpl implements BirthdayMessageService {

    private final UserInfoMapper userInfoMapper;

    @Override
    public List<BirthdayMessageVO> getBirthdayMessage(BirthdayMessageDTO request) {
        //query users by inputting birthday
        List<UserInfo> users = userInfoMapper.findByBirthday(request.getBirthday());
        if (CollectionUtils.isEmpty(users)) {
            return new ArrayList<>();
        }
        List<BirthdayMessageVO> results = new ArrayList<>();
        //build message context...
        users.forEach(u -> {
            BirthdayMessageVO result = new BirthdayMessageVO();
            result.setSubject(MsgUtil.get(MsgCode.BIRTHDAY_SUBJECT));
            StringBuilder message = new StringBuilder(MsgUtil.get(MsgCode.BIRTHDAY_MESSAGE, u.getFirstName()));
            if (Gender.MALE.getCode().equals(u.getGender())) {
                message.append(MsgUtil.get(MsgCode.DISCOUNT_MESSAGE, "20%", "White Wine, iPhone X"));
                result.setMessage(message.toString());
            }
            if (Gender.FEMALE.getCode().equals(u.getGender())) {
                message.append(MsgUtil.get(MsgCode.DISCOUNT_MESSAGE, "50%", "Cosmetic, LV Handbags"));
                result.setMessage(message.toString());
            }
            results.add(result);
        });
        return results;
    }
}
