package com.sapient.departmentcatalogue.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sapient.departmentcatalogue.models.DepartmentDescription;
@FeignClient("department-description")
//@FeignClient (name="department-description", url = "http://localhost:8082/")
public interface DepartmentDescriptionServiceClient {
	
	@GetMapping("department-description-api/{id}")
	public DepartmentDescription getDepartmentDescription(@PathVariable Long id);

}
