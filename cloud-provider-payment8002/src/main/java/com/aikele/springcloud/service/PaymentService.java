package com.aikele.springcloud.service;

import com.aikele.springcloud.entities.Payment;

public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentByID(Long id);
}
