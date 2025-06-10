package com.week3;

public class StudentDetails
{
	int id;
	String name;
	
	StudentDetails(int i,String n)
	{
		id=i;
		name=n;
	}
	
	StudentDetails()
	{
		System.out.println("This is Student default constructor");
	}
	
	public void display()
	{
		System.out.println(id);
		System.out.println(name);
	}

	public static void main(String[] args) 
	{
		//creating multiple Student instances
		StudentDetails s = new StudentDetails();
		s.display();
		
		StudentDetails s1=new StudentDetails(101,"Darshan");
		s1.display();
		StudentDetails s2=new StudentDetails(102,"T S");
		s2.display();
		StudentDetails s3=new StudentDetails(103,"Reena");
		s3.display();
		StudentDetails s4=new StudentDetails(104,"Neelam");
		s4.display();
		

	}


}
