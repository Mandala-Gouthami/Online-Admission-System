package com.sprint1.pack.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprint1.pack.model.Program;
import com.sprint1.pack.repository.IProgramRepository;
import com.sprint1.pack.service.IProgramService;


@Service
public class IProgramDao implements IProgramService {
	
	@Autowired
	
	private IProgramRepository repositoryProgram;

	@Override
	public Program addProgram(Program program) {
		// TODO Auto-generated method stub
		
		Program p=repositoryProgram.save(program);
		return p;
		
		//return null;
	}

	@Override
	public List<Program> viewAllProgramDetails() {
		// TODO Auto-generated method stub
		return repositoryProgram.findAll();
		//return null;
	}


	@Override
	public List<Program> getProgramDetailsByName(String programName) {
		// TODO Auto-generated method stub
		return repositoryProgram.getProgramDetailsByName(programName);
		//return null;
	}

	@Override
	public List<Program> getProgramDetailsByEligibility(String eligibility) {
		// TODO Auto-generated method stub
		return repositoryProgram.getProgramDetailsByEligibility(eligibility);
		
		//return null;
	}

	@Override
	public int deleteProgramById(int programId) {
		// TODO Auto-generated method stub
		
		return repositoryProgram.deleteProgramById(programId);
		//return 0;
	}

	@Override
	public int deleteProgamByName(String programName) {
		// TODO Auto-generated method stub
		return repositoryProgram.deleteProgramByName(programName);
		
		//return 0;
	}

	@Override
	public int getProgramById(int programId) {
		// TODO Auto-generated method stub
		 return repositoryProgram.getProgramById(programId); 
		//return 0;
	}

	@Override
	public int updateProgramStatus(Program program) {
		// TODO Auto-generated method stub
		int k=program.getProgramId();
		String programName=program.getProgramName();
		String eligibility=program.getEligibility();
		int z=repositoryProgram.updateProgramStatus(programName,eligibility,k);
		if(z==1) {
			return 1;
		}else {
			return 0;
		}
		//return 0;
	}

	@Override
	public List<Program> getProgramDetailsByCollegeName(String collegeName) {
		// TODO Auto-generated method stub
		return null;
	}

	/*@Override
	public List<Program> getProgramDetailsByCollegeName(String collegeName) {
		// TODO Auto-generated method stub
		//return repositoryProgram.getProgramDetailsByCollegeName(collegeName);
		
		return null;
	}
*/
}