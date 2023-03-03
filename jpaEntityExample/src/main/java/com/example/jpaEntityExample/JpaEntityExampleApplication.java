package com.example.jpaEntityExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JpaEntityExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaEntityExampleApplication.class, args);
	}

	@GetMapping("/greeting")
	public static String greeting(){
		return "Shams";
	}

}
