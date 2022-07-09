package com.sprint1.pack.repository;
//import org.springframework.transaction.annotation.Transactional;

import com.sprint1.pack.model.Course;

import java.util.List;

import javax.transaction.Transactional;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Integer> {
	@Query(value="select * from course_table where course_name=?1",nativeQuery=true)
	public List<Course> getCourseDetailsByCourseName(String courseName);
	
	@Query(value="select * from course_table inner join college_table on course_table.college_college_reg_id=college_table.college_reg_id where college_table.college_name=?1",nativeQuery=true)
	public List<Course> getCourseDetailsByCollegeName(String collegeName);
	
	
	@Query(value="select * from course_table where eligibility=?1",nativeQuery=true)
	public List<Course> getCourseDetailsByEligibility(String eligibility);
	
	@Transactional
	@Modifying
	@Query(value="delete from Course c where c.courseId=?1")
	public int deleteCourseById(int courseId);
	
	@Transactional
	@Modifying
	@Query(value="delete from Course c where c.courseName=?1")
	public int deleteCourseByName(String courseName);
	
	@Transactional
	@Modifying
	@Query(value="update Course c set c.eligibility=?1 where c.courseId=?2")
	public int updateCourseDetails(String eligibility, int courseId);
	
	
	
}



