package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        MessageService messageService = applicationContext.getBean("messageService", MessageService.class);
        MessageService messageService1 = applicationContext.getBean("randomMessageService", MessageService.class);

        System.out.println("Message service: " + messageService.hashCode());
        System.out.println("Message service 2: " + messageService1.hashCode());

        System.out.println(messageService.getMessage());
        System.out.println(messageService1.getMessage());

        applicationContext.close();
    }
}
