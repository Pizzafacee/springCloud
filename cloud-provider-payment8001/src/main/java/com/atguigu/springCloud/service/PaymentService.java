package com.atguigu.springCloud.service;

import com.atguigu.springCloud.entity.Payment;

public interface PaymentService {
   int savePayment(Payment payment);

   Payment QueryPayment(Long id);
}
