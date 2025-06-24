
package com.week4.OOP_Inheritance;

public class TestCar {

	public static void main(String[] args)
	{
		System.out.println("Child ref and Child Object");
		BMW b1=new BMW();
		b1.start();//inherited
		b1.refuel();//inherited
		b1.stop();//inherited
		b1.autoEngine();//individual
		b1.breakFeature();
		b1.price();
		//child ref and child object
		
		Audi a1=new Audi();
		a1.start();//inherited
		a1.refuel();//inherited
		a1.stop();//inherited
		a1.autoGear();//individual
		a1.breakFeature();
		a1.price();
		
		System.out.println("Parent ref and Parent Object");

		Car c1=new Car();
		c1.start();//individual
		c1.refuel();//individual
		c1.stop();//individual
		c1.breakFeature();
		
		Vehicle v1=new Vehicle();
		v1.breakFeature();

		System.out.println("Parent ref and Child Object");
		
		Car c2=new BMW();
		c2.start();//individual
		
		c2.refuel();//individual
		
		c2.stop();//individual
		c2.breakFeature();
		
		Car c3=new Audi();
		c3.start();
		c3.refuel();
		c3.stop();
		c3.breakFeature();
		
		
		
		
		

	}

}
