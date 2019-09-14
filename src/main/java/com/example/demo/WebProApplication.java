package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebProApplication {

	static String name = "Sridhar";
	static String n = staticmethod();
	static {
		System.out.println("staitc block-- "+name);
		
	}
	
	public static String staticmethod() {
		String name = "static";
		System.out.println("static method"+name);
		return name;
	}
	public static void main(String[] args) {
		SpringApplication.run(WebProApplication.class, args);
	}

}
