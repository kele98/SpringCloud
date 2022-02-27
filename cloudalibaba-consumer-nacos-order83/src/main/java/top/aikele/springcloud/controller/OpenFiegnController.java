package top.aikele.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.aikele.springcloud.services.Test;

@RestController
public class OpenFiegnController {
    @Autowired
    Test test;
    @RequestMapping("/payment/get/{id}")
    public Long test (@PathVariable Long id){
     return test.get(id);
    }
}
