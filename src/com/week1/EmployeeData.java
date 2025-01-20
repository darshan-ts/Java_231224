package com.week1;

/*
 * 26-12-2024
=================
Assignment 1: 
create a Employee class with two variables empid and empname 
and display 5 employee details.
 */

public class EmployeeData {
	
	//data
	int empid;
	String empname;
	
	//method/function
	public void display()
	{
		System.out.println("Employee id is: "+empid);
		System.out.println("Employee name is: "+empname);
		
	}

	public static void main(String[] args) {
		// to call member of a class we need to create object using new keyword
		EmployeeData e1 = new EmployeeData();
		//e1.display();
		e1.empid = 101;
		e1.empname = "darshan";
		e1.display();
		
		EmployeeData e2 = new EmployeeData();
		//e2.display();
		e2.empid = 102;
		e2.empname = "ABC";
		e2.display();
		
		EmployeeData e3 = new EmployeeData();
		//e3.display();
		e3.empid = 103;
		e3.empname = "XYZ";
		e3.display();
		
		EmployeeData e4 = new EmployeeData();
		//e4.display();
		e4.empid = 104;
		e4.empname = "ts";
		e4.display();
		
		EmployeeData e5 = new EmployeeData();
		//e5.display();
		e5.empid = 105;
		e5.empname = "dws";
		e5.display();
		
		
	

	}

}
