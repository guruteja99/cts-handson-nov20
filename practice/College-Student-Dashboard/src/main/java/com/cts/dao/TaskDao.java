package com.cts.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cts.model.Task;

@Repository
public interface TaskDao extends JpaRepository<Task, Integer> {

	//@Query("select t from task t where t.student_id=?1")
	List<Task> findAllByStudentId(int i);

}
