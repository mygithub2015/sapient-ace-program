package com.sapient.departmentcatalogue.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sapient.departmentcatalogue.models.DepartmentCount;
@FeignClient("department-count")
//@FeignClient(name="department-count", url = "http://localhost:8081/")
public interface DepartmentCountServiceClient {
	
	@GetMapping("/department-count-api/{id}")
	public DepartmentCount getDepartmentCount(@PathVariable Long id);
	

}
