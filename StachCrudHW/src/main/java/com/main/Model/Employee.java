package com.main.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee 
{
	@Id
	private int empId;
	private String empName;
	private long mobno;
	@OneToMany(cascade = CascadeType.ALL)
	private BankDetails bankDetails;

}
