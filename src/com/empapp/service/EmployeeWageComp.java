package com.empapp.service;
import com.empapp.model.Employee;
public class EmployeeWageComp
{
	Employee emp = new Employee();
	public void empCheck()
	{
	double empCheck = Math.floor(Math.random() * 100) % 3;
		if(empCheck == emp.FULLTIME)
		{
			System.out.println("Employee is Present and Full Time");
			System.out.println("Daily Employee Wage is :" + emp.dailyFullWage());
		}
		else if(empCheck == emp.PARTTIME)
		{
			System.out.println("Employee is Present and Part Time");
			System.out.println("Daily Employee Wage is :" + emp.dailyPartWage());
		}
		
		else
			System.out.println("Employee is Absent");
	}
}
