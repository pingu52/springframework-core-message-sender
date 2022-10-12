package com.nhnacademy.edu.springframework.messagesender;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationMain {
    public static void main(String[] args) {
        String basePackage ="com.nhnacademy.edu.springframework.messagesender";
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(basePackage);

        MessageSender smsMessageSender = context.getBean("smsMessageSender",MessageSender.class);
        MessageSender emailMessageSender = context.getBean("emailMessageSender", MessageSender.class);
    }
}
