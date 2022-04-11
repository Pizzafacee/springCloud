package com.atguigu.springCloud.service;

import com.atguigu.springCloud.entity.ReturnObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(value = "cloud-provider-payment8001")
public interface PaymentOpenFeignService {
    @RequestMapping("/queryPaymentById/{id}")
    public ReturnObject queryPaymentById(@PathVariable("id") Long id);
}
