package com.dj;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.netflix.ribbon.RibbonLoadBalancerClient;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author Programmer Dj
 * @Date 2020/4/25 16:39
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DjServiceConsumerApplication.class)
public class LoadBalanceTest {
    @Autowired
    private RibbonLoadBalancerClient client;
    @Test
    public void testLoadBalance(){
        for (int i = 0; i < 100; i++) {
            ServiceInstance instance = this.client.choose("service-provider");
            System.out.println(instance.getHost() + ":" +instance.getPort());
        }
    }
}
