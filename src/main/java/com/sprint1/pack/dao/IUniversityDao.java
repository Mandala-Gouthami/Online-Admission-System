package com.sprint1.pack.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprint1.pack.model.University;
import com.sprint1.pack.repository.IUniversityRepository;
import com.sprint1.pack.service.IUniversityService;

@Service
public class IUniversityDao implements IUniversityService {
	@Autowired
	private IUniversityRepository repositoryUniversity;

	@Override
	public University addUniversity(University university) {
		// TODO Auto-generated method stub
		University univer=repositoryUniversity.save(university);
		return univer;
	}

	@Override
	public List<University> viewAllUniversityDetails() {
		// TODO Auto-generated method stub
		return repositoryUniversity.findAll();
		//return null;
	}

	@Override
	public List<University> getUniversityDetailsByCity(String city) {
		// TODO Auto-generated method stub
		return repositoryUniversity.getUniversityDetailsByCity(city);
		//return null;
	}

	@Override
	public List<University> getUniversityDetailsBycollegeName(String collegeName) {
		// TODO Auto-generated method stub
		return repositoryUniversity.getUniversityDetailsByCollegeName(collegeName);
		//return null;
	}

	@Override
	public int deleteUniversityById(int universityId) {
		// TODO Auto-generated method stub
		return repositoryUniversity.deleteUniversityById(universityId);
		//return 0;
		
	}

	@Override
	public University getUniversityById(int universityId) {
		// TODO Auto-generated method stub
		University u= repositoryUniversity.findById(universityId).get();
		return u;
		//return null;
	}

	@Override
	public int updateUniversity(University university) {
		// TODO Auto-generated method stub
		int k=university.getUniversityId();
		String name=university.getName();
		int z=repositoryUniversity.updateUniversity(name,k);
		if(z==1) {
			return 1;
	}
	else {
		return 0;
		
				
		//return 0;
	}
	}

	
}