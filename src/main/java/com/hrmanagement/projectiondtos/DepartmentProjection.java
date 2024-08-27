package com.hrmanagement.projectiondtos;

import java.util.List;

public interface DepartmentProjection {

    public Integer getDepartmentId();
    public String getDepartmentName();
    public List<Employee> getEmployees();
    public interface Employee{
        public Integer getEmployeeId();
        public String getEmployeeFirstName();
        public String getEmployeeLastName();
    }
}
