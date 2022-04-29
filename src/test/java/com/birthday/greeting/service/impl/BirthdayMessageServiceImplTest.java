package com.birthday.greeting.service.impl;

import com.birthday.greeting.dto.request.BirthdayMessageDTO;
import com.birthday.greeting.service.BirthdayMessageService;
import com.birthday.greeting.vo.BirthdayMessageVO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Description
 *
 * @author HY Lin
 * @since 2022/4/28 1:41 AM
 */
@SpringBootTest
class BirthdayMessageServiceImplTest {

    @Autowired
    private BirthdayMessageService birthdayMessageService;

    @BeforeEach
    void setUp() {
    }

    @Test
    void getBirthdayMessage() {
        BirthdayMessageDTO request = new BirthdayMessageDTO();
        request.setBirthday("08-08");
        List<BirthdayMessageVO> results = birthdayMessageService.getBirthdayMessage(request);
        assertNotNull(results);
        assertEquals(2, results.size());
    }
}