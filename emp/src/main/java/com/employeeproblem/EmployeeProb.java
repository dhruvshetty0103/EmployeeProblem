package com.employeeproblem;

class Compute//Class compute
{
	int Compute_wage(int x,int y)
	{
		return x*y;//Class compute created within which employee daily wage is calculated which in turn help in monthly wage calculation
	}
}

public class EmployeeProb 
{
	public static final int IS_WAGE_PER_HOUR=20,IS_FULL_DAY_HOURS=8,IS_PART_TIME_HOURS=4,IS_MONTHLY_DAYS=20;
	//IS_FULL_TIME=1,IS_PART_TIME=2 removed these variables to implement switch case
	//Here above are global variables where full time and part time are values to show nature of attendance
	//and full day hours and part time hours are nothing but number of hours worked per day.

	public static void main(String[] args) 
	{
		Compute obj=new Compute();
		int monthly_wage=0,working_hours=0,working_days=0;//daily_employee_wage=0
		
		while(working_hours<100 && working_days<20)
		{
			int empCheck=(int)(Math.floor(Math.random()*10)%3);//To generate random values in range of 0-2 where a floor will ignore decimal part
			switch(empCheck)
			{
			case 1://System.out.println("When employee works Full day throughout the month");
				   //daily_employee_wage=IS_WAGE_PER_HOUR*IS_FULL_DAY_HOURS;//Calculation of monthly wage
				   
				   monthly_wage+=obj.Compute_wage(IS_WAGE_PER_HOUR,IS_FULL_DAY_HOURS);
				   working_hours+=8;//Adding 8 working hours when full day
				   working_days+=1;//Adding 1 day every time irrespective of type of attendance
				   break;
			case 2://System.out.println("When employee works Part time a day throughout the month");
			   	   //daily_employee_wage=IS_WAGE_PER_HOUR*IS_PART_TIME_HOURS;//Calculation of monthly wage
			   	   monthly_wage+=obj.Compute_wage(IS_WAGE_PER_HOUR,IS_PART_TIME_HOURS);
			   	   working_hours+=4;//Adding 4 working hours when part time
				   working_days+=1;//Adding 1 day every time irrespective of type of attendance
			   	   break;
			default://System.out.println("When an employee is Absent throughout the month");
				    //daily_employee_wage=IS_WAGE_PER_HOUR*0;
				    monthly_wage+=obj.Compute_wage(IS_WAGE_PER_HOUR,0);
				    working_hours+=0;//Adding 0 working hours when absent
				    working_days+=1;//Adding 1 day every time irrespective of type of attendance
				    break;
			}
		}
		System.out.println("Employee monthly wage is:"+monthly_wage);//Calculating monthly basis depending on numbers of hours worked where per hour costs 20 
		if(working_hours==100 && working_days!=20)//Condition to check which is reached first working hours or days
			System.out.println("Number of working hours reached first:"+working_hours+" within:"+working_days+" working days.");
		else
			System.out.println("Number of working days reached first:"+working_days+" with:"+working_hours+" working hours.");

	}

}
