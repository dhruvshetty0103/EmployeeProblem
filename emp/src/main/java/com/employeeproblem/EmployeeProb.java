package com.employeeproblem;

import java.util.Scanner;

/* Class compute created within which employee daily wage is
 * calculated which in turn help in monthly wage calculation
 * @param isWagePerHour is a hourly fixed rate for that company
 * @param isFullDayHours is a fixed number of hours that a employ works in a full day for that company
 * @param isPartTimeHours is a fixed number of hours that a employ works in a part time for that company
 * @param isMaxMonthlyDays is a max fixed number of days that a employ can work in a month for that company
 * @param isMaxWorkingHours is a max fixed number of days that a employ can work in a month for that company
 */
class Compute
{
	void newCompany(String companyName,int isWagePerHour,int isFullDayHours,int isPartTimeHours,int isMaxMonthlyDays,int isMaxWorkingHours)
	{
		int monthly_wage=0,working_hours=0,working_days=0;
		//Will stop calculating the employee monthly wage when either of the max limits of max working hours or days is achieved 
		//@param empCheck to generate random values in range of 0-2 where a floor will ignore decimal part
		while(working_hours<isMaxWorkingHours && working_days<isMaxMonthlyDays)
		{
			int empCheck=(int)(Math.floor(Math.random()*10)%3);
			switch(empCheck)
			{
			case 1:monthly_wage+=computeWage(isWagePerHour,isFullDayHours);
				   working_hours+=isFullDayHours;//Adding 8 working hours when full day
				   working_days+=1;//Adding 1 day every time irrespective of type of attendance
				   break;
			case 2:monthly_wage+=computeWage(isWagePerHour,isPartTimeHours);
			   	   working_hours+=isPartTimeHours;//Adding 4 working hours when part time
				   working_days+=1;//Adding 1 day every time irrespective of type of attendance
			   	   break;
			default:monthly_wage+=computeWage(isWagePerHour,0);
				    working_hours+=0;//Adding 0 working hours when absent
				    working_days+=1;//Adding 1 day every time irrespective of type of attendance
				    break;
			}
		}
		System.out.println("Employee monthly wage is:"+monthly_wage+" for company: "+companyName);
		//Condition to check which is reached first working hours or days
		if(working_hours==isMaxWorkingHours && working_days!=isMaxMonthlyDays)
			System.out.println("Number of working hours reached first:"+working_hours+" within:"+working_days+" working days.");
		else
			System.out.println("Number of working days reached first:"+working_days+" with:"+working_hours+" working hours.");

	}
	
	int computeWage(int x,int y)
	{
		return x*y;
	}
}

public class EmployeeProb 
{
	public static void main(String[] args) 
	{
		Scanner reader=new Scanner(System.in);
		String companyName;
		char anotherCompanyComputation='y';
		int isWagePerHour,isFullDayHours,isPartTimeHours,isMaxMonthlyDays,isMaxWorkingHours;
		do
		{
			System.out.println("Enter company name:");
			companyName=reader.next();
			System.out.println("Enter wage per hour:");
			isWagePerHour=reader.nextInt();
			System.out.println("Enter number of full day hours:");
			isFullDayHours=reader.nextInt();
			System.out.println("Enter number of part day hours:");
			isPartTimeHours=reader.nextInt();
			
			System.out.println("Enter number of maximum working day in the month");
			isMaxMonthlyDays=reader.nextInt();
			System.out.println("Enter number of maximum working hours in the month");
			isMaxWorkingHours=reader.nextInt();
			
			Compute obj=new Compute();
			obj.newCompany(companyName,isWagePerHour,isFullDayHours,isPartTimeHours,isMaxMonthlyDays,isMaxWorkingHours);
			
			System.out.println("To calculate employee wage for another company press letter 'y' or 'Y");
			anotherCompanyComputation=reader.next().charAt(0);
		}while(anotherCompanyComputation=='y'||anotherCompanyComputation=='Y');
		
		reader.close();
	}

}
