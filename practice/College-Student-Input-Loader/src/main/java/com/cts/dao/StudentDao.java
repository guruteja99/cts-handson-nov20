package com.cts.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.model.Student;

@Repository
public interface StudentDao extends JpaRepository<Student,Integer> {

	
}
