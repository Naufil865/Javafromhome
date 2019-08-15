/****************************************************************************** *  
 *  Purpose: Subtraction of 2 integers
 *
 *  @author  Naufil
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/


package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class SubtractOfIntegers {

	public static void main(String[] args) {
		
		Utility utility = new Utility();
		
		int firstNumber, secondNumber, result;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number :");
		firstNumber = scanner.nextInt();
		System.out.println("Enter Second Number :");
		secondNumber = scanner.nextInt();
		
		result = utility.subtractOfNumbers(firstNumber, secondNumber);
		System.out.println("Result of Subtraction : " + result);
		scanner.close();
		
	}

}
