package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.User;

public class messageSendService {

    private MessageSender messageSender;

    /*public messageSendService(MessageSender messageSender){
        this.messageSender =messageSender;
    }
    public messageSendService(){}*/
    public void setSmsMessageSender(MessageSender messageSender){
        System.out.println("setMessageSender!!!");
        this.messageSender=messageSender;

    }

    public void doSendMessage(){
       messageSender.sendMessage(new User("a@a.a","010-9470-9296"),"hello");
    }
}
