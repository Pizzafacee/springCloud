package com.atguigu.springCloud.dao;

import com.atguigu.springCloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PaymentDao {
    int insertPayment(Payment payment);

    Payment selectPaymentById(@Param("id") Long id);
}
