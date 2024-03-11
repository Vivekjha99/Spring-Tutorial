package com.learningSpring17.learnspringframework17.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name,int age){}
@Configuration
public class HelloWorldConfig {
    @Bean
    public String name(){
        return "Vivek";
    }
    public int age(){
        return 23;
    }
    @Bean
    public Person person1(){
        return new Person("Deo",22);
    }
    @Bean
    public Person personMethodCall(){
    return new Person(name(),age());
    }
}

