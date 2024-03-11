package com.learningSpring17.learnspringframework17.helloworld;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class App02helloWorldSpring {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(HelloWorldConfig.class)) {
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("person1"));
            System.out.println(context.getBean("personMethodCall"));
        }
    }
}
