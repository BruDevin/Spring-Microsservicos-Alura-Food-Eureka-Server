package com.example.alurafoodeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AlurafoodeurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlurafoodeurekaserverApplication.class, args);
	}

}
