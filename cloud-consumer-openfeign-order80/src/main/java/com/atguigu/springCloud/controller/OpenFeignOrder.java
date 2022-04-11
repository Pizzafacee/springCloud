package com.atguigu.springCloud.controller;


import com.atguigu.springCloud.entity.ReturnObject;
import com.atguigu.springCloud.service.PaymentOpenFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenFeignOrder {
    @Autowired
    private PaymentOpenFeignService paymentOpenFeignService;
    @RequestMapping("/consumer/getPaymentById/{id}")
    public ReturnObject getPaymentById(@PathVariable(value = "id") Long id){
        ReturnObject returnObject = paymentOpenFeignService.queryPaymentById(id);
        return returnObject;
    }
}
