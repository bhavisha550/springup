package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("heyyy");
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Child child1 =(Child) context.getBean("child1");
        System.out.println(child1);


    }
}
