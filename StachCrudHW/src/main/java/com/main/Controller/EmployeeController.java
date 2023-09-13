package com.main.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.main.servises.EmployeeServise;

@RestController
public class EmployeeController 
{
	
	@Autowired
	EmployeeServise employeeServise;

}
