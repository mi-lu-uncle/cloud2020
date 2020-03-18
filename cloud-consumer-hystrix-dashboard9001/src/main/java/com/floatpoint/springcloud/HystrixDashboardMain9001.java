package com.floatpoint.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
//@SpringCloudApplication
public class HystrixDashboardMain9001 {

  public static void main(String[] args) {
    SpringApplication.run(HystrixDashboardMain9001.class,args);
  }
}
