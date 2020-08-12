package com.ityidongyun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication标注一个主程序类，这是一个springBoot应用
 */
@SpringBootApplication
public class HelloWorldApplication {
    public static void main(String[] args) {
        //spring应用启动起来
        SpringApplication.run(HelloWorldApplication.class,args);
    }
}
