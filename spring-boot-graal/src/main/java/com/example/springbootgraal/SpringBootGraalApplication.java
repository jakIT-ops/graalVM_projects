package com.example.springbootgraal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(proxyBeanMethods = false)
public class SpringBootGraalApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootGraalApplication.class, args);
    }

}
