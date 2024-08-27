package com.hrmanagement.projectiondtos;

import java.sql.Date;

public interface EmployeeProjection {
    public Integer getEmployeeId();
    public String getEmployeeFirstName();
    public String getEmployeeLastName();
    public String getEmployeeEmail();
    public  String getEmployeePassword();
    public Long getEmployeePhoneNumber();
    public Date getEmployeeHireDate();
    public Integer getEmployeeSalary();
    public Department getDepartment();

    public interface Department{
         public Integer getDepartmentId();
         public String getDepartmentName();
    }

}
