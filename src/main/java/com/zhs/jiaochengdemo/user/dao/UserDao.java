package com.zhs.jiaochengdemo.user.dao;

import com.zhs.jiaochengdemo.user.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @Author:
 * @Date: 2020/6/3 14:48
 * @Description:
 */
@Mapper
public interface UserDao {
    List<UserEntity> getAll(@Param("content") Map map);

    void deleteById(Integer id);

    public void save(UserEntity userEntity);
}
