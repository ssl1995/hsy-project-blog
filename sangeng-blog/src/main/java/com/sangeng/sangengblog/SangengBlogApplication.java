package com.sangeng.sangengblog;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com"})
@MapperScan("com.sangeng.sangengframework.mapper")
public class SangengBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(SangengBlogApplication.class, args);
    }

}
