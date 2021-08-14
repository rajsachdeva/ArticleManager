package com.article;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ArticlemasterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArticlemasterApplication.class, args);
	}
}
