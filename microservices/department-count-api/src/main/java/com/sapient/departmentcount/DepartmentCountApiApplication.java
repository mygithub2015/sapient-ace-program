package com.sapient.departmentcount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DepartmentCountApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentCountApiApplication.class, args);
	}

}
