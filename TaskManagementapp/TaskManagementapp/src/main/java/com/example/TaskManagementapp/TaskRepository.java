package com.example.TaskManagementapp;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import jakarta.transaction.Transactional;


public interface TaskRepository extends JpaRepository<Task, Integer> {
	List<Task> findByTaskholdername(@Param("taskholdername") String taskholdername);
	
	@Transactional
    void deleteByTaskid(@Param("taskid") String taskid);
}

