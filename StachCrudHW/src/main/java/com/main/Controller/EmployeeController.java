package com.main.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	@PostMapping("/saveEmployee")
	public ResponseEntity<Employee> saveData(@RequestBody Employee emp)
	{
		Employee empDb=employeeServise.saveData(emp);
		return new ResponseEntity<Employee>(empDb, HttpStatus.CREATED);
		
		
	}
	@GetMapping("/GetAllData")
	public ResponseEntity<List<Employee>> getAllData()
	{
		List<Employee> empList=employeeServise.getAllData();
		return new ResponseEntity<List<Employee>>(empList, HttpStatus.OK);

	}
	@GetMapping("GetByID/{empId}")
	public ResponseEntity<Employee> getDataById(@PathVariable int empId)
	{
		Employee singleData=employeeServise.getDataById(empId);
		return new ResponseEntity<Employee>(singleData, HttpStatus.OK);

		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Employee> deleteData(@PathVariable int id)
	{
	   Employee emp=employeeServise.deleteData(id);	
		return new ResponseEntity<Employee>(emp,HttpStatus.OK);
		
	}
}
