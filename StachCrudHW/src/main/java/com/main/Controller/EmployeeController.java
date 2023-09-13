package com.main.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.main.Model.Employee;
import com.main.servises.EmployeeServise;

@RestController
public class EmployeeController 
{
	
	@Autowired
	EmployeeServise employeeServise;

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Employee> deleteData(@PathVariable int id)
	{
	   Employee emp=employeeServise.deleteData(id);	
		return new ResponseEntity<Employee>(emp,HttpStatus.OK);
		
	}
}
