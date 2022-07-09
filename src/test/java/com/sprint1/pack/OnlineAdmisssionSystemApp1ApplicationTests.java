package com.sprint1.pack;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.sprint1.pack.exception.CourseCreationException;
import com.sprint1.pack.model.Course;
import com.sprint1.pack.repository.CourseRepository;
import com.sprint1.pack.service.ICourseService;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class OnlineAdmissionSystemApp1ApplicationTests {
	@Autowired
	private CourseRepository courseRepos;
@Autowired
ICourseService service;
	
	@Test
	public void testSave()
	{
	Course course=new Course();
	course.setCourseId(2345);
	course.setCourseName("AI");
	course.setEligibility("Maths Student");
		Course t=null;
		try {
		 	t= service.addCourse(course);
		} catch (CourseCreationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	assertNotNull(t);
		}

	@Test
	public  void viewAllCourseDetails()
	{
		
	List<Course> list=	service.viewAllCourseDetails();
	assertThat(list).size().isGreaterThan(0);
	}
	@Test
	public void testForUpdate()
	{
		
		Course t=courseRepos.findById(2345).get();
		t.setCourseName("Data Science");
		courseRepos.save(t);
		//assertNotEquals("xyz", trainRepos.findById(1144).get().getTarinName());
	assertNotEquals("adfd", courseRepos.findById(2345).get().getCourseName());	
	
	}
/*	@Test
	public void testForDelete()
	{
		int status=service.deletePaymentById(33);
		
		assertEquals(1, status);
	}*/
}
