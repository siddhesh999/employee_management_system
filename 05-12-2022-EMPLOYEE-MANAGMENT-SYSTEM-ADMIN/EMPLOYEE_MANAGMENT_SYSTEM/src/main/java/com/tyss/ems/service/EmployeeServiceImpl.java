package com.tyss.ems.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.ems.Entity.Employee;
import com.tyss.ems.customeexception.EmployeeCoustomeException;
import com.tyss.ems.dto.EmployeeDto;
import com.tyss.ems.reporitory.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private static final String EMPLOYEE_NOT_PRESENT_IN_DATABASE = "employee not present in database";

	private static final String DETAILS_NOT_FOUNT = "employee details not fount";

	private static final String INVALID_DATA_ADDED = "employee Details Not Filled Proper";

	@Autowired
	private EmployeeRepository repository;

	@Override
	public Employee addEmployee(EmployeeDto dto) {
		try {
			if (dto == null) {
				throw new EmployeeCoustomeException(INVALID_DATA_ADDED);
			}
			Employee employee = new Employee();
			BeanUtils.copyProperties(dto, employee);
			Employee save = repository.save(employee);
			return save;
		} catch (EmployeeCoustomeException e) {
			throw e;
		}
	}

	@Override
	public Employee getEmployee(int empId) {
		try {
			Optional<Employee> findById = repository.findById(empId);
			if (!findById.isPresent()) {
				throw new EmployeeCoustomeException(DETAILS_NOT_FOUNT);
			}
			return findById.get();
		} catch (EmployeeCoustomeException e) {
			throw e;
		}

	}

	@Override
	public Employee updateEmployee(Employee dto) {
		Optional<Employee> findById = repository.findById(dto.getEmpId());
		BeanUtils.copyProperties(dto, findById);
		Employee save = repository.save(findById.get());
		return save;
	}

	@Override
	public void deleteEmployee(int empId) {
		repository.deleteById(empId);
	}

	@Override
	public List<Employee> getAllEmployeeDetails() {
		try {
			List<Employee> findAll = repository.findAll();
			if (findAll.isEmpty()) {
				throw new EmployeeCoustomeException(EMPLOYEE_NOT_PRESENT_IN_DATABASE);
			} else {
				return findAll;
			}
		} catch (EmployeeCoustomeException e) {
			throw e;
		}
	}

}
