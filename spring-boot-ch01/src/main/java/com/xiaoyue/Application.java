package com.xiaoyue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by 70883 on 2017/8/22.
 */
@SpringBootApplication(scanBasePackages = "com.xiaoyue")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
