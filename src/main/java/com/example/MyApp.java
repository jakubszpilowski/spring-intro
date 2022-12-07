package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(myConfiguration.class);

        MessageService messageService = applicationContext.getBean(MyNameMessageService.class);
        MessageService messageService1 = applicationContext.getBean(MyNameMessageService.class);

        System.out.println("Message service: " + messageService.hashCode());
        System.out.println("Message service 2: " + messageService1.hashCode());

        System.out.println(messageService.getMessage());
        System.out.println(messageService1.getMessage());
    }
}
