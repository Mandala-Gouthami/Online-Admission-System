package com.sprint1.pack.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprint1.pack.exception.CourseCreationException;
import com.sprint1.pack.exception.InvalidCourseException;
import com.sprint1.pack.model.Course;
import com.sprint1.pack.repository.CourseRepository;
import com.sprint1.pack.service.ICourseService;
@Service
public class ICourseDao implements ICourseService{
	@Autowired
	private CourseRepository repositoryCourse;

	@Override
	public Course addCourse(Course course)throws CourseCreationException{
		// TODO Auto-generated method stub
	if(repositoryCourse.existsById(course.getCourseId()))
	{
		throw new CourseCreationException("Id already existing");
	}
	else {
	return repositoryCourse.save(course);
	}
	
	}

	@Override
	public List<Course> viewAllCourseDetails() {
		// TODO Auto-generated method stub
		
		return repositoryCourse.findAll();
	}

	@Override
	public List<Course> getCourseDetailsByCourseName(String courseName) {
		// TODO Auto-generated method stub

		return repositoryCourse.getCourseDetailsByCourseName(courseName);
	}

	@Override
	public List<Course> getCourseDetailsByCollegeName(String collegeName) {
		// TODO Auto-generated method stub
		return repositoryCourse.getCourseDetailsByCollegeName(collegeName);
	}

	@Override
	public List<Course> getCourseDetailsByEligibility(String eligibility) {
		// TODO Auto-generated method stub
		return repositoryCourse.getCourseDetailsByEligibility(eligibility);
	}

	@Override
	public Course getCourseDetailsByCourseId(int courseId) {
		// TODO Auto-generated method stub
		return repositoryCourse.findById(courseId).get();
	}

	@Override
	public int deleteCourseById(int courseId) {
		// TODO Auto-generated method stub
		return repositoryCourse.deleteCourseById(courseId);
	}

	@Override
	public int deleteCourseByName(String courseName) {
		// TODO Auto-generated method stub
		return repositoryCourse.deleteCourseByName(courseName);
	}

	@Override
	public int updateCourseDetails(Course course)throws InvalidCourseException {
		// TODO Auto-generated method stub
		int status=0;
		if(repositoryCourse.existsById(course.getCourseId()))
		{
		int k=course.getCourseId();
		String e=course.getEligibility();
		return status= repositoryCourse.updateCourseDetails(e,k);
		}
		{
			throw new InvalidCourseException("Course Update is not done");
		}
		

}
}

