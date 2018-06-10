package com.sky.blog.provider.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.sky.blog.provider.service.LoginService;
import com.sky.blog.provider.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;


/**
 * @Author: hyh
 * @create: 2018-06-09 20:35
 * @Desciption: 登陆服务
 **/
@Service(version = "1.0.0")  //dubbo自己的注解
public class LoginServiceImpl implements LoginService {
    @Autowired
    private RedisUtil redisUtil;
    @Override
    @JmsListener(destination = "login.queue")
    @SendTo("out.queue")
    public String login(String text) {
        System.out.println("收到登陆请求"+text);
        return "return message"+"haha";
    }

    public void redisTest(){
        redisUtil.set("hao","yong");
        System.out.println(redisUtil.get("hao"));
    }
}
