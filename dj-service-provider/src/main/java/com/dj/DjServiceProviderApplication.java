package com.dj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DjServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DjServiceProviderApplication.class, args);
    }

}
