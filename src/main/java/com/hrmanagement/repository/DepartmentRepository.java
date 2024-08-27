package com.hrmanagement.repository;

import java.util.List;

import com.hrmanagement.projectiondtos.DepartmentProjection;
import org.springframework.data.repository.CrudRepository;

import com.hrmanagement.entity.Department;

public interface DepartmentRepository extends CrudRepository<Department, Integer>{

	Integer deleteByDepartmentId(Integer departmentId);
	List<DepartmentProjection> findBy();
	DepartmentProjection findByDepartmentId(Integer departmentId);
	List<DepartmentProjection> findByDepartmentName(String departmentName);
}
