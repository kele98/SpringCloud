package com.aikele.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NacosController {
    @Value("${server.port}")
    String port;
    @GetMapping("/payment/get/{id}")
    public Long get(@PathVariable("id") Long id){
        System.out.println(port+"被访问");
        return id;
    }
}
