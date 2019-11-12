package com.sapient.departmentdescription;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DepartmentDescriptionApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentDescriptionApiApplication.class, args);
	}

}
