package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.service.messageSendService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjectionMain {

    /**
     *
     * Spring DI 실습 Constructor(생성자)
     */
    public static void main(String [] args){
        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")){
            messageSendService service =context.getBean("MessageSendService", messageSendService.class);
            service.doSendMessage();
        }
    }
}
