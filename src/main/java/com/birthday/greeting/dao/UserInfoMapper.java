package com.birthday.greeting.dao;

import com.birthday.greeting.po.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 使用者Mapper
 *
 * @author HY Lin
 * @since 2022/4/27 10:39 PM
 */
@Mapper
public interface UserInfoMapper {

    /**
     * 依據年紀查詢
     *
     * @param ageInterval 年紀
     * @return 該天生日之User
     */
    List<UserInfo> findByBirthday(@Param("age_interval") String ageInterval);
}
