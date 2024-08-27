package com.hrmanagement.entity;

import java.sql.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity

public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int employeeId;
	
	private String employeeFirstName;
	private String employeeLastName;
	private String employeeEmail;
	private String employeePassword;
	private long employeePhoneNumber;
	private Date employeeHireDate;
	private int employeeSalary;
	
	@ManyToOne
	@JoinColumn(name="departmentId")
	private Department department;
	
	public Employee() {
		super();
	}
	public Employee(int employeeId, String employeeFirstName, String employeeLastName, String employeeEmail,String employeePassword,
			long employeePhoneNumber, Date employeeHireDate,int employeeSalary,Department department) {
		super();
		this.employeeId = employeeId;
		this.employeeFirstName = employeeFirstName;
		this.employeeLastName = employeeLastName;
		this.employeeEmail = employeeEmail;
		this.employeePassword = employeePassword;
		this.employeePhoneNumber = employeePhoneNumber;
		this.employeeHireDate = employeeHireDate;
		this.employeeSalary = employeeSalary;
		this.department=department;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeFirstName() {
		return employeeFirstName;
	}
	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}
	public String getEmployeeLastName() {
		return employeeLastName;
	}
	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public  String getEmployeePassword(){
		return employeePassword;
	}
	public void setEmployeePassword(String employeePassword) {
		this.employeePassword=employeePassword;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public long getEmployeePhoneNumber() {
		return employeePhoneNumber;
	}
	public void setEmployeePhoneNumber(long employeePhoneNumber) {
		this.employeePhoneNumber = employeePhoneNumber;
	}
	public Date getEmployeeHireDate() {
		return employeeHireDate;
	}
	public void setEmployeeHireDate(Date employeeHireDate) {
		this.employeeHireDate = employeeHireDate;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public void setDepartment(Department department){
		this.department=department;
	}
	public Department getDepartment()
	{
		return department;
	}

	
	
	

}
