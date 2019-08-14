/****************************************************************************** *  
 *  Purpose: Harmonic Number
 *
 *  @author  Naufil
 *  @version 1.0
 *  @since   14-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.conditionalLoops;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class HarmonicNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Utility utility = new Utility();
		int number;
		System.out.println("Enter Number Uptil you want to Find Harmonic");
		number=scanner.nextInt();

		utility.PrintHarmonic(number);
scanner.close();
	}
}
