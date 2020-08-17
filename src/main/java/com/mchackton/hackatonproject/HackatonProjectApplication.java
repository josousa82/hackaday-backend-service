package com.mchackton.hackatonproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.mchackton")
public class HackatonProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(HackatonProjectApplication.class, args);
    }
}
