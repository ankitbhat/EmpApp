package com.empapp.service;
import com.empapp.model.Employee;
public class EmployeeWageComp
{
	int temp=0;
	int tempWage=0;
	int days=1,hours=0;
	Employee emp = new Employee();
	public void empCheck()
	{
		while(days<21 && hours<100)
		{
			int empCheck = (int)Math.floor(Math.random() * 100) % 3;
			switch(empCheck)
			{
				case 1:
					System.out.println("Employee is Present and Full Time");
					System.out.println("Daily Employee Wage is :" + emp.dailyFullWage());
					temp = emp.dailyFullWage();
					hours+=emp.FULLTIMEHOURS;
					break;
				case 2:
					System.out.println("Employee is Present and Part Time");
					System.out.println("Daily Employee Wage is :" + emp.dailyPartWage());
					temp = emp.dailyPartWage();
					hours+=emp.PARTTIMEHOURS;
					break;
				case 0:
					System.out.println("Employee is Absent");
					temp = 0;
					hours+=0;
					break;
			}
			emp.setMonthlyWage(tempWage+=temp);
			System.out.println("Total Hours :" + hours);
			System.out.println("Total Days :" + days);
			System.out.println("Monthly wage is :" + emp.getMonthlyWage());
			days++;
		}
		
	}
}
