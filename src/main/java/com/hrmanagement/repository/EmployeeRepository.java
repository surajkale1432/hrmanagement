package com.hrmanagement.repository;

import com.hrmanagement.entity.Department;
import org.springframework.data.repository.CrudRepository;

import com.hrmanagement.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
	
	Integer deleteByEmployeeId(Integer employeeId);
//	Department findByEmployeeId(Integer employeeId);
}
