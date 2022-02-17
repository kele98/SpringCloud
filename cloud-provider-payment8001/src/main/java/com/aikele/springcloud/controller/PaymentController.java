package com.aikele.springcloud.controller;

import com.aikele.springcloud.entities.CommonResult;
import com.aikele.springcloud.entities.Payment;
import com.aikele.springcloud.service.PaymentService;
import com.netflix.appinfo.InstanceInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @Value("${server.port}")
    private String port;
    @Autowired
    private DiscoveryClient discoveryClient;
    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);

        log.info("------------插入结果:"+result);
        if(result>0){
            return new CommonResult(200,"端口号为："+port+",插入数据成功",result);
        }else {
            return new CommonResult(400,"插入失败");
        }

    }
    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> get(@PathVariable("id") Long id) throws InterruptedException {
        Thread.sleep(1000);
        Payment payment = paymentService.getPaymentByID(id);
        log.info("------------插入结果:"+payment);
        if(payment!=null){
            return new CommonResult(200,"端口号为："+port+",查询成功",payment);
        }else {
            return new CommonResult(400,"查询失败");
        }
    }
    @GetMapping("/payment/discovery")
    public Object discovery(){
        for (String service : discoveryClient.getServices()) {
            log.info("服务"+service);
        }
        for (ServiceInstance instance : discoveryClient.getInstances("cloud-payment-service")) {
            log.info("主机名" + instance.getInstanceId() + "主机地址" + instance.getHost() + "端口号" + instance.getPort());
        }
        return discoveryClient;
    }
}
