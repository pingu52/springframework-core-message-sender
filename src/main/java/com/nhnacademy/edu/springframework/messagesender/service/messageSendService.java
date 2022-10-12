package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.SMS;
import com.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class messageSendService {


    private final MessageSender messageSender;

    @Value("${from}")
    private String name;

    public messageSendService(@Autowired @SMS MessageSender messageSender){
        System.out.println("constructor injection@@@@@");
        this.messageSender =messageSender;
    }
    //public messageSendService(){}*/
    /*@Autowired //setter injection
    @Required
    public void setSmsMessageSender(MessageSender messageSender){
        System.out.println("setMessageSender!!!");
        this.messageSender=messageSender;

    }*/

    public void doSendMessage(){
        System.out.println("from : "+ name);
       messageSender.sendMessage(new User("a@a.a","010-9470-9296"),"hello");
    }
}
