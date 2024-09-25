package com.leemuzi.weblog.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.leemuzi.weblog.auth.mapper")
public class WeblogAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeblogAuthApplication.class, args);
    }

}
