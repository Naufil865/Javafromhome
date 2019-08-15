/****************************************************************************** *  
 *  Purpose: Operation On 3 Double checking the precedence
 *
 *  @author  Naufil
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class DoubleOpt {

	public static void main(String[] args) {
		Utility utility = new Utility();
	
		Scanner scanner = new Scanner(System.in);
		double a,b,c,result;
		System.out.println("Enter Double number for a:");
		a= scanner.nextDouble();
		System.out.println("Enter Double number for b:");
		b= scanner.nextDouble();
		System.out.println("Enter Double number for c:");
		c= scanner.nextDouble();
		result = utility.doubleopertaions(a, b, c);
		System.out.println(result);
		scanner.close();
		
	}

}
