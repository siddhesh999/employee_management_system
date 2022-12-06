package com.tyss.ems.reporitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tyss.ems.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
