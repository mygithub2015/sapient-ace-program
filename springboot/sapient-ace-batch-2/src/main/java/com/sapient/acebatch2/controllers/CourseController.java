package com.sapient.acebatch2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.acebatch2.models.Course;
import com.sapient.acebatch2.services.ICourseService;

@RestController
@RequestMapping("course-api")
public class CourseController {
	
	@Autowired
	private ICourseService courseService;
	
	@GetMapping("/hello")
	private String sayHello() {
		return "Welcome to Course-API!";
	}
	
	@PostMapping("/add")
	private String addCourse(@RequestBody Course course) {
		
		this.courseService.addCourse(course);
		return "course is added successfully!";
		
	}
	
	@GetMapping("/get/{courseId}")
	private Course getCourse(@PathVariable Long courseId) {
		return this.courseService.getCourse(courseId);
	}
	
	@GetMapping("/get/all")
	private List<Course> getAllCourses() {
		return this.courseService.getAllCourses();
	}
	
	@GetMapping("/get/course-by-name/{courseName}")
	private List<Course> getAllCoursesByName(@PathVariable String courseName) {
		return this.courseService.getCourseByName(courseName);
	}
	
	@PutMapping("/update")
	private String updateCourse(@RequestBody Course course) {
		this.courseService.updateCourse(course);
		return "Course is updated...";
	}
	
	@DeleteMapping("/delete/{courseId}")
	private String deleteCourse(@PathVariable Long courseId) {
		this.courseService.deleteCourse(courseId);
		return "Course is deleted";
	}

}
