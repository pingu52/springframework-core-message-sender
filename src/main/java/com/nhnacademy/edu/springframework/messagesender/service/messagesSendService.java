package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class messagesSendService {

    private final List<MessageSender> messageSenders;

    @Autowired
    public messagesSendService(List<MessageSender> messageSenders){

        this.messageSenders = messageSenders;
    }

    public void domessages(){

    }
}
