package com.employeeproblem;
//Class compute
class Compute
{
	/* Class compute created within which employee daily wage is
	 * calculated which in turn help in monthly wage calculation
	 */
	int Compute_wage(int x,int y)
	{
		return x*y;
	}
}
/* @param IS_FULL_TIME=1 and @param IS_PART_TIME=2 removed these variables to implement switch case
 * Here above are global variables where full time and 
 * part time are values to show nature of attendance
 * and full day hours and part time hours are nothing 
 * but number of hours worked per day.
 * @param IS_WAGE_PER_HOUR is a hourly fixed rate
 * @param IS_FULL_DAY_HOURS is a fixed number of hours that a employ works in a full day
 * @param IS_PART_TIME_HOURS is a fixed number of hours that a employ works in a part time
 * @param IS_MONTHLY_DAYS is a fixed number of days that a employ can work in a month
 */
public class EmployeeProb 
{
	public static final int IS_WAGE_PER_HOUR=20,IS_FULL_DAY_HOURS=8,IS_PART_TIME_HOURS=4,IS_MONTHLY_DAYS=20;
	/* @param monthly_wage is a variable monthly wage which depends on max number of hours worked or max number of days
	 * @param working_hours is a variable used to store number of total hours worked in a month
	 * @param working_days is a variable used to store number of total days worked in a month
	 */
	public static void main(String[] args) 
	{
		Compute obj=new Compute();
		int monthly_wage=0,working_hours=0,working_days=0;//daily_employee_wage=0
		//Will stop calculating the employee monthly wage when either of the max limits of max working hours or days is achieved 
		//@param empCheck to generate random values in range of 0-2 where a floor will ignore decimal part
		while(working_hours<100 && working_days<20)
		{
			int empCheck=(int)(Math.floor(Math.random()*10)%3);
			switch(empCheck)
			{
			case 1:monthly_wage+=obj.Compute_wage(IS_WAGE_PER_HOUR,IS_FULL_DAY_HOURS);
				   working_hours+=8;//Adding 8 working hours when full day
				   working_days+=1;//Adding 1 day every time irrespective of type of attendance
				   break;
			case 2:monthly_wage+=obj.Compute_wage(IS_WAGE_PER_HOUR,IS_PART_TIME_HOURS);
			   	   working_hours+=4;//Adding 4 working hours when part time
				   working_days+=1;//Adding 1 day every time irrespective of type of attendance
			   	   break;
			default:monthly_wage+=obj.Compute_wage(IS_WAGE_PER_HOUR,0);
				    working_hours+=0;//Adding 0 working hours when absent
				    working_days+=1;//Adding 1 day every time irrespective of type of attendance
				    break;
			}
		}
		System.out.println("Employee monthly wage is:"+monthly_wage);
		//Condition to check which is reached first working hours or days
		if(working_hours==100 && working_days!=20)
			System.out.println("Number of working hours reached first:"+working_hours+" within:"+working_days+" working days.");
		else
			System.out.println("Number of working days reached first:"+working_days+" with:"+working_hours+" working hours.");

	}

}
