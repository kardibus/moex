package com.kardibus.moex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;


@SpringBootApplication
public class MoexApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoexApplication.class, args);
    }
}
