package com.week4.OOP_DataAbstraction;

public class ChildClass extends SampleTest
{
//inherited abstract method
	@Override
	public void display() {

		System.out.println("This is implemented by child");
		
	}
	//individual
	public void data()
	{
		System.out.println("This is data from child!");
	}
	public static void main(String[] args)
	{
		System.out.println("Child class ref and child class object");

			ChildClass c1=new ChildClass();
			c1.accept();//inherited
			c1.display();//inherited abstract
			c1.data();//individual
			
		System.out.println("Parent class ref and parent class object:Invalid");

		//SampleTest s1=new SampleTest(); //Cannot instantiate the type SampleTest	 because it has abstract method(non implemented method)
		
		System.out.println("Parent class ref and child class object");
		
		SampleTest s1=new ChildClass();
		s1.accept();
		s1.display(); // this method is coming from parent only. But it is over rided by its child and we get updated result from child class.
	}

	

}
