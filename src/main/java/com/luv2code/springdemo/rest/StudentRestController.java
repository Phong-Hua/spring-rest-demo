package com.luv2code.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	private List<Student> theStudents;
	
	// define @PostConstruct to load the student data ... This only call once.
	@PostConstruct
	public void loadData() {
		theStudents = new ArrayList<>();
		theStudents.add(new Student("John", "Smith"));
		theStudents.add(new Student("Sarah", "Wilson"));
		theStudents.add(new Student("Mary", "Thompson"));
	}
	
	// define endpoint for "/students"
	@GetMapping("/students")
	public List<Student> getStudents() {
		
		return theStudents;
	}
}
