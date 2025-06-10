package com.week3;

public class ThisKeywordDemo4 
{
	//this can be passed as an argument in the method call.

		int id=101;
		
		public void show(StudentDetails s) // passing any other class object to this particular method
		{
			System.out.println("This is show() calling!");
			s.display();
			//Method call using this keyword
			show2(this); // here method is accepting this keyword as an argument, means current class as an object
		}
		
		public void show2(ThisKeywordDemo4  t) //this method is capable to read/accepting current class object
		{
			System.out.println("Id is: "+id);
		}
		public static void main(String args[])
		{
			ThisKeywordDemo4  t1=new ThisKeywordDemo4 ();
				//t1.show2(t1); calling and passing object to this method
				
			StudentDetails s1=new StudentDetails(102,"Seema");
			//method call by passing object
			t1.show(s1); // we are passing StudentDetails s1 object and show() is reading object from StudentDetails class
				
		}

}
