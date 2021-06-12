package com.springrest.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entities.Course;


public interface  LoadDao extends JpaRepository <Course, String>{

	//Optional<Course> findById(String loadId);

	//Course findAllById(Long loadId);

	

	//Optional<Course> getLoad(Long LoadId);

}
