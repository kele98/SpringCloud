package com.aikele.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NacosController {
    @GetMapping("/payment/get/{id}")
    public Long get(@PathVariable("id") Long id){
        return id;
    }
}
