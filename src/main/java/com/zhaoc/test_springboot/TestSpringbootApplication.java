package com.zhaoc.test_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class TestSpringbootApplication {
	@RequestMapping("/")
	private String  index(){
		return " this is spring boot demo";
	}

	public static void main(String[] args) {
		SpringApplication.run(TestSpringbootApplication.class, args);
	}
}
