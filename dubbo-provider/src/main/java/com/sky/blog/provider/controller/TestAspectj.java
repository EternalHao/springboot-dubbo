package com.sky.blog.provider.controller;

import com.sky.blog.provider.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: hyh
 * @create: 2018-06-10 20:52
 * @Desciption: 测试注解
 **/
@RestController
public class TestAspectj {
    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping("/first")
    public Object first() {
        return "first controller";
    }

    @RequestMapping("/doError")
    public Object error() {
        return 1 / 0;
    }
}
