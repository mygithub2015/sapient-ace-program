package com.sapient.departmentdescription.models;

public class DepartmentDescription {
	
	private Long id;
	private String description;
	
	public DepartmentDescription() {
		
	}
	
	public DepartmentDescription(Long id, String description) {
		super();
		this.id = id;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "DepartmentDescription [id=" + id + ", description=" + description + "]";
	}
	
	

}
