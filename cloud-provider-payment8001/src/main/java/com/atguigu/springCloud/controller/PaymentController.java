package com.atguigu.springCloud.controller;

import com.atguigu.springCloud.entity.Payment;
import com.atguigu.springCloud.entity.ReturnObject;
import com.atguigu.springCloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/savePayment")
    public ReturnObject<Payment> savePayment(@RequestBody Payment payment){
        int result = paymentService.savePayment(payment);
        log.info("*****插入结果"+ result);
       if(result>0){
           return new ReturnObject(200,"插入数据成功",result);
       }else return new ReturnObject(444,"插入数据失败",null);
    }

    @RequestMapping("/queryPaymentById/{id}")
    public ReturnObject queryPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.QueryPayment(id);
        log.info("****查询结果"+ payment);
        if(payment != null){
            return new ReturnObject(200,"查询数据成功"+ serverPort,payment);
        }else return new ReturnObject(500,"查询失败，重新输入id",null);
    }
}
