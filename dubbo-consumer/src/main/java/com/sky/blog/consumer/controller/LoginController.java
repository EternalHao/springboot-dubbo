package com.sky.blog.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sky.blog.provider.service.LoginService;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.jms.Destination;
import javax.servlet.http.HttpServletRequest;

/**
 * @Author: hyh
 * @create: 2018-06-09 21:20
 * @Desciption: 登陆接口
 **/
@SuppressWarnings("ALL")
@RestController
public class LoginController {
    @Reference(version = "1.0.0")
    private LoginService loginService;

    @Autowired // 也可以注入JmsTemplate，JmsMessagingTemplate对JmsTemplate进行了封装
    private JmsMessagingTemplate jmsTemplate;

    @RequestMapping("/login")
    public String login(HttpServletRequest request){
        //loginService.login();
        Destination destination = new ActiveMQQueue("login.queue");
        jmsTemplate.convertAndSend(destination, "login");
        return "登陆成功";
    }

    @JmsListener(destination = "out.queue")
    public void receive(String text){
        System.out.println("收到回复信息"+text);
    }
}
