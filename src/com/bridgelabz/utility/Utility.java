/****************************************************************************** *  
 *  Purpose: This file contains logic for all the programs. This is done 
 *           so that most of our code/logic becomes reusable.
 *
 *  @author  Naufil
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.utility;

public class Utility {

	/**
	 * Purpose: Logic for adding 2 numbers
	 * 
	 * @param firstNumber  the first number to add
	 * @param secondNumber the second number to add
	 * @return result sum of the 2 numbers
	 */
	public int sumOfNumbers(int firstNumber, int secondNumber) {
		int result = firstNumber + secondNumber;
		return result;
	}

	/**
	 * @param firstNumber  the first number to subtract
	 * @param secondNumber the second number to subtract
	 * @return result subtract of the 2 numbers
	 */
	public int subtractOfNumbers(int firstNumber, int secondNumber) {
		int result = firstNumber - secondNumber;
		return result;
	}

	/**
	 * @param a the first number
	 * @param b the second number
	 * @param c the third number
	 * @return multiplying and adding the numbers
	 */
	public int integeropertaions(int a, int b, int c) {
		int result = a + b * c;
		return result;
	}

	/**
	 * @param a the first number
	 * @param b the second number
	 * @param c the third number
	 * @return multiplying and adding the numbers
	 */
	public int integeropertaions2(int a, int b, int c) {
		int result = a * b + c;
		return result;
	}

	/**
	 * @param a the first number
	 * @param b the second number
	 * @param c the third number
	 * @return dividing and adding the numbers
	 */
	public int integeropertaions3(int a, int b, int c) {
		int result = c + a / b;
		return result;
	}

	/**
	 * @param a the first number
	 * @param b the second number
	 * @param c the third number
	 * @return modulo and adding the numbers
	 */
	public int integeropertaions4(int a, int b, int c) {
		int result = a % b + c;
		return result;
	}

	/**
	 * @param a the first number
	 * @param b the second number
	 * @param c the third number
	 * @return result mathematical expression for double number
	 */
	public double doubleopertaions(double a, double b, double c) {
		double result;
		result = a + b * c;
		System.out.println("a + b *c :" + result);
		result = a * b + c;
		System.out.println("a + b *c :" + result);
		result = c + a / b;
		System.out.println("a + b *c :" + result);
		result = a % b + c;
		System.out.println("a + b *c :" + result);
		return result;
	}

	/**
	 * @param year Takes Input For Leap year
	 * @return Result Of Leap Year or Not
	 */
	public int leapyear(int year) {

		if (year >= 1582) {
			if ((year % 100 != 0 && year % 4 == 0) || (year % 400 == 0)) {
				System.out.println("It is a Leap Year :");
			} else {
				System.out.println("Not a Leap Year : ");
			}

		} else {
			System.out.println("Not Determine");
		}
		return year;
	}

	/**
	 * @param m		input months
	 * @param d		input days
	 * @return		boolean value
	 */
	public boolean springseason(int m, int d) {
		if (m >= 3 && m <= 6) {
			if (m == 3 && d <= 20) {
				return false;
			}

			else if (m == 6 && d >= 20) {
				return false;
			} else {
				return true;
			}

		} else {
			return false;
		}

	}
	
	public double deltaoperation(int a,int b,int c) {
		double delt = ( b * b )-( 4 * a * c);
			double delta = Math.abs(delt);
		return delta;
	}
	
	public double QuadraticEqn(int a,int b,double delta) {
		double root1,d;
		d = Math.sqrt(delta);
		root1 = (-b + d) / (2 * a);
		return root1;
		
	}
	


	public double QuadraticEqn2(int a,int b,double delta) {
		double root1,d;
		d = Math.sqrt(delta);
		root1 = (-b - d) / (2 * a);
		return root1;
		
	}
	
	public double distance(int x, int y) {
		int d = (x*x + y*y);
		double distance = Math.sqrt(d);
		return distance;
	}
	
}
