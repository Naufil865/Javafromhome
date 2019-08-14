/****************************************************************************** *  
 *  Purpose: Calculate Power Of 2
 *
 *  @author  Naufil
 *  @version 1.0
 *  @since   14-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class PowerOf2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Utility utility = new Utility();
		int n,result,powerofnumber;
		System.out.println("Enter the Number : ");
		n = scanner.nextInt();
		
		powerofnumber = utility.PowerOfTwo(2, n);
		
		for(int i = 1; i <= powerofnumber ; i++) {
		result = utility.PowerOfTwo(i, 2);
		System.out.println(i + " Power of 2 :"+ result);
		
		}
		scanner.close();
	}

}
