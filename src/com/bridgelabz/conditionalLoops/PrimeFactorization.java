package com.bridgelabz.conditionalLoops;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class PrimeFactorization {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Utility utility = new Utility();
		
		int n;
		System.out.println("Enter the Number : ");
		n = scanner.nextInt();
		int fact=1;
		for(int i = 2; i*i <= n ; i++ ) {
			if(utility.PrimeNumber(n)) {
				fact = utility.CalulateFactorial(n);
				System.out.println("Factorial of prime Number  "+ n +" is : "+ fact);
			}else
				System.out.println("Not a Prime Number");
		}
		scanner.close();
	}

}
