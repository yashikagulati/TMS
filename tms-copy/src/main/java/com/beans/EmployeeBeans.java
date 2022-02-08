package com.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class EmployeeBeans {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "empid")
	private int empId; 
	@Column(name="empname")
	private String empName;
	private String empEmail;
	private String empPassword;
	private double empSalary;
	
	
	public EmployeeBeans() {
		// TODO Auto-generated constructor stub
	}
	
	public EmployeeBeans(int empId, String empName, String empEmail, String empPassword, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empPassword = empPassword;
		this.empSalary = empSalary;
	}
	
	@Override
	public String toString() {
		return "EmployeeBeans [empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail + ", empPassword="
				+ empPassword + ", empSalary=" + empSalary + "]";
	}
	public int getEmpId() {
		return empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getEmpPassword() {
		return empPassword;
	}
	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
    
    
    
}
