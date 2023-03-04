package com.hikaricpconfiguration.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmdModel {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int testId;
	private int empId;
	private String empName;
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	@Override
	public String toString() {
		return "EmdModel [empId=" + empId + ", empName=" + empName + "]";
	}
	
}
