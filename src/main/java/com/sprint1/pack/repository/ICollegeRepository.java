package com.sprint1.pack.repository;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sprint1.pack.model.College;

@Repository
public interface ICollegeRepository extends JpaRepository<College, Integer> {
	
	//@Query(value="select * from College_Table inner join program_table on College_Table.college_college_id=program_table.college_reg_id where college_table.college_name=?1 ",nativeQuery=true)
	//public List<College> getCollegeDetailsByProgram(String programName);
	
	@Query(value="select * from college_table col where col.college_reg_id=(select c.college_college_reg_id from college_table_program_list c inner join program_table p ON c.program_list_program_id=p.program_id where p.program_name=?1)",nativeQuery=true)
	public List<College> getCollegeDetailsByProgram(String programName);
	
	@Query(value="select * from college_table col where col.college_reg_id=(select c.college_college_reg_id from college_table_branch_list c inner join branch_table b ON c.branch_list_branch_id=b.branch_id where b.branch_name=?1)",nativeQuery=true)
	public List<College> getCollegeDetailsByBranch(String branchName);
	
	//value="select * from college_table col inner join course_table c ON col.college_reg_id=c.college_college_reg_id where c.course_name=?1",nativeQuery=true
	@Query(value="select * from College_Table inner join course_table on College_Table.college_reg_id=course_table.college_college_reg_id where course_table.course_name=?1 ",nativeQuery=true)
	public List<College> getCollegeDetailsByCourse(String courseName);
	
	//@Query(value="select * from College_Table ",nativeQuery=true)
	//public List<College> getCollegeDetailsByBranch(String branchName);
	
	@Query(value="select * from College_Table where college_name=?1",nativeQuery=true)
	public List<College> getCollegeDetailsByName(String cName);
	
	@Transactional
	@Modifying
	@Query(value="delete from College c where c.collegeRegId=?1")
	public int deleteCollegeById(int collegeId);
	
	@Transactional
	@Modifying
	@Query(value="delete from College c where c.collegeName=?1")
	public int deleteCollegeByName(String collegeName);
	
	@Query(value="Select * from College_Table where college_reg_Id=?1",nativeQuery=true)
	public College getCollegeDetailsById(int collegeId);
	
	
	@Transactional
	@Modifying
	@Query(value="update College c set c.collegeName=?1 where c.collegeRegId=?2")
	public int updateCollegeDetails(String collegeName,int collegeId);

}
