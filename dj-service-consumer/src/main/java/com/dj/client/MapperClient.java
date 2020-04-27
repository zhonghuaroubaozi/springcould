package com.dj.client;

import com.dj.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author Programmer Dj
 * @Date 2020/4/26 13:47
 * @Version 1.0
 */
@FeignClient(value = "service-provider", fallback = MapperClientFallBack.class) // 标注该类是一个feign接口
public interface MapperClient {
    @GetMapping("user/{id}")
    User queryById(@PathVariable("id") Integer id);
}
