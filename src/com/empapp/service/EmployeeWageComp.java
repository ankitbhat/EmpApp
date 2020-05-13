package com.empapp.service;
import com.empapp.model.Employee;
public class EmployeeWageComp
{
	Employee emp = new Employee();
	public void empCheck()
	{
	double empCheck = Math.floor(Math.random() * 10) % 2;
		if(empCheck == emp.FULLTIME)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}
}
