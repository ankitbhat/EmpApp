package com.empapp.service;
import com.empapp.model.Employee;
public class EmployeeWageComp
{
	Employee emp = new Employee();
	public void empCheck()
	{
		int empCheck = (int)Math.floor(Math.random() * 100) % 3;
		switch(empCheck)
		{
			case 1:
				System.out.println("Employee is Present and Full Time");
				System.out.println("Daily Employee Wage is :" + emp.dailyFullWage());
				break;
			case 2:
				System.out.println("Employee is Present and Part Time");
				System.out.println("Daily Employee Wage is :" + emp.dailyPartWage());
				break;
			case 0:
				System.out.println("Employee is Absent");
				break;
		}
	}
}
