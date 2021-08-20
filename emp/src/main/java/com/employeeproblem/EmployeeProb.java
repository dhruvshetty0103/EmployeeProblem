package com.employeeproblem;

public class EmployeeProb 
{
	public static final int IS_FULL_TIME=1,IS_PART_TIME=2,IS_WAGE_PER_HOUR=20,IS_FULL_DAY_HOURS=8,IS_PART_TIME_HOURS=4;

	public static void main(String[] args) 
	{
		int daily_employee_wage=0;
		double empCheck=Math.floor(Math.random()*10)%3;
		if(IS_FULL_TIME==empCheck)
		{
			System.out.println("Employee is Full day Present");
			daily_employee_wage=IS_WAGE_PER_HOUR*IS_FULL_DAY_HOURS;
			System.out.println("Employee Daily wage is:"+daily_employee_wage);
		}
		else if(IS_PART_TIME==empCheck)
		{
			System.out.println("Employee is Part time Present");
			daily_employee_wage=IS_WAGE_PER_HOUR*IS_PART_TIME_HOURS;
			System.out.println("Employee Daily wage is:"+daily_employee_wage);
		}
		else
		{
			System.out.println("Employee is Absent");
			daily_employee_wage=IS_WAGE_PER_HOUR*0;
			System.out.println("Since employee is absent so his daily wage:"+daily_employee_wage);
		}

	}

}
