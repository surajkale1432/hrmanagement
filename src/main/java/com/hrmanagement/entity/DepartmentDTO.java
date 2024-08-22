package com.hrmanagement.entity;

import java.util.List;
public class DepartmentDTO {


    int departmentId;
    String departmentName;
    private List<EmployeeDTO> employees;

    public DepartmentDTO() {
        super();
    }

    public DepartmentDTO(int departmentId, String departmentName,List<EmployeeDTO> employees) {
        super();
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.employees=employees;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setEmployees(List<EmployeeDTO> employees){
        this.employees=employees;
    }
    public List<EmployeeDTO> getEmployees(){
        return this.employees;
    }
    @Override
    public String toString() {
        return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
    }
}
