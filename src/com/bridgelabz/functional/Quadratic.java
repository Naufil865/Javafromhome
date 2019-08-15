package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Quadratic {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Utility utility = new Utility();
		
		int a,b,c;
		double delta,root1,root2;

		

		
		System.out.println("Enter number a : ");
		a = scanner.nextInt();

		System.out.println("Enter number b : " );
		b = scanner.nextInt();

		System.out.println("Enter number c : " );
		c = scanner.nextInt();
		
		delta = utility.deltaoperation(a, b, c);
		System.out.println("delta : " + delta);
		root1 = utility.QuadraticEqn(a,b,delta);
		System.out.println("root1 : " + root1);
		
		root2 = utility.QuadraticEqn2(a,b,delta);
		System.out.println("root2 : " + root2);
		
		scanner.close();

	}

}
