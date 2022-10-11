package com.nhnacademy.edu.springframework.messagesender;

public class Main {

    public static void main(String [] args){
        Main main = new Main();
        User user = new User("gudrbs9852@gmail.com", "010-9470-9296");
        main.sendSmsMessage(user, "nai sugoii~");
    }

    private void sendSmsMessage(User user, String message){
        System.out.println("SMS Message Sent to "+user.getPhoneNumber()+" : "+message);
    }

    private void sendEmailMessage(User user, String message){
        System.out.println("Email Message Sent "+user.getEmail()+" : "+message);
    }
}
