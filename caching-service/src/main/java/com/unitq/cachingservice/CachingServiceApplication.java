package com.unitq.cachingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CachingServiceApplication {

	public static void main(String[] args) {

		System.out.println("Starting Caching service");
		SpringApplication.run(CachingServiceApplication.class, args);
	}

}
