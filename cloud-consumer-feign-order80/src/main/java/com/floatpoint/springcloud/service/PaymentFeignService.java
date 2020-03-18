package com.floatpoint.springcloud.service;

import com.floatpoint.springcloud.entities.CommonResult;
import com.floatpoint.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient("CLOUD-PROVIDER-SERVICE")
public interface PaymentFeignService {

  @GetMapping(value = "/payment/get/{id}")
  CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

  @GetMapping(value = "/payment/feign/timeout")
  String paymentFeignTimeout();
}
