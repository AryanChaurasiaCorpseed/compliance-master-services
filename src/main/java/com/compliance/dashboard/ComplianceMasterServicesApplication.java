package com.compliance.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ComplianceMasterServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComplianceMasterServicesApplication.class, args);
	}

}
