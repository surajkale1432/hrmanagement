package com.hrmanagement.controller;

import java.util.List;

import com.hrmanagement.projectiondtos.EmployeeProjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hrmanagement.entity.Employee;
import com.hrmanagement.repository.EmployeeRepository;

import jakarta.transaction.Transactional;

@RestController
@Transactional
public class EmployeeController{
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	
//	@GetMapping("employees")
//	public List<EmployeeDTO> getEmployees(){
//		List<EmployeeDTO> employeeDTOS = new ArrayList<>();
//		List<Employee> realEmployees= (List<Employee>) employeeRepository.findAll();
//		DepartmentDTO departmentDTO=null;
//		for(Employee employee:realEmployees){
//			DepartmentDTO departmentDTOS;
//			Department realDepartment = employee.getDepartment();
//
//			for(int i=0;i<realEmployees.size();i++){
//				departmentDTO= new DepartmentDTO(realDepartment.getDepartmentId(),realDepartment.getDepartmentName(),null);
//			}
//			EmployeeDTO employeeDTO = new EmployeeDTO(employee.getEmployeeId(),employee.getEmployeeFirstName(),employee.getEmployeeLastName(), employee.getEmployeeEmail(),employee.getEmployeePassword(),employee.getEmployeePhoneNumber(),employee.getEmployeeHireDate(),employee.getEmployeeSalary(),departmentDTO);
//			employeeDTOS.add(employeeDTO);
//		}
//		return employeeDTOS;
//	}

	@GetMapping("employees")
	public List<EmployeeProjection> getEmployees()
	{
		return (List<EmployeeProjection>) employeeRepository.findBy();
	}

	@GetMapping("employee/{employeeId}")
	public EmployeeProjection getEmployeeByEmployeeId(@PathVariable int employeeId){
		return (EmployeeProjection) employeeRepository.findByEmployeeId(employeeId);
	}

	@PostMapping("employee/login")
	public EmployeeProjection getEmployeeLogIn(@RequestBody Employee employee){
		EmployeeProjection emp= employeeRepository.findByEmployeeEmailAndEmployeePassword(employee.getEmployeeEmail(),employee.getEmployeePassword());
		if(emp!=null)
		{
			return emp;
		}
		else {
			return null;
		}
	}

	@PostMapping("employees")
	public Employee saveEmployees(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}
	
//	@PutMapping("employees/{id}")
//	public ResponseEntity<Employee> updateEmployee(@PathVariable long id, @RequestBody Employee newEmployee)
//	{
//		Employee updateEmployee = employeeRepository.findByEmployeeId((int)id);
//	}
	@DeleteMapping("employees/{id}")
	public String deleteEmployee(@PathVariable int id){
		
		int result = employeeRepository.deleteByEmployeeId(id);
		if(result==1)
		{
			return "OK";
		}
		else
			return "Not Ok";
	}
	

}
