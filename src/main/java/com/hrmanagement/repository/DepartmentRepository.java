package com.hrmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.hrmanagement.entity.Department;

public interface DepartmentRepository extends CrudRepository<Department, Integer>{

//	Department findByDeparmentId(Integer departmentId);
	Integer deleteByDepartmentId(Integer departmentId);
	List<Department> findByDepartmentName(String departmentName);

	
}
