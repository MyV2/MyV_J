package com.nogiveup.myv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class MyVApplication {
	@GetMapping("/")
	public static void main(String[] args) {
		SpringApplication.run(MyVApplication.class, args);
	}

}
