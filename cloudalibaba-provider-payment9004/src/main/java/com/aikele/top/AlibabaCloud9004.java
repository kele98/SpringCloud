package com.aikele.top;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaCloud9004 {
    public static void main(String[] args) {
         SpringApplication.run(AlibabaCloud9004.class);
    }
}
