package com.week3;

public class BuilderPattern {
	
	//this can be used to return the current class instance from the method.

		//method into Object
		public BuilderPattern startBrowser()
		{
			System.out.println("Browser started!");
			return this;//return current class instance/object
		}

		
		public BuilderPattern launchApp()
		{
			System.out.println("Application launched!");
			return this;
		}
		
		public void stopBrowser()
		{
			System.out.println("Browser stopped!");
		}
		
		public static void main(String[] args) 
		{
			BuilderPattern b1=new BuilderPattern();
			b1.startBrowser().launchApp().stopBrowser();
			/*
			 * Whenever method is returning current class object, it means we are converting method in the form of object using "this" keyword.
			 * 	Then only we can write code in chain fashion called as method chaining. 
			 * This is how Selenium developers built logic under the hood to call one method from another.
			 * Entire Selenium development is based on the same principle.

			 */
			

		}

}
