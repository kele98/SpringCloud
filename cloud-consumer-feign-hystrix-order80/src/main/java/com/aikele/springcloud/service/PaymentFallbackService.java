package com.aikele.springcloud.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "openfeign调用失败";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "openfeign调用失败";
    }
}
