package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.beans.Student;
import com.example.config.StdConfig;

@SpringBootApplication
public class SpringBoot1Application {

	public static void main(String[] args) throws Exception {
	  ApplicationContext context=SpringApplication.run(SpringBoot1Application.class, args);
	 StdConfig std= context.getBean(StdConfig.class);
	 std.run("");
	 System.out.println(std);
	}

	

}
