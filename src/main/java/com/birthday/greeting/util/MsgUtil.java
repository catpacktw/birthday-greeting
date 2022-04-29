package com.birthday.greeting.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

/**
 * 訊息工具類
 *
 * @author HY Lin
 * @since 2022/4/27 11:43 PM
 */
@Component
public class MsgUtil {
    private static MessageSource messageSource;

    @Autowired
    private MsgUtil(MessageSource messageSource) {
        setMessageSource(messageSource);
    }

    private static void setMessageSource(MessageSource messageSource) {
        MsgUtil.messageSource = messageSource;
    }

    /**
     * 查詢對應訊息
     *
     * @param msgKey 訊息編碼
     */
    public static String get(String msgKey) {
        return get(msgKey, new String[0]);
    }

    /**
     * 查詢對應訊息
     * 支援占位符號
     *
     * @param msgKey 訊息編碼
     * @param args   動態參數
     * @return 對應訊息
     */
    public static String get(String msgKey, String... args) {
        try {
            return messageSource.getMessage(msgKey, args, LocaleContextHolder.getLocale());
        } catch (Exception e) {
            return msgKey;
        }
    }
}
