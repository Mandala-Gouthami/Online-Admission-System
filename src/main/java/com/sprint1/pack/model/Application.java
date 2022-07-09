package com.sprint1.pack.model;

import java.time.LocalDate;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Entity;

@Entity
@Table(name="Application_Table")
public class Application {
	@Id
	private int applicationId;
	private String applicantFullName;
	private LocalDate dateOfBirth;
	private String highestQualification;
	private double finalYearPercentage;
	private String goals;
	private String emailId;
	@OneToOne
	private ProgramScheduled schedule;
	private String applicationStatus;
	private LocalDate dateOfInterview;
	private String applicantInterviewFeedback;
	
	
	
	public int getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}
	public String getApplicantFullName() {
		return applicantFullName;
	}
	public void setApplicantFullName(String applicantFullName) {
		this.applicantFullName = applicantFullName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getHighestQualification() {
		return highestQualification;
	}
	public void setHighestQualification(String highestQualification) {
		this.highestQualification = highestQualification;
	}
	public double getFinalYearPercentage() {
		return finalYearPercentage;
	}
	public void setFinalYearPercentage(double finalYearPercentage) {
		this.finalYearPercentage = finalYearPercentage;
	}
	public String getGoals() {
		return goals;
	}
	public void setGoals(String goals) {
		this.goals = goals;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public ProgramScheduled getSchedule() {
		return schedule;
	}
	public void setSchedule(ProgramScheduled schedule) {
		this.schedule = schedule;
	}
	public String getApplicationStatus() {
		return applicationStatus;
	}
	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}
	public LocalDate getDateOfInterview() {
		return dateOfInterview;
	}
	public void setDateOfInterview(LocalDate dateOfInterview) {
		this.dateOfInterview = dateOfInterview;
	}
	public String getApplicantInterviewFeedback() {
		return applicantInterviewFeedback;
	}
	public void setApplicantInterviewFeedback(String applicantInterviewFeedback) {
		this.applicantInterviewFeedback = applicantInterviewFeedback;
	}
	
	
	
	

}
