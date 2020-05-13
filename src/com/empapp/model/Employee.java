package com.empapp.model;
public class Employee
{
public static final int FULLTIME = 1;
public static final int PARTTIME = 2;
public static final int WAGEPERHOUR = 20;
public static final int FULLTIMEHOURS = 8;
public static final int PARTTIMEHOURS = 4;
int dailyEmpWage =0;
int monthlyWage = 0;
	public int dailyFullWage()
	{
		dailyEmpWage =(FULLTIMEHOURS*WAGEPERHOUR);
		return dailyEmpWage;
	}
	public int dailyPartWage()
	{
		dailyEmpWage =(PARTTIMEHOURS*WAGEPERHOUR);
		return dailyEmpWage;
	}
	public void setMonthlyWage(int monthlyWage)
	{
		this.monthlyWage = monthlyWage;
	}
	public int getMonthlyWage()
	{
		return this.monthlyWage;
	}
}
