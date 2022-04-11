package com.atguigu.springCloud.controller;

import com.atguigu.springCloud.entity.Payment;
import com.atguigu.springCloud.entity.ReturnObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;
    public static final String Payment_Url="http://cloud-provider-payment8001/";
    @RequestMapping("/consumer/createPayment")
    public ReturnObject createPayment(Payment payment){
        ResponseEntity<ReturnObject> returnObjectResponseEntity = restTemplate.postForEntity(Payment_Url + "savePayment", payment, ReturnObject.class);
        ReturnObject body = returnObjectResponseEntity.getBody();
        return body;
    }

    @RequestMapping("/consumer/queryPaymentById/{id}")
    public ReturnObject queryPaymentById(@PathVariable("id") Long id){
        ResponseEntity<ReturnObject> forEntity = restTemplate.getForEntity(Payment_Url +"queryPaymentById/"+id, ReturnObject.class);
        ReturnObject body = forEntity.getBody();
        return body;
    }
}
