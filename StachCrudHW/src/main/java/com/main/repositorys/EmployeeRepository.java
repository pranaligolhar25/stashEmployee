package com.main.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
	public Employee deleteByEmpId(int id);

}
