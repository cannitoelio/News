package com.coding.challenge.news.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
@Component
public class MessageUtils {

    @Autowired
    private ApplicationContext applicationContext;

    private static MessageUtils instance;

    @PostConstruct
    public void registerInstance() {
        instance = this;
    }
    public static String getMessage(String message){
        return MessageUtils.getBean(MessageSource.class).getMessage(message,null,null);
    }

    public static <T> T getBean(Class<T> clazz) {
        return instance.applicationContext.getBean(clazz);
    }
}
