package com.sapient.departmentdescription.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.departmentdescription.models.DepartmentDescription;

@RestController
@RequestMapping("department-description-api/")
public class DepartmentDescriptionController {
	
	private List<DepartmentDescription> deptDescList =  Arrays.asList(
														new DepartmentDescription(1L, "Java Department"),
														new DepartmentDescription(2L, "JavaScript Department"),
														new DepartmentDescription(3L, "Python Department"));
	@GetMapping("{id}")
	private DepartmentDescription getById(@PathVariable Long id) {
		
		Optional<DepartmentDescription> optionDeptDesc = this.deptDescList.stream().filter(e->e.getId().equals(id)).findFirst();
		if(optionDeptDesc.isPresent())
			return optionDeptDesc.get();
		return null;
	}

}
