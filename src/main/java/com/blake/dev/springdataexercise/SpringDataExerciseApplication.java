package com.blake.dev.springdataexercise;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
@MapperScan("com.blake.dev.springdataexercise.mapper")
public class SpringDataExerciseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataExerciseApplication.class, args);
    }
}
