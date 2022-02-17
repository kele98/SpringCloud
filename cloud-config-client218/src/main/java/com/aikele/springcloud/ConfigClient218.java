package com.aikele.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConfigClient218 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClient218.class);
    }
}
