package com.bridgelabz.conditionalLoops.taylorseries;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Sin {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Utility utility = new Utility();
		
		int x,oddseries;
		double angleX;
		
		System.out.print("Enter Degree between 0 to 360 : ");
		x = scanner.nextInt();
		System.out.println("Enter Odd Series : ");
		oddseries = scanner.nextInt();
		

		
		if(x>=0 && x<=360) {
			if(oddseries % 2 !=0) {
				angleX = utility.calulateAngleX(x);
				utility.calulateSinx(angleX, oddseries);
			}else {
				System.out.println("Enter Vaild Odd Number!!");
				}
			}else {
				System.out.println("Enter Valid Degree between 0 to 360!!");
			}
		scanner.close();
	}

}
