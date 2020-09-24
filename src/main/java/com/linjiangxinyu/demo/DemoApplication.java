package com.linjiangxinyu.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("hello world");
        int a = 0;
        int b = 4;
        if (b==3){
            System.out.println("hello world1");
        }
    }

}
