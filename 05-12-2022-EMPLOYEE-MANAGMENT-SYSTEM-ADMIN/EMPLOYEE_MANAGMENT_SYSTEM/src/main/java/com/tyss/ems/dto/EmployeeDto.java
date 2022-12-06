package com.tyss.ems.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeDto {
	
	private int empId;
	private String firstName;
	private String lastName;
	private String joiningDate;
	private String skills;
	private String totalExprience;
	private String releventExprience;
	private String domain;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getTotalExprience() {
		return totalExprience;
	}

	public void setTotalExprience(String totalExprience) {
		this.totalExprience = totalExprience;
	}

	public String getReleventExprience() {
		return releventExprience;
	}

	public void setReleventExprience(String releventExprience) {
		this.releventExprience = releventExprience;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	@Override
	public String toString() {
		return "EmployeeDto [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", joiningDate="
				+ joiningDate + ", skills=" + skills + ", totalExprience=" + totalExprience + ", releventExprience="
				+ releventExprience + ", domain=" + domain + "]";
	}

}
