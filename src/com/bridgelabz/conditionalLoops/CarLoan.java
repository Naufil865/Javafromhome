package com.bridgelabz.conditionalLoops;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class CarLoan {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Utility utility = new Utility();
		
		int p,y;
		double r,result;
		System.out.println("Enter the Payment : ");
		p = scanner.nextInt();
		System.out.println("Enter the Year : ");
		y = scanner.nextInt();
		System.out.println("Enter the Rate : ");
		r = scanner.nextInt();
		
		result = utility.calulateCarLoan(p, y, r);
		System.out.println("Your Car Loan Monthly Payment : " + result);
	
		scanner.close();
	}

}
