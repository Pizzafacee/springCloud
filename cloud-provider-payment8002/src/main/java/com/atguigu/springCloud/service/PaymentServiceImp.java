package com.atguigu.springCloud.service;

import com.atguigu.springCloud.dao.PaymentDao;
import com.atguigu.springCloud.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImp implements PaymentService{
    @Autowired
    private PaymentDao paymentDao;


    public int savePayment(Payment payment){
        int i = paymentDao.insertPayment(payment);
        return i;
    }

    @Override
    public Payment QueryPayment(Long id) {
        Payment payment = paymentDao.selectPaymentById(id);
        return payment;
    }
}
