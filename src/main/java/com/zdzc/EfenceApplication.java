package com.zdzc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.zdzc.**")
@MapperScan("com.zdzc.dao")
public class EfenceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfenceApplication.class, args);
	}


}
