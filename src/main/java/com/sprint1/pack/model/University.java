package com.sprint1.pack.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="University_Table")
public class University {
	@Id
	public String name;
	public int universityId;
	@OneToOne(cascade=CascadeType.ALL)
	public Address address;
	@OneToMany(cascade=CascadeType.ALL)
	public List<College> college;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUniversityId() {
		return universityId;
	}
	public void setUniversityId(int universityId) {
		this.universityId = universityId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<College> getCollege() {
		return college;
	}
	public void setCollege(List<College> college) {
		this.college = college;
	}
	
	
	

}
