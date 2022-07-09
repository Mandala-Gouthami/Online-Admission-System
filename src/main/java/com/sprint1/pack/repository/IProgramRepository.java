package com.sprint1.pack.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sprint1.pack.model.Program;


@Repository
public interface IProgramRepository extends JpaRepository<Program,Integer>{
	
	//@Query(value="select * from program_table inner College_Table on program_table.Program_id=College_Table.")
	//public List<Program> getApplicationDetailsByCollegeName(String collegeName);
		
	@Transactional
	@Modifying
	@Query(value="delete from Program p where p.programId=?1")
	public int deleteProgramById(int programId);
	
	@Transactional
	@Modifying//select * from program_table
	@Query(value="delete from Program p where p.programName=?1")
	public int deleteProgramByName(String programName);
	
	@Query(value="Select * from program_table where program_id=?1",nativeQuery=true)
	public int getProgramById(int programId);
	
	@Query(value="select * from program_table where eligibility=?1",nativeQuery=true)
	public List<Program> getProgramDetailsByEligibility(String eligibility);
	
	@Query(value="select * from program_table where program_name=?1",nativeQuery=true)
	public List<Program> getProgramDetailsByName(String programName);
	
	@Transactional
	@Modifying
	@Query(value="update Program ps set ps.programName=?1,ps.eligibility=?2 where ps.programId=?3")
	public int updateProgramStatus(String programName,String eligibility,int programId);
	
        
}