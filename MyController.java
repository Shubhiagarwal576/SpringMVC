package com.springrest.springrest.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.Services.LoadService;
import com.springrest.springrest.entities.Course;

@RestController
public class MyController {
	
	@Autowired
	private LoadService loadservice;
	
	@GetMapping("/home")
	public String home() {
		
		return " this is home page";
	}
	
	//get the courses
	@GetMapping("/load")
	public List<Course> getCourses()
	{
		
		return this.loadservice.getCourses();
		
		
	}
	//value = "/whatever/{contentId}", method = RequestMethod.POST
	@GetMapping("/load/{LoadId}" )
	public Course getLoad(@PathVariable String LoadId) {
		return this.loadservice.getLoad((LoadId));
	}
	
	//add the loads 
	@PostMapping("/load")
	public Course addLoad(@RequestBody Course load )
	{
		
		return this.loadservice.addLoad(load);
		
	}
	
	/*@PutMapping("/load")
	public Course updateLoad(@RequestBody Course load)
	{

		 return this.loadservice.updateLoad(load);
	}*/
	
	@PutMapping("/load/{LoadId}")
	public void updateLoad(@PathVariable String LoadId, @RequestBody Course load)
	{

		  this.loadservice.updateLoad(LoadId,load);
	}
	
	
	@DeleteMapping("/load/{LoadId}")
	public void deleteLoad(@PathVariable String LoadId)
	{
			this.loadservice.deleteLoad((LoadId));
			System.out.println("deleted");
			
		}
	

	
	

}
