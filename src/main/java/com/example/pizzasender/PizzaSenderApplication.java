package com.example.pizzasender;

// PizzaSenderApplication.java

import com.example.pizzasender.applicationController.RestTemplateConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(RestTemplateConfig.class)
public class PizzaSenderApplication {

    public static void main(String[] args) {
        SpringApplication.run(PizzaSenderApplication.class, args);
    }
}

