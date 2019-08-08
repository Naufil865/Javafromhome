package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Distance {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Utility utility = new Utility();
		
		int x,y;
		double result;

		System.out.println("Distance x: ");
		x = scanner.nextInt();
	
		System.out.println("Distance y: ");
		y = scanner.nextInt();
		
		result = utility.distance(x, y);
		System.out.println("Distance of x and y " + result);
		
		
		
				
	}

}
