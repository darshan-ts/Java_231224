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
			

		}

}
