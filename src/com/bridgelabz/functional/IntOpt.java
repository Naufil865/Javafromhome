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

public class IntOpt {

	public static void main(String[] args) {
		Utility utility = new Utility();

		int a, b, c, result, operationselect;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Number For a :");
		a = scanner.nextInt();
		System.out.println("Enter the Number For b :");
		b = scanner.nextInt();
		System.out.println("Enter the Number For c :");
		c = scanner.nextInt();

		result = utility.integeropertaions(a, b, c);
		System.out.println("Result for a +b * c :" + result);

		System.out.println("Please Select operation \n 1. a+b*c. \n 2. a*b+c \n 3. c+a/b \n 4. a%b+c  ");
		loopdo: do {

			operationselect = scanner.nextInt();

			switch (operationselect) {
			case 1:
				result = utility.integeropertaions(a, b, c);
				System.out.println("Result for a +b * c :" + result);
				break;
			case 2:
				result = utility.integeropertaions2(a, b, c);
				System.out.println("Result for a * b + c:" + result);
				break;

			case 3:
				result = utility.integeropertaions3(a, b, c);
				System.out.println("Result for c + a / b:" + result);
				break;
			case 4:
				result = utility.integeropertaions4(a, b, c);
				System.out.println("Result for a % b + c :" + result);
				break;
			case 5:
				break loopdo;

			default:
				System.out.println("Please type correct value between 1 - 4");

			}
			System.out.println("Select another opertaion:");


		} while (true);
		scanner.close();
	}
}
