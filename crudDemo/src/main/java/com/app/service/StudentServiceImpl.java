package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.StudentRepositary;
import com.app.entity.Student;

import jakarta.transaction.Transactional;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepositary studentRepositary;

//	@Override
//	public void save(Employee theEmployee) {
//		// TODO Auto-generated method stub
//		employeeRepository.save(theEmployee);
//	}

	@Override
	@Transactional
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return studentRepositary.findAll();
	}

	@Override
	@Transactional
	public Student findById(int theId) {
		// TODO Auto-generated method stub
		Optional<Student> o = studentRepositary.findById(theId);
		if(o.isEmpty()) {
			return null;
		}else {
			Student s = o.get();
			return s;
		}
		
	}

	
	@Override
	@Transactional
	public void save(Student theStudent) {
		// TODO Auto-generated method stub
		studentRepositary.save(theStudent);
	}
	
	@Override
	@Transactional
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		studentRepositary.deleteById(theId);
	}

	
}
