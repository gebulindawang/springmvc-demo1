package com.hmall.springmvcdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringmvcDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringmvcDemoApplication.class, args);
    }


    public String logout(){
        System.out.println("登出成功");
        return "logout success";

    }
}
