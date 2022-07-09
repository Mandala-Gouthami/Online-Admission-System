package com.sprint1.pack.service;

import java.util.List;

import com.sprint1.pack.model.University;

public interface IUniversityService {
	public University addUniversity(University university);
	public List<University> viewAllUniversityDetails();
	public List<University> getUniversityDetailsByCity(String city);
	public List<University> getUniversityDetailsBycollegeName(String collegeName);
	public int deleteUniversityById(int universityId);
	public University getUniversityById(int applicationId);
	public int updateUniversity(University university);
	
}
