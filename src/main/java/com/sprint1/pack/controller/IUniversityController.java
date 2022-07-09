package com.sprint1.pack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sprint1.pack.dao.IUniversityDao;
import com.sprint1.pack.model.University;

@RestController
public class IUniversityController {
	@Autowired
	 private IUniversityDao dao;
	
	@PostMapping(path="/create University")
	public University addUniversity(@RequestBody University university) {
		return dao.addUniversity(university);
		
     }
	
	@GetMapping(path="/viewAllUniversityDetails")
	public List<University> viewAllUniversityDetails(){
		return dao.viewAllUniversityDetails();
	}
	
	@DeleteMapping(path="/deleteUniversityById/{universityId}")
	public int deleteUniversityById(@PathVariable int universityId) {
		return dao.deleteUniversityById(universityId);
	}
	
	@PutMapping(path="/UpdateUniversity/{universityId}")
	public int updateUniversity(@RequestBody University name, @PathVariable int universityId){
		return dao.updateUniversity(name);
	
	}
	@GetMapping(path="/getUniversityById/{universityId}")
	public University getUniversityById(@PathVariable int universityId) {
		return dao.getUniversityById(universityId);
	}
	@GetMapping(path="/getUniversityDetailsByCollegeName/{collegeName}")
	public List<University>getUniversityDetailsByCollegeName(@PathVariable String collegeName){
	return dao.getUniversityDetailsBycollegeName(collegeName);
	}
	@GetMapping(path="/getUniversityDetailsByCity/{city}")
	public List<University> getUniversityDetailsByCity(@PathVariable String city){
		return dao. getUniversityDetailsByCity(city);
		
		
	}
	

	

}
