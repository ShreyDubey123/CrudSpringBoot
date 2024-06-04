package com.app.service;

import java.util.List;

import com.app.entity.Student;

public interface StudentService {

public List<Student> findAll();
	
	public Student findById(int theId);
	
	public void save (Student theStudent);

	public void deleteById(int theId);
}
