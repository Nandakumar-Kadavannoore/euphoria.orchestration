package com.euphoria.orchestration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EuphoriaOrchestrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(EuphoriaOrchestrationApplication.class, args);
	}

}
