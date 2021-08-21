package com.employeeproblem;

public class EmployeeProb 
{
	public static final int IS_WAGE_PER_HOUR=20,IS_FULL_DAY_HOURS=8,IS_PART_TIME_HOURS=4,IS_MONTHLY_DAYS=20;
	//IS_FULL_TIME=1,IS_PART_TIME=2 removed these variables to implement switch case
	//Here above are global variables where full time and part time are values to show nature of attendance
	//and full day hours and part time hours are nothing but number of hours worked per day.

	public static void main(String[] args) 
	{
		int daily_employee_wage=0,monthly_wage=0;
		int empCheck=(int)(Math.floor(Math.random()*10)%3);//To generate random values in range of 0-2 where a floor will ignore decimal part
		switch(empCheck)
		{
		case 1:System.out.println("When employee works Full day throughout the month");
			   daily_employee_wage=IS_WAGE_PER_HOUR*IS_FULL_DAY_HOURS;//Calculation of monthly wage
			   monthly_wage=daily_employee_wage*IS_MONTHLY_DAYS;
			   System.out.println("Employee monthly wage is:"+monthly_wage);
			   break;
		case 2:System.out.println("When employee works Part time a day throughout the month");
		   	   daily_employee_wage=IS_WAGE_PER_HOUR*IS_PART_TIME_HOURS;//Calculation of monthly wage
		   	   monthly_wage=daily_employee_wage*IS_MONTHLY_DAYS;
		   	   System.out.println("Employee monthly wage is:"+monthly_wage);
		   	   break;
		default:System.out.println("When an employee is Absent throughout the month");
			    daily_employee_wage=IS_WAGE_PER_HOUR*0;
			    monthly_wage=daily_employee_wage*IS_MONTHLY_DAYS;
			    System.out.println("His monthly wage:"+monthly_wage);
			    break;
		}

	}

}
