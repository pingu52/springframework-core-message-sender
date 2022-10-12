package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.config.MainConfig;
import com.nhnacademy.edu.springframework.messagesender.config.ServiceConfig;
import com.nhnacademy.edu.springframework.messagesender.service.messageSendService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigMain {
    public static void main(String[] args) {
        //String basePackage ="com.nhnacademy.edu.springframework.messagesender";
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
            MainConfig.class, ServiceConfig.class);

        messageSendService service = context.getBean("messageSendService",messageSendService.class);


        /*MessageSender smsMessageSender = context.getBean("smsMessageSender",MessageSender.class);
        MessageSender emailMessageSender = context.getBean("emailMessageSender", MessageSender.class);
*/
        User user = new User("a@a.com","1010101");

        /*smsMessageSender.sendMessage(user,"sms sms sms");
        emailMessageSender.sendMessage(user, "email email email");
*/
        context.getBeanFactory().getBeanNamesIterator().forEachRemaining(s->{
            System.out.println(s);
        });
        System.out.println("-----------------------------------");
        service.doSendMessage();
    }
}
