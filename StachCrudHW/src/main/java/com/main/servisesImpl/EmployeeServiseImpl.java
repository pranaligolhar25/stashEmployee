package com.main.servisesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.repositorys.EmployeeRepository;
import com.main.servises.EmployeeServise;

@Service
public class EmployeeServiseImpl implements EmployeeServise
{

	@Autowired
	EmployeeRepository employeeRepository;
}
