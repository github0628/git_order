package com.cattlog.module.sel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//构造性注解：这是一个支持rest的控制器，告诉Spring以字符串的形式渲染结果，并直接返回给调用者。
@RestController
//Spring Boot根据添加的jar依赖猜测你想如何配置Spring
@EnableAutoConfiguration
public class Example {
//提供路由信息，它告诉Spring任何来自"/"路径的HTTP请求都应该被映射到home方法
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }

}