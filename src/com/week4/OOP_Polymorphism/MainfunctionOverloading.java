package com.week4.OOP_Polymorphism;

public class MainfunctionOverloading {
	public static void main(String[] args) {

		System.out.println("main() with string arguments");
		int arr[]= {10,20,30};
		main(arr);

	}

	public static void main(int[] args) {

		System.out.println("main() with int arguments");
		for(int i:args) //args is a current method array name and this needs to be passed as array name
		{
			System.out.println(i);
		}


	}

}
