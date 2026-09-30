package com.example.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.beans.Student;

@Configuration
public class StdConfig implements CommandLineRunner{

	@Bean
	 Student stdobj() {
		return new Student();
	}

	@Override
	public void run(String... args) throws Exception {
		Student std=new Student();
		std.setId(1);
		std.setName("sinu");
		std.print();
	}
	
	
}
