package com.bridgelabz.conditionalLoops;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Sqrt {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Utility utility = new Utility();
		
		int c;
		double result;
		System.out.println("Enter Value for Sqrt Root:");
		c = scanner.nextInt();
		if(c > 0) {
		result = utility.CalulateSqrt(c);
		
		System.out.println("your sqrt for "+ c + "is :" + result);
		}
		else {
			System.out.println("Enter positive value...");
		}
		scanner.close();

	}

}
