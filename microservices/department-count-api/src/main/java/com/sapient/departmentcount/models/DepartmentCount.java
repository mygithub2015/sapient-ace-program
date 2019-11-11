package com.sapient.departmentcount.models;

public class DepartmentCount {
	
	private Long id;
	private Long noOfEmployees;
	
	public DepartmentCount() {
		
	}
	
	public DepartmentCount(Long id, Long noOfEmployees) {
		super();
		this.id = id;
		this.noOfEmployees = noOfEmployees;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNoOfEmployees() {
		return noOfEmployees;
	}

	public void setNoOfEmployees(Long noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}

	@Override
	public String toString() {
		return "DepartmentCount [id=" + id + ", noOfEmployees=" + noOfEmployees + "]";
	}
	
	
	

}
