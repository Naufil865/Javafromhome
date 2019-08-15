/****************************************************************************** *  
 *  Purpose: Finding Leap Year
 *
 *  @author  Naufil
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Utility utility = new Utility();
		int year,result;
		System.out.println("Enter The year : " );
		year = scanner.nextInt();
		
		result = utility.leapyear(year);

		//System.out.println(year);
		System.out.println(result);

	scanner.close();
	}

}
