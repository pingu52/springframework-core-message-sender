package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.service.MessageSendService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String [] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:/beans.xml");

        User user = new User("b@b.co","10101");
        context.getBean("EmailMessageSender",MessageSender.class).sendMessage(user,"message");
        context.getBean("EmailMessageSender",MessageSender.class).sendMessage(user,"message");

        System.out.println("------------------------------------------------");
        context.getBean("SmsMessageSender",MessageSender.class).sendMessage(user,"Message");
        context.getBean("SmsMessageSender",MessageSender.class).sendMessage(user,"Message");

        System.out.println("-------------------------------------------------");
        new MessageSendService(context.getBean("EmailMessageSender",MessageSender.class)).doSendMessage();
        new MessageSendService(context.getBean("SmsMessageSender",MessageSender.class)).doSendMessage();

    }
    /**
     * 실습 2
     */
    /*public static void main(String [] args){
        new MessageSendService(new SmsMessageSender()).doSendMessage();
        new MessageSendService(new EmailMessageSender()).doSendMessage();
    }*/

    /**
     * 실습 1
     */
    /*public static void main(String [] args){
        Main main = new Main();
        User user = new User("gudrbs9852@gmail.com", "010-9470-9296");
        main.sendSmsMessage(user, "nai sugoii~");
    }

    private void sendSmsMessage(User user, String message){
        System.out.println("SMS Message Sent to "+user.getPhoneNumber()+" : "+message);
    }

    private void sendEmailMessage(User user, String message){
        System.out.println("Email Message Sent "+user.getEmail()+" : "+message);
    }*/
}
