package com.sprint1.pack.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;



@Entity
@Table(name="Course_Table")
public class Course {
	@Id
	@Range(min=1)
	private int courseId;
	@NotBlank(message="Course name cannot be blank")
	private String courseName;
	@NotBlank(message="eligibility cannot be blank")
	private String eligibility;
	@ManyToOne(cascade=CascadeType.ALL)
	private College college;
	@OneToMany(fetch=FetchType.LAZY)
	private List<Branch> branches;
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getEligibility() {
		return eligibility;
	}
	public void setEligibility(String eligibility) {
		this.eligibility = eligibility;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public List<Branch> getBranches() {
		return branches;
	}
	public void setBranches(List<Branch> branches) {
		this.branches = branches;
	}

	
	
	
}
