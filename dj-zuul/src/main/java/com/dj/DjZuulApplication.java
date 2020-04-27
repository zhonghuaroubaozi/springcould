package com.dj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy//启用zuul网管组件
@EnableDiscoveryClient
public class DjZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(DjZuulApplication.class, args);
    }

}
