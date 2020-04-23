package com.hct.comm.sms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
@MapperScan("com.hct.comm.sms.dao")
public class CommSmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommSmsApplication.class, args);
    }

}
