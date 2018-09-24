package com.yash;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class Ec2testApplication {

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}
	


	public static void main(String[] args) throws Exception {
		System.out.println("Hello Wold App is Building");
		SpringApplication.run(Ec2testApplication.class, args);
	}

}