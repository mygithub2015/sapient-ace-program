package com.sapient.acebatch2.services;

import java.util.List;

import com.sapient.acebatch2.models.Course;

public interface ICourseService {
	
	Course addCourse(Course course);
	Course getCourse(Long courseId);
	List<Course> getCourseByName(String courseName);
	List<Course> getAllCourses();
	Course updateCourse(Course course);
	void deleteCourse(Long courseId);

}
