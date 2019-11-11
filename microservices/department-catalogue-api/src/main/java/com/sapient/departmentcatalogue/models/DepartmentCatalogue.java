package com.sapient.departmentcatalogue.models;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class DepartmentCatalogue {
	
	private Long id;
	private String name;
	public DepartmentCatalogue(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}
