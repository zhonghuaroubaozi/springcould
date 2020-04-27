package com.dj.client;

import com.dj.domain.User;
import org.springframework.stereotype.Component;

/**
 * @Author Programmer Dj
 * @Date 2020/4/26 14:35
 * @Version 1.0
 */
@Component
public class MapperClientFallBack implements MapperClient {
    @Override
    public User queryById(Integer id) {
        User user = new User();
        user.setUsername("服务器繁忙，请稍后再试！");
        return user;
    }
}
