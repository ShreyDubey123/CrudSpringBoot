package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Student;

public interface GenRepository extends JpaRepository<Student, Integer> {

}
