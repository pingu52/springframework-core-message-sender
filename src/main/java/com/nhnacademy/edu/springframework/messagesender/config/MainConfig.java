package com.nhnacademy.edu.springframework.messagesender.config;

import com.nhnacademy.edu.springframework.messagesender.EmailMessageSender;
import com.nhnacademy.edu.springframework.messagesender.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.smsMessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.messageSendService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;


@Configuration
//@ImportResource("classpath:/beans.xml")
public class MainConfig {

    @Bean(destroyMethod = "shutdown")
    public MessageSender smsMessageSender(){
        return new smsMessageSender();
    }

    @Bean(destroyMethod = "shutdown")
    public MessageSender emailMessageSender(){
        return new EmailMessageSender();
    }



/*    @Bean
    public messageSendService messageSendService(){
        return new messageSendService(e);
    }*/



}
