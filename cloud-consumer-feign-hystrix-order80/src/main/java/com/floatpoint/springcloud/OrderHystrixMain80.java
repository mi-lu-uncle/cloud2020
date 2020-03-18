package com.floatpoint.springcloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
/**
 * @author wsk
 * @date 2020/3/14 10:09
 */
@SpringBootApplication
@EnableFeignClients //开启feign
@EnableHystrix //开启服务熔断 Hystrix
@EnableEurekaClient
public class OrderHystrixMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixMain80.class,args);
    }
}