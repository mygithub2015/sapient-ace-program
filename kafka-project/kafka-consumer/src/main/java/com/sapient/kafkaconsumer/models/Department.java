package com.sapient.kafkaconsumer.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Department {

	private int deptId;
	private String deptName;
}
