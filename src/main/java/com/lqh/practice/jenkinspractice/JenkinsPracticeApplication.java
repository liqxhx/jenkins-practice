package com.lqh.practice.jenkinspractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@SpringBootApplication
@RestController
public class JenkinsPracticeApplication {
	@GetMapping("/ping")
	public String ping() {
		return "pong ".concat(LocalDateTime.now().toString());
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinsPracticeApplication.class, args);
	}

}
