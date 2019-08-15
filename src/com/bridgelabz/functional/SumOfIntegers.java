/****************************************************************************** *  
 *  Purpose: Addition of 2 integers
 *
 *  @author  Naufil
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class SumOfIntegers {

	public static void main(String[] args) {
		
		Utility utility = new Utility();
		int firstNumber, secondNumber, result;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number: ");
		firstNumber = scanner.nextInt();
		System.out.println("Enter second number: ");
		secondNumber = scanner.nextInt();
		
		result = utility.sumOfNumbers(firstNumber, secondNumber);
		System.out.println("Result: " + result);
		scanner.close();
	}
}
