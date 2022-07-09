package com.sprint1.pack.service;

import java.util.List;

import com.sprint1.pack.model.College;

public interface ICollegeService {
	public College addCollege(College college);
	public List<College> viewAllCollegeDetails();
	public List<College> getCollegeDetailsByProgram(String programName);
	public List<College> getCollegeDetailsByCourse(String courseName);
	public List<College> getCollegeDetailsByBranch(String branchName);
	public List<College> getCollegeDetailsByName(String cName);
	public int deleteCollegeById(int collegeId);
	public int deleteCollegeByName(String collegeName);
	public int updateCollegeDetails(College college);
	public College getCollegeDetailsById(int collegeId);

}
