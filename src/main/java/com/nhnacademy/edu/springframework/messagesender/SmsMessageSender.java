package com.nhnacademy.edu.springframework.messagesender;

public class SmsMessageSender implements MessageSender{
    public SmsMessageSender(){
        System.out.println("sms init!");
    }
    public void sendMessage(User user,String message){
        System.out.println("sms :"+user.getPhoneNumber()+" : "+ message);
    }
}
