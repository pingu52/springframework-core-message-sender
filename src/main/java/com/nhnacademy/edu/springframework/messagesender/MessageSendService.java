package com.nhnacademy.edu.springframework.messagesender;

public class MessageSendService {

    private MessageSender messageSender;

    public MessageSendService(MessageSender messageSender){
        this.messageSender = messageSender;
    }

    public void doSendMessage(){
        messageSender.sendMessage(new User("a@a.a","010-9470-9296"),"hello");
    }
}
