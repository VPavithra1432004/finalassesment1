package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class Assesment12Application {

	public static void main(String[] args) {
		SpringApplication.run(Assesment12Application.class, args);
	}
	@GetMapping("/assesment1")
	public String assesment1() {
		return "Welcome to Assesment one ";
	}
	@GetMapping("/process")
	public String process() {
		return "The assesment is on process";
	}
	@GetMapping("/done")
	public String done() {
		return "The is assesment is succesfully completed";
	}
}
