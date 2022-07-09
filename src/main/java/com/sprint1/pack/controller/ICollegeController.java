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

import com.sprint1.pack.dao.ICollegeDao;
import com.sprint1.pack.model.College;

@RestController
public class ICollegeController {
	@Autowired
	 private ICollegeDao dao;
	
	@PostMapping(path="/create College")
	public College addCollege(@RequestBody College college) {
		return dao.addCollege(college);
	}
	@GetMapping(path="/viewAllCollegeDetails")	
	public List<College> viewAllCollegeDetails() {
		return dao.viewAllCollegeDetails();
		
    }
	@DeleteMapping(path="/deleteCollegeById/{collegeId}")
	public int deleteCollegeById(@PathVariable int collegeId) {
		return dao.deleteCollegeById(collegeId);
	}
	
	@DeleteMapping(path="/deleteCollegeByName/{collegeName}")
	public int deleteCollegeByName(@PathVariable String collegeName) {
		return dao.deleteCollegeByName(collegeName);
	}
	
	@PutMapping(path="/updateCollegeDetails/{collegeId}")
	public int updateCollegeDetails(@RequestBody College name, @PathVariable int collegeId){
		return dao.updateCollegeDetails(name);
	}
	@GetMapping(path="/getCollegeDetailsById/{collegeId}")
	public College getCollegeDtailsById(@PathVariable int collegeId) {
		return dao.getCollegeDetailsById(collegeId);
		
	}
	@GetMapping(path="/getCollegeDetailsByName{cName}")
	public List<College> getCollegeDetailsByName(@PathVariable String cName){
		return dao.getCollegeDetailsByName(cName);
	}
	@GetMapping(path="/getCollegeDetailsByCourse{courseName}")
	public List<College> getCollegeDetailsByCourse(@PathVariable String courseName){
		return dao.getCollegeDetailsByProgram(courseName);
	}
	@GetMapping(path="/getCollegeDetailsByProgram/{ProgramName}")
	public List<College> getCollegeDetailsByProgram(@PathVariable String ProgramName){
		return dao.getCollegeDetailsByProgram(ProgramName);
	}
	@GetMapping(path="/getCollegeDetailsByBranch/{branchName}")
	public List<College> getCollegeDetailsByBranch(@PathVariable String branchName){
		return dao.getCollegeDetailsByBranch(branchName);
	}
	
}
