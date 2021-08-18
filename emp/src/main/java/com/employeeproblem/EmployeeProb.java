package com.employeeproblem;

public class EmployeeProb {

	public static void main(String[] args) 
	{
		int IS_ATTENDANCE=1;
		double empCheck=Math.floor(Math.random()*10)%2;
		if(IS_ATTENDANCE==empCheck)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");

	}

}
