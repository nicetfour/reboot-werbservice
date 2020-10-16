package com.reboot.retry.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

//        SpringApplication.run(Application.class, args);
//        or
//        SpringApplication app = new SpringApplication(Application.class);
//        app.run(args);
    }

//    public static final String APPLICATION_LOCATIONS = "spring.config.location="
//            + "classpath:application.yml,"
//            + "/app/config/reboot-webservice/application.yml";
//            //+ "classpath:application.yml,"
//            //+ "/app/config/springboot-webservice/real-application.yml";
//
//    public static void main(String[] args) {
//
//System.out.println("aaaaplication.java");
//
//        new SpringApplicationBuilder(Application.class)
//                .properties(APPLICATION_LOCATIONS)
//                .run(args);
//    }
}

