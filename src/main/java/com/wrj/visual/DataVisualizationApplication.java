package com.wrj.visual;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wrj.visual.mapper")
public class DataVisualizationApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataVisualizationApplication.class, args);
    }

}
