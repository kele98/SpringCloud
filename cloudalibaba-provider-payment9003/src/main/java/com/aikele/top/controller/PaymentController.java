package com.aikele.top.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    @RequestMapping("/payment/{id}")
    public String payment(@PathVariable("id") int id){
        System.out.println("id为:"+id+",被"+Thread.currentThread().getName()+"成功被调用");
        return "success";
    }
}
