package com.newheart.springcloud.eurkaserver.eurkaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
/**
 * @EnableEurekaServer 启动注册中心
 */
public class EurkaserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurkaserverApplication.class, args);
    }

}
