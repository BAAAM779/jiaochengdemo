package com.zhs.jiaochengdemo.user.service;

import com.zhs.jiaochengdemo.user.entity.UserEntity;

import java.util.List;
import java.util.Map;

/**
 * @Author:
 * @Date: 2020/6/3 14:47
 * @Description:
 */
public interface UserService {
    List<UserEntity> getAll(Map map);

    void deleteById( Integer id);

    public void save(UserEntity userEntity);
}
