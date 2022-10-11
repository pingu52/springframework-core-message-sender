package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.service.messageSendService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionMain {

    public static void main(String [] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = new User("b@b.co","10101");
        messageSendService service =context.getBean("messageSendService", messageSendService.class);

        service.doSendMessage();

    }
}
