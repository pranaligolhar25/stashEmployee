package com.main.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class BankDetails 
{
	@Id
	private int bankId;
	private String bankName;
	private String addr;
	private int pincode;

}
