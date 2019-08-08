package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Quadratic {

	public static void main(String[] args) {
		int a,b,c;
		double delta;
		
		Scanner scanner = new Scanner(System.in);
		Utility utility = new Utility();
		System.out.println("Enter number a : ");
		a = scanner.nextInt();

		System.out.println("Enter number b : " );
		b = scanner.nextInt();

		System.out.println("Enter number c : " );
		c = scanner.nextInt();
		
		delta = utility.deltaoperation(a, b, c);
		System.out.println("Delta value : " + delta);
		
		scanner.close();

	}

}
