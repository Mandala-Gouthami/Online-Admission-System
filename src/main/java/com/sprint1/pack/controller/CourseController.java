package com.sprint1.pack.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sprint1.pack.dao.ICourseDao;
import com.sprint1.pack.exception.CourseCreationException;
import com.sprint1.pack.exception.InvalidCourseException;
import com.sprint1.pack.model.Course;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController

public class CourseController {
	@Autowired
	private ICourseDao dao;
	Logger log=LoggerFactory.getLogger(CourseController.class);
	@PostMapping(path="/createCourse")
	public Course addCourse(@Valid @RequestBody Course course) throws CourseCreationException{
		Course k= dao.addCourse(course);
		if(k!=null)
		{
			System.out.println("Course is added");
			log.info("Course is added ");
		}
		else
		{
			System.out.println("Not able to add course");
			log.error("Course is not added ");
		}
		return k;
	}
	
	@GetMapping(path="/getAllCourseDetails")
	public List<Course> viewAllCourseDetails(){
		log.info("viewAllCourseDetails");
		return dao.viewAllCourseDetails();
	}
	
	@GetMapping(path="/getCourseDetailsByCourseName/{courseName}")
	public List<Course> getCourseDetailsByCourseName(@PathVariable String courseName){
		return dao.getCourseDetailsByCourseName(courseName);
	}

	@GetMapping(path="/getCourseDetailsByCollegeName/{collegeName}")
	public List<Course> getCourseDetailsByCollegeName(@PathVariable String collegeName){
		return dao.getCourseDetailsByCollegeName(collegeName);
	}
	
	@GetMapping(path="/getCourseDetailsByEligibility/{eligibility}")
	public List<Course> getCourseDetailsByEligibility(@PathVariable String eligibility) {
		return dao.getCourseDetailsByEligibility(eligibility);
	}
	
	@GetMapping(path="/getCourseDetailsByCourseId/{courseId}")
	public Course getCourseDetailsByCourseId(@PathVariable int courseId) {
		// TODO Auto-generated method stub
		return dao.getCourseDetailsByCourseId(courseId);
	}

	
	@DeleteMapping(path="/deleteCourse/{courseId}")
	public int deleteCourseById(@PathVariable int courseId) {
		return dao.deleteCourseById(courseId);
			
		}
	
	@DeleteMapping(path="/deleteCourseByName/{courseName}")
	public int deleteCourseByName(@PathVariable String courseName) {
		return dao.deleteCourseByName(courseName);
	}
	
	@PutMapping("/UpdateCourseDetails/{courseId}")
	public int updateCourseDetails(@Valid @RequestBody Course course,@PathVariable int courseId) throws InvalidCourseException{
		int k1= dao.updateCourseDetails(course);
		if(k1!=0) {
			System.out.println("Course details updated");
			log.info("Course is updated ");
		}
		else {
			System.out.println("Course details not updated");
			log.error("Course is not updated ");
		}
		return k1;
	}
	
	
}
