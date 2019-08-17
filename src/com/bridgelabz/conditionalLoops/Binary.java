/****************************************************************************** *  
 *  Purpose: Print Binary Number From Decimal
 *
 *  @author  Naufil
 *  @version 1.0
 *  @since   15-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.conditionalLoops;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Binary {

	public static void main(String[] args) {

//		int number, mod;
//		String binary = "";
//		System.out.println("Enter integer to find decimal to binary: ");
//		number = scanner.nextInt();
//		while (number > 0) {
//			mod = number % 2;
//			binary = binary + "" + mod;
//			number = number / 2;
//		}
//		System.out.println(binary);
//		scanner.close();
		
		Scanner scanner = new Scanner(System.in); 
		Utility utility = new Utility();
		
		
		int decimalNumber,a;
		int decToBinary;
		String x = " ";
		int resultOfSwapNibbles;
		
		System.out.println("Enter the Number : ");
		decimalNumber = scanner.nextInt();
		decToBinary = decimalNumber;
		
		if(decToBinary > 255) {
			System.out.println("Please enter value betwwn 1 to 255 ");
			}
		else {
			while(decimalNumber > 0) {
				a  = decimalNumber % 2;
				x = a + " " + x;
				decimalNumber = decimalNumber / 2;
			}
		}
		System.out.println("Binary is: " + x);

		resultOfSwapNibbles = utility.SwapNibbles(decToBinary);
		System.out.println("Result of Swap Nibbles of binary number: "+resultOfSwapNibbles);
	scanner.close();	
	}
	

}
