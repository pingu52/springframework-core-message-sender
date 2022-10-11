package com.nhnacademy.edu.springframework.messagesender.xml;

import com.nhnacademy.edu.springframework.messagesender.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlMain {

    public static void main(String [] args){
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {
            MessageSender SmsMessageSender = context.getBean("SmsMessageSender", MessageSender.class);
            MessageSender EmailMessageSender = context.getBean("EmailMessageSender", MessageSender.class);

            SmsMessageSender.sendMessage(new User("a","a"),"a");
            EmailMessageSender.sendMessage(new User("a","aa"),"aaaa");


        }
    }
}
