# springboot + dubbo 框架持续集成

# 项目描述
## 本项目是分布式框架从零开始搭建，打造一套属于自己的分布式系统，亲身实践项目搭建中的各个环节！

# 命名规范
## 1.所有包名从com.sky.blog开始

# 数据库
##表名：sky_user
##列名 id、name、password
## 第一天
###任务：
1.搭建SpringBoot+dubbo基本框架，构建三个服务：
* api:dubbo提供接口服务
* consumer：服务消费方
* provider：服务提供方（名称前面加入dubbo）

2.编写登陆服务
api中指定实体类，服务接口,

## 第二天
### 任务：
1.引入Redis作为项目缓存
2.引入消息中间件activemq
3.引入lombak，让代码更加简洁




###项目依赖

#一、引入mybatis,并启动逆向工程建立表
[mybatis及逆向工程](http://www.baidu.com)
https://blog.csdn.net/winter_chen001/article/details/77249029
#二、使用Druid连接池，并查看SQL执行效果
https://www.jianshu.com/p/1fa6797a21b7
https://github.com/WinterChenS、
必须用druid，不能用druid-spring-boot-start
#三、引入缓存redis
springboot 数据访问329页
https://blog.csdn.net/ai88030669/article/details/78686403


https://www.jianshu.com/p/dd5349ac8473（lombak）
https://www.cnblogs.com/bigben0123/p/7779357.html(springboot+aop)


