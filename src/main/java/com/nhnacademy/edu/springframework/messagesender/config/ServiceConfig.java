package com.nhnacademy.edu.springframework.messagesender.config;

import com.nhnacademy.edu.springframework.messagesender.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.messageSendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ServiceConfig {

    @Autowired
    private MainConfig mainConfig;

    @Bean
    public messageSendService messageSendService(){
        return new messageSendService(mainConfig.smsMessageSender());
    }
}
