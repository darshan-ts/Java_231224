package com.week3;

class A
{
	A(ThisKeywordDemo5 t)
	{
		System.out.println("I am A constructor..."+t.amount);
	}
}


public class ThisKeywordDemo5 
{
	
	//this can be passed as argument in the constructor call.

		int amount=9000;
		public ThisKeywordDemo5()
		{
			System.out.println("Default constructor calling");
			//System.out.println("Amount is: "+amount);
			//this keyword we are passing as argument to constructor
			A a1=new A(this); // current class object passed as argument to constructor
			//this keyword will help to call or pass as argument to constructor. We can't pass same object in the constructor.
			//Better what we can do, for any other class current class constructor/object we can pass using this keyword.
			
		}
		public static void main(String[] args) 
		{
			ThisKeywordDemo5 t1=new ThisKeywordDemo5();
			


		}

}
