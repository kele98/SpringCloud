package com.aikele.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
@RefreshScope
public class SentinelController {
    @Value("${name}")
    private String name;
    @RequestMapping("/getNameA")
    @SentinelResource(value = "test",blockHandler = "defaultHandler")
    public String getNameA(String k,String v){
        return name;
    }
    public String defaultHandler(String id, BlockException ex){
        return "发生了异常！";
    }
    public String defaultException(String id,Throwable ex){
        return "发生了"+ex.toString()+"错误";
    }
    @RequestMapping("/getNameB/{id}")
    public String getNameB(@PathVariable("id") String id){
        return name;
    }
    @SentinelResource(value = "getNameC",blockHandler = "defaultHandler",fallback = "defaultException")
    @RequestMapping("/getNameC/{id}")
    public String getNameC(@PathVariable("id") String id){
        System.out.println(10/0);
        return id;
    }

}
