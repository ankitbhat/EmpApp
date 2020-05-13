package com.empapp.service;
import com.empapp.model.Employee;
public class EmployeeWageComp
{
	int temp=0;
	int tempWage=0;
	Employee emp = new Employee();
	public void empCheck()
	{
		for(int i=0;i<20;i++)
		{
			int empCheck = (int)Math.floor(Math.random() * 100) % 3;
			switch(empCheck)
			{
				case 1:
					System.out.println("Employee is Present and Full Time");
					System.out.println("Daily Employee Wage is :" + emp.dailyFullWage());
					temp = emp.dailyFullWage();
					break;
				case 2:
					System.out.println("Employee is Present and Part Time");
					System.out.println("Daily Employee Wage is :" + emp.dailyPartWage());
					temp = emp.dailyPartWage();
					break;
				case 0:
					System.out.println("Employee is Absent");
					temp = 0;
					break;
			}
			emp.setMonthlyWage(tempWage+=temp);
		}
		System.out.println("Monthly wage is :" + emp.getMonthlyWage());
	}
}
