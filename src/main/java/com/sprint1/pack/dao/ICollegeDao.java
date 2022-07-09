package com.sprint1.pack.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprint1.pack.model.College;
import com.sprint1.pack.repository.ICollegeRepository;
import com.sprint1.pack.service.ICollegeService;


@Service
public class ICollegeDao implements ICollegeService{
	@Autowired
	
	private ICollegeRepository repositoryCollege;

	@Override
	public College addCollege(College college) {
		// TODO Auto-generated method stub
		College clg=repositoryCollege.save(college);
		return clg;
		
		//return null;
	}

	@Override
	public List<College> viewAllCollegeDetails() {
		// TODO Auto-generated method stub
		return repositoryCollege.findAll();
		//return null;
	}

	@Override
	public List<College> getCollegeDetailsByProgram(String programName) {
		// TODO Auto-generated method stub
		return repositoryCollege.getCollegeDetailsByProgram(programName);
		
		//return null;
	}

	@Override
	public List<College> getCollegeDetailsByCourse(String courseName) {
		// TODO Auto-generated method stub
				
		return repositoryCollege.getCollegeDetailsByCourse(courseName);
		//return null;
	}

	@Override
	public List<College> getCollegeDetailsByBranch(String branchName) {
		// TODO Auto-generated method stub
		return repositoryCollege.getCollegeDetailsByBranch(branchName);
		 
		//return null;
	}

	@Override
	public List<College> getCollegeDetailsByName(String cName) {
		// TODO Auto-generated method stub
		return repositoryCollege.getCollegeDetailsByName(cName);
		//return null;
	}

	@Override
	public int deleteCollegeById(int collegeId) {
		// TODO Auto-generated method stub
		return repositoryCollege.deleteCollegeById(collegeId);
		//return 0;
	}

	@Override
	public int deleteCollegeByName(String collegeName) {
		// TODO Auto-generated method stub
		return repositoryCollege.deleteCollegeByName(collegeName);
		//return 0;
	}

	@Override
	public int updateCollegeDetails(College college) {
		// TODO Auto-generated method stub
		int k=college.getCollegeRegId();
		String collegeName=college.getCollegeName();
		int z=repositoryCollege.updateCollegeDetails(collegeName,k);
		if(z==1) {
			return 1;
	}
	else {
		return 0;
		//return 0;
	}
	}

	@Override
	public College getCollegeDetailsById(int collegeId) {
		// TODO Auto-generated method stub
		
		College c= repositoryCollege.findById(collegeId).get();
		return c;
		//return null;
	}

}