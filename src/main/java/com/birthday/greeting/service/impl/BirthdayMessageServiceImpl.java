package com.birthday.greeting.service.impl;

import com.birthday.greeting.constant.MsgCode;
import com.birthday.greeting.dto.request.BirthdayMessageDTO;
import com.birthday.greeting.entity.UserInfo;
import com.birthday.greeting.repository.UserInfoRepository;
import com.birthday.greeting.service.BirthdayMessageService;
import com.birthday.greeting.util.MsgUtil;
import com.birthday.greeting.vo.BirthdayMessageVO;
import lombok.AllArgsConstructor;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
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

    private final UserInfoRepository userInfoRepository;

    @Override
    public List<BirthdayMessageVO> getBirthdayMessage(BirthdayMessageDTO request) {
        AggregationResults<UserInfo> users = userInfoRepository.getUserInfosByBirthdayMonthDay(request.getBirthday());
        if (CollectionUtils.isEmpty(users.getMappedResults())) {
            return new ArrayList<>();
        }
        return users.getMappedResults().stream().map(user ->
                        new BirthdayMessageVO(MsgUtil.get(MsgCode.BIRTHDAY_SUBJECT), MsgUtil.get(MsgCode.BIRTHDAY_MESSAGE, user.getFirstName())))
                .collect(Collectors.toList());
    }
}
