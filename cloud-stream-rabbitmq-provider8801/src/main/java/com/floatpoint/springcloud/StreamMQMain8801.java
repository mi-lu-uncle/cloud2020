package com.floatpoint.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @auther zzyy
 * @create 2020-02-22 10:54
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamMQMain8801
{
    public static void main(String[] args)
    {
        SpringApplication.run(StreamMQMain8801.class,args);
    }
}
