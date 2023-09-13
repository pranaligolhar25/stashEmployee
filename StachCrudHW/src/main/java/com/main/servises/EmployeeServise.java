package com.main.servises;

import java.util.List;

import com.main.Model.Employee;

public interface EmployeeServise {

	Employee saveData(Employee emp);

	List<Employee> getAllData();

	Employee getDataById(int empId);
	Employee deleteData(int id);

}
