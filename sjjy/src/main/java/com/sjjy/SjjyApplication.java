package com.sjjy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sjjy.mapper")
public class SjjyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SjjyApplication.class, args);
    }

}
