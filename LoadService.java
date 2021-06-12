package com.springrest.springrest.Services;

import java.util.List;
import com.springrest.springrest.entities.Course;



public interface LoadService {
	public List<Course> getCourses();
    
	public Course getLoad(String LoadId);
	
	public Course addLoad(Course load);
	
	//public Course updateLoad(Course load);
	
	public void updateLoad(String LoadId, Course load);
	
	public void  deleteLoad(String LoadId );


	
}
