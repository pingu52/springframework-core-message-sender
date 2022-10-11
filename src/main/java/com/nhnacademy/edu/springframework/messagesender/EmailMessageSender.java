package com.nhnacademy.edu.springframework.messagesender;

public class EmailMessageSender implements MessageSender{

    public void sendMessage(User user, String message){
        System.out.println("email : "+user.getEmail()+" : "+message);
    }

}
