package com.sprint1.pack.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprint1.pack.model.Branch;
import com.sprint1.pack.repository.IBranchRepository;
import com.sprint1.pack.service.IBranchService;

@Service
public class IBranchDao implements IBranchService{
	@Autowired
	private IBranchRepository repositorybranch;
	@Override
	public boolean addBranch(Branch branch) {
		// TODO Auto-generated method stub
		Branch b=repositorybranch.save(branch);
		if(b!=null) {
			return true;
		}
		else{
			return false ;
		}
	}

	@Override
	public List<Branch> viewAllBranchDetails() {
		// TODO Auto-generated method stub
		return repositorybranch.viewAllBranchDetails();
	}

	@Override
	public List<Branch> getBranchDetailsByName(String branchName) {
		// TODO Auto-generated method stub
		return repositorybranch.getBranchDetailsByName(branchName);
	}

	@Override
	public int deleteBranchById(int branchId) {
		// TODO Auto-generated method stub
		return repositorybranch.deleteBranchById(branchId);
	}

	@Override
	public Branch getBranchById(int branchId) {
		// TODO Auto-generated method stub
		return repositorybranch.getBranchById(branchId);
	}

	@Override
	public int deleteBranchByName(String branchName) {
		// TODO Auto-generated method stub
		return repositorybranch.deleteBranchByName(branchName);
	}

	@Override
	public int updateBranch(Branch branch) {
		// TODO Auto-generated method stub
		int k=branch.getBranchId();
		String branchName=branch.getBranchName();
		String branchDescription=branch.getBranchDescription();
		int z=repositorybranch.updateBranch(branchName, branchDescription, k);
		if(z==1) {
			return 1;
			
		}
		else {
		return 0;
	}

}
}
