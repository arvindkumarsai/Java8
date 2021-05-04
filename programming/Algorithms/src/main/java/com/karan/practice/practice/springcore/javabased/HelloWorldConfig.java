package com.karan.practice.practice.springcore.javabased;

import com.karan.practice.practice.springcore.javabased.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {

    @Bean
    public HelloWorld helloWorld()
    {
        return new HelloWorld();
    }
}
