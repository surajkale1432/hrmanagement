package com.hrmanagement.controller;

import java.util.List;

import com.hrmanagement.projectiondtos.DepartmentProjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hrmanagement.entity.Department;
import com.hrmanagement.repository.DepartmentRepository;

import jakarta.transaction.Transactional;

@RestController
@Transactional

public class DepartmentController {
	
	@Autowired
	DepartmentRepository departmentRepository;

	@GetMapping("departments")
	public List<DepartmentProjection> getDepartments(){
		return(List<DepartmentProjection>) departmentRepository.findBy();
	}

	@GetMapping("department/{departmentId}")
	public DepartmentProjection getDepartment(@PathVariable int departmentId){
		return (DepartmentProjection) departmentRepository.findByDepartmentId(departmentId);
	}

	@GetMapping("department/find/{departmentName}")
	public List<DepartmentProjection> getDepartmentByDepartmentName(@PathVariable String departmentName){
		return (List<DepartmentProjection>) departmentRepository.findByDepartmentName(departmentName);
	}
	
//	@GetMapping("departments")
//	public List<DepartmentDTO> getDepartment(){
//		List<DepartmentDTO> departmentDTOS= new ArrayList<>();
//		List<Department> realDepartments =(List<Department>) departmentRepository.findAll();
//		for(Department department:realDepartments){
//			List<EmployeeDTO>employeesDTOS=new ArrayList<>();
//			List<Employee> realEmployee = department.getEmployees();
//			for(Employee employee:realEmployee){
//				EmployeeDTO employeeDTO = new EmployeeDTO(employee.getEmployeeId(),employee.getEmployeeFirstName(),employee.getEmployeeLastName(),employee.getEmployeeEmail(),employee.getEmployeePassword(),employee.getEmployeePhoneNumber(),employee.getEmployeeHireDate(),employee.getEmployeeSalary(),null);
//				employeesDTOS.add(employeeDTO);
//			}
//			DepartmentDTO departmentDTO = new DepartmentDTO(department.getDepartmentId(),department.getDepartmentName());
//			departmentDTOS.add(departmentDTO);
//		}
//		return departmentDTOS;
//	}
	
	@PostMapping("departments")
	public Department saveDepartment(@RequestBody Department department) {
		return departmentRepository.save(department);
	}
	
	@DeleteMapping("department/{departmentId}")
	public String deleteDepartment(@PathVariable int departmentId) {
		if(departmentRepository.deleteByDepartmentId(departmentId)==1)
		{
			return "Deleted Successfully";
		}
		else
				return "Record Not Found";
	}

}
