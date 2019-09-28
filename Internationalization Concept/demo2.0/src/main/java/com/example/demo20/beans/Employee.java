package com.example.demo20.beans;

public class Employee {
	private int empId;
	private String empName;
	private static String organization = "Capgemini";
	
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		organization = organization;
	}
	
}
