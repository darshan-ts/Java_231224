package com.week3;

public class ThisKeywordDemo1 {

	/*
	 * This keyword always points/refer to current class Object 
	 * This Keyword is used to call instance variable and instance method 
	 * Somewhere if we write constructor variables same as instance variable names, then local to local
	 * initialization happens by constructor. But local to instance variable
	 * initialization doesn't happen by constructor. Here comes the concept of
	 * "this keyword" to resolve this problem.
	 * 
	 * 
	 * this can be used to refer current class instance variable. 
	 * this can be used to invoke current class method (implicitly)
	 * this() can be used to invoke current class constructor. 
	 * this can be passed as an argument in the method call.
	 * this can be passed as argument in the constructor call. 
	 * this can be used to return the current class instance from the method. It is related to Builder pattern concept. It is related to Selenium.
	 * 
	 * 
	 */
	int eid;
	String ename;

	public ThisKeywordDemo1(int eid, String ename) {
		System.out.println("Constructor calling");
		// local to instance
		this.eid = eid;
		this.ename = ename;
		System.out.println("Employee id: " + this.eid);
		System.out.println("Employee name: " + this.ename);

	}

	public void display() {
		System.out.println("display Method calling");

		System.out.println(eid);
		System.out.println(ename);
	}

	public static void main(String[] args) {
		ThisKeywordDemo1 e1 = new ThisKeywordDemo1(101, "darshants");
		e1.display();

	}

}
