package com.sprint1.pack.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.sprint1.pack.model.Branch;

public interface IBranchRepository extends JpaRepository<Branch, Integer> {
	@Query(value="select * from branch_table",nativeQuery=true)
	public List<Branch> viewAllBranchDetails();
	
	@Query(value="Select *from branch_table where branch_name=?1",nativeQuery=true)
	public List<Branch> getBranchDetailsByName(String branchName);

	@Query(value="Select *from branch_table where branch_id=?1",nativeQuery=true)
	public Branch getBranchById(int branchId);
	
	@Transactional
	@Modifying
	@Query(value="delete from Branch b where b.branchId=?1")
	public int deleteBranchById(int branchId);
	
	@Transactional
	@Modifying
	@Query(value="delete from Branch b where b.branchName=?1")
	public int deleteBranchByName(String branchName);
	
	@Transactional
	@Modifying
	@Query(value="update Branch b set b.branchName=?1, b.branchDescription=?2 where b.branchId=?3")
	public int updateBranch(String branchName, String branchDescription, int branchId);
	

}
