package com.sprint1.pack.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sprint1.pack.dao.IProgramDao;
import com.sprint1.pack.model.Program;



@RestController
public class IProgramController {
	@Autowired
	 private IProgramDao dao;
	
	@PostMapping(path="/create Program")
	public Program addProgram(@RequestBody Program program) {
		return dao.addProgram(program);
		
    }

	@GetMapping(path="/viewAllProgramDetails")
	public List<Program> viewAllProgramDetails(){
		return dao.viewAllProgramDetails();
	}
	
	@DeleteMapping(path="/deleteProgramById/{programId}")
	public int deleteProgramById(@PathVariable int programId) {
		return dao.deleteProgramById(programId);
	}
	
	@DeleteMapping(path="/deleteProgramByName/{programName}")
	public int deleteProgramByName(@PathVariable String programName) {
		return dao.deleteProgamByName(programName);
	}
	
	@PutMapping(path="/updateProgramStatus/{programId}")
	public int updateProgramStatus(@RequestBody Program program , @PathVariable int programId){
		return dao.updateProgramStatus(program);
		}
	
	@GetMapping(path="/getProgramDetailsByName{programName}")
	public List<Program> getProgramDetailsByName(@PathVariable String programName){
		return dao.getProgramDetailsByName(programName);
		}
	@GetMapping(path="/getProgramDetailsByEligibility{eligibility}")
	public List<Program> getProgramDetailsByEligibility(@PathVariable String eligibility){
		return dao.getProgramDetailsByEligibility(eligibility);
	}
	
	@GetMapping(path="/getProgramById/{programId}")
	public int getProgramById(@PathVariable int programId) {
		return dao.getProgramById(programId);
	

}

}