package com.employeeproblem;

public class EmployeeProb {

	public static void main(String[] args) 
	{
		int IS_ATTENDANCE=1,IS_Wage_Per_Hour=20,IS_Full_Day=8;
		int daily_employee_wage=0;
		double empCheck=Math.floor(Math.random()*10)%2;
		if(IS_ATTENDANCE==empCheck)
		{
			System.out.println("Employee is Present");
			daily_employee_wage=IS_Wage_Per_Hour*IS_Full_Day;
			System.out.println("Employee Daily wage is:"+daily_employee_wage);
		}
		else
		{
			System.out.println("Employee is Absent");
			daily_employee_wage=IS_Wage_Per_Hour*0;
			System.out.println("Since employee is absent so his daily wage:"+daily_employee_wage);
		}

	}

}
