package com.mq.githubtest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.mq.githubtest.dao")
public class GithubtestApplication {

    public static void main(String[] args) {
        SpringApplication.run(GithubtestApplication.class, args);
    }

}
