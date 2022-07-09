package com.sprint1.pack.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="College_Table")

public class College {
	@Id
	private int collegeRegId;
	private String collegeName;
	@OneToOne(cascade=CascadeType.ALL)
	private Address address;
	@OneToMany (cascade=CascadeType.ALL)
	private List<Program> programList;
	@OneToMany (cascade=CascadeType.ALL)
	private List<Course> courseList;
	@OneToMany (cascade=CascadeType.ALL)
	private List<Branch> branchList;
	@OneToOne(cascade=CascadeType.ALL)
	private University university;
	public int getCollegeRegId() {
		return collegeRegId;
	}
	public void setCollegeRegId(int collegeRegId) {
		this.collegeRegId = collegeRegId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Program> getProgramList() {
		return programList;
	}
	public void setProgramList(List<Program> programList) {
		this.programList = programList;
	}
	public List<Course> getCourseList() {
		return courseList;
	}
	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}
	public List<Branch> getBranchList() {
		return branchList;
	}
	public void setBranchList(List<Branch> branchList) {
		this.branchList = branchList;
	}
	public University getUniversity() {
		return university;
	}
	public void setUniversity(University university) {
		this.university = university;
	}
	
	
	
}