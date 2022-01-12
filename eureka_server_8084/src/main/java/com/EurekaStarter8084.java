package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer //标识为erureka服务端
@SpringBootApplication
public class EurekaStarter8084
{
    public static void main(String[] args)
    {
        SpringApplication.run(EurekaStarter8084.class, args);
    }
}