package com.tyss.ems.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.ems.Entity.Employee;
import com.tyss.ems.dto.EmployeeDto;
import com.tyss.ems.response.Response;
import com.tyss.ems.service.EmployeeService;

@RestController
public class EmployeeAdminController {

	private static final String EMPLOYEE_DELETED_SUCCSESFULLY = "EMPLOYEE_DELETED_SUCCSESFULLY";
	private static final String EMPLOYEE_UPDATED_SUCCSESFILLY = "EMPLOYEE UPDATED SUCCSESFILLY";
	private static final String EMPLOYEE_DETAILS_FETCH_SUCCSESFU_LL_Y = "EMPLOYEE_DETAILS_FETCH_SUCCSESFULlY";
	private static final String EMPLOYEE_ADDED_SUCCESFULLY = "EMPLOYEE_ADDED_SUCCESFULLY";
	private EmployeeService service;

	@PostMapping("/addUser")
	public ResponseEntity<Response> addUser(@RequestBody EmployeeDto dto) {
		Employee employee = service.addEmployee(dto);
		return new ResponseEntity<Response>(new Response(false, EMPLOYEE_ADDED_SUCCESFULLY, employee), HttpStatus.OK);
	}

	@GetMapping("/get-emplloyee/{empId}")
	public ResponseEntity<Response> getEmployee(@PathVariable int empId) {
		Employee employee = service.getEmployee(empId);
		return new ResponseEntity<Response>(new Response(false, EMPLOYEE_DETAILS_FETCH_SUCCSESFU_LL_Y, employee),
				HttpStatus.OK);
	}

	@PutMapping("/updateEmployee")
	public ResponseEntity<Response> updateEmployee(@RequestBody EmployeeDto dto) {
		Employee employee = service.addEmployee(dto);
		return new ResponseEntity<Response>(new Response(false, EMPLOYEE_UPDATED_SUCCSESFILLY, employee),
				HttpStatus.OK);
	}

	@DeleteMapping("/deleteUsere/{empId}")
	public ResponseEntity<Response> addUser(@PathVariable int impId) {
		service.deleteEmployee(impId);
		return new ResponseEntity<Response>(new Response(false, EMPLOYEE_DELETED_SUCCSESFULLY),
				HttpStatus.OK);
	}
	
	@GetMapping("/getAllemplloyee")
	public ResponseEntity<Response> getEmployee() {
		List<Employee> employee = service.getAllEmployeeDetails();
		return new ResponseEntity<Response>(new Response(false, EMPLOYEE_DETAILS_FETCH_SUCCSESFU_LL_Y, employee),
				HttpStatus.OK);
	}
	
	

}
