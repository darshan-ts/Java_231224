package com.week3;


/*
 * 
 * Constructor is used to initialize Object
 * Constructor name is must be same like its class name
 * Constructor should not have any return type
 * Constructor can have access modifier, let's say public
 * constructor can not be declare with static,abstract,final
 * constructor get called by JVM
 * At the time of object creation we called constructor
 * Constructor overloading is possible but overriding is not possible, because overriding is possible only for methods that can be inherited. 
 * Hence constructor cannot be inherited and overriding is also not allowed.
 * 
 * Types:
 * 1.Default constructor(called by jvm)
 * 2.parameterized constructor
 * 
 * 
 * 
 * 
 */
public class ConstructorDemo
{
	
	//instance variable
		int id;
		String name;
		
		//default constructor - When we declare constructor and we don't pass any data to it, then it is called as default constructor.
		public ConstructorDemo()
		{
			System.out.println("Default constructor is calling!");
			System.out.println(id);
			System.out.println(name);
		}
		//parameterized constructor
		public ConstructorDemo(int i,String n)//2 parameters i ,n are local
		{//initialize object--->assigning local data to instance data
			
			System.out.println("Parameterized constructor is calling!");
			id=i;
			name=n;
			
			System.out.println(id);
			System.out.println(name);
			
			
		}
		public static void main(String[] args)
		{
			ConstructorDemo c1=new ConstructorDemo();//default constructor
			
			ConstructorDemo c2=new ConstructorDemo(101,"Darshan T S");//parameterized
			
			



		}

}
