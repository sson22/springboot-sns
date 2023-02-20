package com.example.springbootsns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringbootSnsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSnsApplication.class, args);
    }

}
