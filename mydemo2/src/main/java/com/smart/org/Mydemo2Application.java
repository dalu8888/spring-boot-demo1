package com.smart.org;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan // 开启通用注解扫描
@ServletComponentScan // 扫描使用注解方式的servlet
@MapperScan("com.smart.org.dao")
public class Mydemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Mydemo2Application.class, args);
	}
}
