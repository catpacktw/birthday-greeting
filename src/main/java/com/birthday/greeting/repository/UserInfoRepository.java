package com.birthday.greeting.repository;

import com.birthday.greeting.entity.UserInfo;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * User Info
 *
 * @author HY Lin
 * @since 2022/4/29 10:34 PM
 */
public interface UserInfoRepository extends MongoRepository<UserInfo, String> {

    /**
     * 依據生日查詢User
     *
     * @param birthdayMonthDay 生日(月-日)
     * @return User List
     */
    @Aggregation(pipeline = {"{$addFields: { \"monthDay\":  {$dateToString:{format: \"%m-%d\", date: \"$birthday\"}}}}",
            "{$match :  { monthDay:  {$eq: \"08-08\"}}}"})
    AggregationResults<UserInfo> getUserInfosByBirthdayMonthDay(String birthdayMonthDay);
}
