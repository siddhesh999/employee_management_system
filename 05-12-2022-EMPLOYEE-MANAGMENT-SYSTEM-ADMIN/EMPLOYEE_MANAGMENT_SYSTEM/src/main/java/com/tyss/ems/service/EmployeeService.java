package com.tyss.ems.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tyss.ems.Entity.Employee;
import com.tyss.ems.dto.EmployeeDto;

@Service
public interface EmployeeService {

	Employee addEmployee(EmployeeDto dto);

	Employee getEmployee(int empId);

	Employee updateEmployee(Employee dto);

	void deleteEmployee(int empId);

	List<Employee> getAllEmployeeDetails();

}
