package com.nhnacademy.edu.springframework.messagesender;

import org.springframework.beans.factory.DisposableBean;

public class EmailMessageSender implements MessageSender, DisposableBean {

    public EmailMessageSender(){
        System.out.println("email init!!");
    }


    public void sendMessage(User user, String message){
        System.out.println("email : "+user.getEmail()+" : "+message);
    }

    @Override
    public void shutdown() {
        System.out.println("call back email shutdown()");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy method called in EmailMessageSender");
    }


}
