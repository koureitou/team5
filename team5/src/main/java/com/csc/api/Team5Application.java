package com.csc.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.csc.api.mapper")
public class Team5Application {

	public static void main(String[] args) {
		SpringApplication.run(Team5Application.class, args);
	}
}
