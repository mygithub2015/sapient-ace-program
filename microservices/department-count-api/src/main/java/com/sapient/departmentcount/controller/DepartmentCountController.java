package com.sapient.departmentcount.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.departmentcount.models.DepartmentCount;

@RestController
@RequestMapping("department-count-api/")
public class DepartmentCountController {
	
	private List<DepartmentCount> deptCountList = Arrays.asList(
													new DepartmentCount(1L, 50L),
													new DepartmentCount(2L, 35L),
													new DepartmentCount(3L, 25L));
	@GetMapping("{id}")
	private DepartmentCount getById(@PathVariable Long id) {
		Optional<DepartmentCount> optionalDeptCount = this.deptCountList.stream().filter(e->e.getId().equals(id)).findFirst();
		return (optionalDeptCount.isPresent())?optionalDeptCount.get():null;
	}

}
