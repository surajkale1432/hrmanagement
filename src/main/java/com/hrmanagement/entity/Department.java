package com.hrmanagement.entity;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int departmentId;
	String departmentName;
	@OneToMany(mappedBy="department")
	private List<Employee> employees;
	

	public Department() {
		super();
	}

	public Department(int departmentId, String departmentName, int managerId, int locationId,List<Employee> employees) {
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

	public void setEmployees(List<Employee> employees){
		this.employees=employees;
	}
	public List<Employee> getEmployees(){
		return this.employees;
	}
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", managerId="
				 +", locationId=" + "]";
	}
	
}
