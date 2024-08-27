package com.hrmanagement.repository;

import com.hrmanagement.projectiondtos.EmployeeProjection;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.hrmanagement.entity.Employee;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
	
	Integer deleteByEmployeeId(Integer employeeId);
	List<EmployeeProjection> findBy();
	List<EmployeeProjection> findByEmployeeFirstName(String employeeFirstName);
	List<EmployeeProjection> findByEmployeeLastName(String employeeLastName);
	EmployeeProjection findByEmployeeId(Integer employeeId);
//	@Query("select e from Employee e where e.employeeName = ?1 and e.employeePassword = ?2")
	EmployeeProjection findByEmployeeEmailAndEmployeePassword(String employeeEmail, String employeePassword);
}
