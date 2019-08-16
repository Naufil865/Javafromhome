/****************************************************************************** *  
 *  Purpose: Print Day while calulating from Gregorian Calendar
 *
 *  @author  Naufil
 *  @version 1.0
 *  @since   15-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.conditionalLoops;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class DayOfWeek {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Utility utility = new Utility();
		
		int month,day,year,d1;
		System.out.println("Enter the Day : ");
		day = scanner.nextInt();
		System.out.println("Enter the Month : ");
		month = scanner.nextInt();
		System.out.println("Enter the Year : ");
		year = scanner.nextInt();
		
		d1 = utility.CalculateDayOfWeek(day, month, year);
		switch(d1)
		{
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
			
		}
		
		
		scanner.close();
		

	}

}
