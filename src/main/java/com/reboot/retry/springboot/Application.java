package com.reboot.retry.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        //SpringApplication.run(Application.class, args);

        //SpringApplication.run(Application.class, args);
        //or
        SpringApplication app = new SpringApplication(Application.class);
        app.run(args);
    }
}
