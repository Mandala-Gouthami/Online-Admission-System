package com.sprint1.pack.service;

import java.util.List;

import com.sprint1.pack.exception.CourseCreationException;
import com.sprint1.pack.exception.InvalidCourseException;
import com.sprint1.pack.model.Course;

public interface ICourseService {
	public Course addCourse(Course course) throws CourseCreationException;
	public List<Course> viewAllCourseDetails();
	public List<Course> getCourseDetailsByCourseName(String courseName);
	public List<Course> getCourseDetailsByCollegeName(String collegeName);
	public List<Course> getCourseDetailsByEligibility(String eligibility);
	public Course getCourseDetailsByCourseId(int courseId);
	public int deleteCourseById(int courseId);
	public int deleteCourseByName(String courseName);
	public int updateCourseDetails(Course course)throws InvalidCourseException;
	
}
