package com.zhs.jiaochengdemo.user.controller;

import com.zhs.jiaochengdemo.user.entity.UserEntity;
import com.zhs.jiaochengdemo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @Author:
 * @Date: 2020/6/3 14:46
 * @Description:
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/getAll")
    public List<UserEntity> getAll(Map map){
        return userService.getAll(map);
    }

    @RequestMapping("/deleteById")
    public String deleteById(Integer id){
        userService.deleteById(id);
        return "redirect:/index.html";
    }

    @RequestMapping("/save")
    @ResponseBody
    public String save(@RequestBody UserEntity userEntity){
        userService.save(userEntity);
        return "success";
    }
}
