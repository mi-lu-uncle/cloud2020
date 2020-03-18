package com.floatpoint.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class LogLevel {

  @Bean
  Logger.Level feignLoggerLevel(){
    return Logger.Level.FULL;
  }
}
