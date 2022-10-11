package com.nhnacademy.edu.springframework.messagesender;

public class smsMessageSender implements MessageSender{
    public smsMessageSender(){
        System.out.println("sms init!");
    }
    void init(){
        System.out.println("init method called in SmsMessageSender");
    }
    public void sendMessage(User user,String message){
        System.out.println("sms :"+user.getPhoneNumber()+" : "+ message);
    }
}
