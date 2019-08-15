/****************************************************************************** *  
 *  Purpose: Spring Session and print true or false
 *
 *  @author  Naufil
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class SpringSession {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Utility utility = new Utility();
		int m,d;
		System.out.println("Enter Month : ");
		m = scanner.nextInt();
		System.out.println("Enter Day : ");
		d = scanner.nextInt();
		
		boolean res;
		res = utility.springseason(m, d);
		System.out.println("Result : " + res);

		scanner.close();

	}
}
