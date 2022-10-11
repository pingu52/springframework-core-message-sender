package com.nhnacademy.edu.springframework.messagesender;

public class SmsMessageSender implements MessageSender{
    public void sendMessage(User user,String message){
        System.out.println("sms :"+user.getPhoneNumber()+" : "+ message);
    }
}