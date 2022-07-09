package com.sprint1.pack.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Branch_Table")
public class Branch {
	@Id
	private int branchId;
	private String branchName;
	private String branchDescription;
	public int getBranchId() {
		return branchId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getBranchDescription() {
		return branchDescription;
	}
	public void setBranchDescription(String branchDescription) {
		this.branchDescription = branchDescription;
	}
	
	
	

}
