package com.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CustomerAccountApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerAccountApiGatewayApplication.class, args);
	    System.out.println("API Gateway Started...");
	}

}
