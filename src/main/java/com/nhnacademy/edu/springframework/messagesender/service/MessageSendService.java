package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.User;

public class MessageSendService{

    private MessageSender messageSender;

    public MessageSendService(MessageSender messageSender){
        this.messageSender = messageSender;
    }

    public void doSendMessage(){
        messageSender.sendMessage(new User("a@a.a","010-9470-9296"),"hello");
    }
}
