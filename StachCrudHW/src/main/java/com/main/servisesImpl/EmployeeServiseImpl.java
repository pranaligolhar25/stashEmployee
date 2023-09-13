package com.main.servisesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.Model.Employee;
import com.main.repositorys.EmployeeRepository;
import com.main.servises.EmployeeServise;

@Service
public class EmployeeServiseImpl implements EmployeeServise
{

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee deleteData(int id)
	{
		
		return employeeRepository.deleteByEmpId(id);
	}

	@Override
	public Employee saveData(Employee emp)
	{
		return employeeRepository.save(emp);
	}

	@Override
	public List<Employee> getAllData() 
	{
		return employeeRepository.findAll();
	}

	@Override
	public Employee getDataById(int empId)
	{
		return employeeRepository.findById(empId);
	}
}
