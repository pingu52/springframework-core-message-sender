package com.nhnacademy.edu.springframework.messagesender;

public class EmailMessageSender implements MessageSender{

    public EmailMessageSender(){
        System.out.println("email init!!");
    }
    public void sendMessage(User user, String message){
        System.out.println("email : "+user.getEmail()+" : "+message);
    }

}
