package com.example.userms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication

public class UserMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserMsApplication.class, args);
	}

}
