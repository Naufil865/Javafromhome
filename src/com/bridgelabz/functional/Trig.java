/****************************************************************************** *  
 *  Purpose: Calculate Trignometric function in radians 
 *
 *  @author  Naufil
 *  @version 1.0
 *  @since   14-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Trig {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Utility utility = new Utility();
		int degree;
		double radian,sin,cos,tan,cot,sec,cosec;
		System.out.println("Enter Degree :");
		degree = scanner.nextInt();
		
		radian = utility.findRadian(degree);
		
		sin = utility.findSin(radian);
		System.out.println("Sin (" +degree+ ")"+ sin);
		cos = utility.findCos(radian);
		System.out.println("Cos ("+degree+")"+cos);
		tan = utility.findTan(radian);
		System.out.println("Tan ("+degree+")"+ tan);
		
		cot = utility.findCot(radian);
		System.out.println("Cot("+degree+")"+cot);
		sec = utility.findSec(radian);
		System.out.println("Sec ("+degree+")"+ sec);
		cosec = utility.findCosec(radian);
		System.out.println("Cosec("+degree+")"+cosec);
		
		scanner.close();
	}

}
