package com.hrmanagement.controller;

import java.util.ArrayList;
import java.util.List;

import com.hrmanagement.entity.Department;
import com.hrmanagement.entity.DepartmentDTO;
import com.hrmanagement.entity.EmployeeDTO;
import org.hibernate.internal.CoreLogging;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.hrmanagement.entity.Employee;
import com.hrmanagement.repository.EmployeeRepository;

import jakarta.transaction.Transactional;

@RestController
@Transactional
@CrossOrigin
public class EmployeeController {

    private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);
    @Autowired
    EmployeeRepository employeeRepository;


    @GetMapping("employees")
    public List<EmployeeDTO> getEmployees() {
        log.info("GET CALL FOR ALL EMPLOYEES");
        List<EmployeeDTO> employeeDTOS = new ArrayList<>();
        List<Employee> realEmployees = (List<Employee>) employeeRepository.findAll();
        DepartmentDTO departmentDTO = null;
        for (Employee employee : realEmployees) {
            DepartmentDTO departmentDTOS;
            Department realDepartment = employee.getDepartment();

            for (int i = 0; i < realEmployees.size(); i++) {
                departmentDTO = new DepartmentDTO(realDepartment.getDepartmentId(), realDepartment.getDepartmentName(), null);
            }
            EmployeeDTO employeeDTO = new EmployeeDTO(employee.getEmployeeId(), employee.getEmployeeFirstName(), employee.getEmployeeLastName(), employee.getEmployeeEmail(), employee.getEmployeePassword(), employee.getEmployeePhoneNumber(), employee.getEmployeeHireDate(), employee.getEmployeeSalary(), departmentDTO);
            employeeDTOS.add(employeeDTO);
        }
        return employeeDTOS;
    }

    @PostMapping("employees")
    public Employee saveEmployees(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @DeleteMapping("employees/{id}")
    public String deleteEmployee(@PathVariable int id) {

        int result = employeeRepository.deleteByEmployeeId(id);
        if (result == 1) {
            return "OK";
        } else
            return "Not Ok";
    }


}
