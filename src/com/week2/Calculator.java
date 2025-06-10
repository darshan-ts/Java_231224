package com.week2;

public class Calculator {

	//instance method--> call with object
	public void add()
	{
		int a=10,b=20;
		int add=a+b;
		int sub=a-b;
		int mul=a*b;
		int div=a/b;
		System.out.println("Addition of "+a+" and "+b+" is : "+add);
		System.out.println("Subtraction of "+a+" and "+b+" is : "+sub);
		System.out.println("Multiplication of "+a+" and "+b+" is : "+mul);
		System.out.println("Division of "+a+" and "+b+" is : "+div);
	}
	
	
		public static void add1()
		{
			int a=100,b=20;
			int add=a+b;
			int sub=a-b;
			int mul=a*b;
			int div=a/b;
			System.out.println("Addition of "+a+" and "+b+" is : "+add);
			System.out.println("Subtraction of "+a+" and "+b+" is : "+sub);
			System.out.println("Multiplication of "+a+" and "+b+" is : "+mul);
			System.out.println("Division of "+a+" and "+b+" is : "+div);
		}
	

	public static void main(String[] args) {
		
		Calculator c1=new Calculator();
		c1.add();
		System.out.println("*******************************************");
		add1();
		//Calculator.add1(); //This is also correct
	}
}



