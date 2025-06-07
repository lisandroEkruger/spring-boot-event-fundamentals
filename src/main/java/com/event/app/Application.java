package com.event.app;

import com.event.app.publisher.UserPublisher;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner init(UserPublisher userPublisher) {
        return args -> {
            userPublisher.publishUserRegisteredEvent("Santiago", "1234", (byte) 25);
            userPublisher.publishUserRegisteredEvent("Anyi", "4312", (byte) 23);
        };
    }
}
