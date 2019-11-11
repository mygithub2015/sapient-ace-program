package com.sapient.departmentcatalogue.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Department {
	
	private Long id;
	private String deptName;
	private Long noOfEmployees;
	private String deptDescription;
	
	
}
