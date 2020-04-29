package com.company.virtusa.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.company.virtusa.web")

public class Virlogin {
	 public static void main(String[] args) {
	        SpringApplication.run(Virlogin.class, args);
	    }
}
