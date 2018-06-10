package com.sky.blog.provider.aspectj;

import java.lang.annotation.*;

/**
 * @Author: hyh
 * @create: 2018-06-10 20:32
 * @Desciption: 使用注解决设置切入点
 **/
@Target(ElementType.METHOD)//该注解使用在方法声明上
@Retention(RetentionPolicy.RUNTIME)//该注解在运行时使用
//注解不仅被保存到class文件中，jvm加载class文件之后，仍然存在
//也就是说内存中的字节码中也包含该注解
public @interface Action {
    String value();
}
