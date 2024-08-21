package com.hrmanagement.entity;

import java.sql.Date;



public class EmployeeDTO {


    private int employeeId;
    private String employeeFirstName;
    private String employeeLastName;
    private String employeeEmail;
    private long employeePhoneNumber;
    private Date employeeHireDate;
    private int employeeSalary;

    private DepartmentDTO department;

    public EmployeeDTO() {
        super();
    }
    public EmployeeDTO(int employeeId, String employeeFirstName, String employeeLastName, String employeeEmail,
                    long employeePhoneNumber, Date employeeHireDate,int employeeSalary,DepartmentDTO department) {
        super();
        this.employeeId = employeeId;
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.employeeEmail = employeeEmail;
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
    public void setDepartment(DepartmentDTO department){
        this.department=department;
    }
    public DepartmentDTO getDepartment()
    {
        return department;
    }
    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", employeeFirstName=" + employeeFirstName + ", employeeLastName="
                + employeeLastName + ", employeeEmail=" + employeeEmail + ", employeePhoneNumber=" + employeePhoneNumber
                + ", employeeHireDate=" + employeeHireDate +  ", employeeSalary="
                + employeeSalary + "]";
    }
}
