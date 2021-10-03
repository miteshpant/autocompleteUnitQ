package com.unitq.hystrix.dashboard;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrixDashboard
@Slf4j
public class HystrixDashboardApplication {

	public static void main(String[] args) {

		log.info("Starting Hystrix dashboard service");
		SpringApplication.run(HystrixDashboardApplication.class, args);
	}

}
