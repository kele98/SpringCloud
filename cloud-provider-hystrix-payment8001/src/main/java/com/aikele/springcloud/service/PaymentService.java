package com.aikele.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class PaymentService {
    /**
     * 正常访问 肯定ok
     * @param id
     * @return
     */
    public String paymentInfo_OK(Integer id){
        return "线程池："+ Thread.currentThread().getName()+"paymentInfo_OK,id  "+id+"\t"+"O(∩_∩)O";
    }
    @HystrixCommand(fallbackMethod = "fallback",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value = "5000"),//超时调用fallback
            @HystrixProperty(name="circuitBreaker.enabled",value = "true"),//是否开启熔断
            @HystrixProperty(name="circuitBreaker.requestVolumeThreshold",value = "10"),//请求次数
            @HystrixProperty(name="circuitBreaker.sleepWindowInMilliseconds",value = "5000"),//时间窗口期
            @HystrixProperty(name="circuitBreaker.errorThresholdPercentage",value = "60")//失败率
    },threadPoolProperties = {
            @HystrixProperty(name = "coreSize", value = "1"),
            @HystrixProperty(name = "maxQueueSize", value = "1")
    })
    public String paymentInfo_TimeOut(Integer id){
        int time = 3;
        try {
            Thread.sleep(time*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(id>0)
            return "线程池："+ Thread.currentThread().getName()+"paymentInfo_OK,id  "+id+"\t"+"O(∩_∩)O ";
        else
            throw new RuntimeException("运行异常");
//        return "线程池："+ Thread.currentThread().getName()+"paymentInfo_OK,id  "+id+"\t"+"O(∩_∩)O  耗时:"+time;
    }
    public String fallback(Integer id){
        return "线程池："+ Thread.currentThread().getName()+"系统繁忙，请稍后再试,id  "+id+"\t"+"/(ㄒoㄒ)/~~";
    }
}
