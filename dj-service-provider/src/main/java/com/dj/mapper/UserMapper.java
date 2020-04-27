package com.dj.mapper;

import com.dj.domain.User;
import org.apache.ibatis.annotations.Mapper;


/**
 * @Author Programmer Dj
 * @Date 2020/3/21 15:12
 * @Version 1.0
 */
@Mapper
public interface UserMapper {
    public User queryUserById(Integer id);
}
