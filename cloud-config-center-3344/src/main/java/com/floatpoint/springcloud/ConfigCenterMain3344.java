package com.floatpoint.springcloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
/**
 * @author wsk
 * @date 2020/3/15 21:35
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterMain3344 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterMain3344.class,args);
    }
}

// 通过命令 curl -X POST "http://localhost:3344/actuator/bus-refresh" 通知bus中心来刷新客户端的配置文件。全局刷新
// 通过命令 curl -X POST "http://localhost:3344/actuator/bus-refresh/${spring.application.name}:${server.port}" 通知bus中心来刷新客户端的配置文件。指定微服务刷新