package com.sapient.departmentcatalogue.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sapient.departmentcatalogue.models.Department;
import com.sapient.departmentcatalogue.models.DepartmentCatalogue;
import com.sapient.departmentcatalogue.models.DepartmentCount;
import com.sapient.departmentcatalogue.models.DepartmentDescription;

@RestController
@RequestMapping("department-catalogue-api/")
public class DepartmentCatalogueController {
	private List<DepartmentCatalogue> deptCatalogueList = Arrays.asList(
															new DepartmentCatalogue(1L, "Java"),
															new DepartmentCatalogue(2L, "JavaScript"),
															new DepartmentCatalogue(3L, "Python"));
	
	/*
	 * @Autowired private RestTemplate restTemplate;
	 */
	/*
	 * @Autowired private DepartmentCountServiceClient deptCountServiceClient;
	 * 
	 * @Autowired private DepartmentDescriptionServiceClient deptDescServiceClient;
	 */
	
	@Autowired
	private RestTemplate restTemplate;
	@GetMapping("info/{id}")
	private Department getDeptInformations(@PathVariable Long id) {
		
		
		
		  DepartmentCount deptCount =
		  this.restTemplate.getForObject("http://department-count/department-count-api/"+
		  id, DepartmentCount.class ); DepartmentDescription deptDesc =
		  this.restTemplate.getForObject(
		  "http://department-description/department-description-api/"+id,
		  DepartmentDescription.class);
		 
		 
		/*
		 * String departmentCountApiUrl =
		 * discoveryClient.getNextServerFromEureka("department-count",
		 * false).getHomePageUrl(); String departmentDescApiUrl =
		 * discoveryClient.getNextServerFromEureka("department-description",
		 * false).getHomePageUrl();
		 * System.err.println("departmentCountApiUrl: "+departmentCountApiUrl);
		 * System.err.println("departmentDescApiUrl: "+departmentDescApiUrl);
		 * 
		 * DepartmentCount deptCount = this.restTemplate.getForObject(
		 * departmentCountApiUrl+"/department-count-api/"+id, DepartmentCount.class );
		 * DepartmentDescription deptDesc = this.restTemplate.getForObject(
		 * departmentDescApiUrl+"/department-description-api/"+id,
		 * DepartmentDescription.class);
		 */
		
		
		/*
		 * DepartmentCount deptCount =
		 * this.deptCountServiceClient.getDepartmentCount(id); DepartmentDescription
		 * deptDesc = this.deptDescServiceClient.getDepartmentDescription(id);
		 */
		
		Optional<DepartmentCatalogue> optionalDeptCatalogue = this.deptCatalogueList.stream().filter(e->e.getId().equals(id)).findFirst();
		DepartmentCatalogue deptCatalogue = new DepartmentCatalogue();
		if(optionalDeptCatalogue.isPresent())deptCatalogue = optionalDeptCatalogue.get();
		Department department = new Department();
		department.setId(id);
		department.setDeptName(deptCatalogue.getName());
		department.setNoOfEmployees(deptCount.getNoOfEmployees());
		department.setDeptDescription(deptDesc.getDescription());
		return department;
	}

}
