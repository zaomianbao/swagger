package com.zaomianbao.swagger.controller;

import com.zaomianbao.swagger.annotation.SwaggerCustomIgnore;
import com.zaomianbao.swagger.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;

/**
 * @Description 用户控制层
 * @Author zaomianbao
 * @Date 2019/1/9
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @SwaggerCustomIgnore
    @GetMapping("/list")
    public Object getUserList(){
        return Arrays.asList(User.builder().age(18).username("枣面包").build());
    }

    @PostMapping("create")
    public Object creteUser(){
        return User.builder().age(18).username("枣面包").build();
    }
}
