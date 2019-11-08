package com.sapient.acebatch2.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sapient.acebatch2.models.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
	
	List<Course> findByCourseName(String courseName);
	

}
