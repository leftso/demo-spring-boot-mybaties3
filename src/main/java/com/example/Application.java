package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = { "com.example.mapper" }) // 自动扫描mapper
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
