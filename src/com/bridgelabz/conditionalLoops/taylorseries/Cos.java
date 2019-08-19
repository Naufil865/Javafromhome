package com.bridgelabz.conditionalLoops.taylorseries;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Cos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Utility utility = new Utility();
		
		int x,evenseries;
		double angleX; 
		
		System.out.println("Enter the Degree Between 0 to 360 : ");
		x = scanner.nextInt();
		System.out.println("Enter the Even Number : ");
		evenseries = scanner.nextInt();
		
		if(x >=0 && x<=360) {
			if(evenseries % 2 ==0) {
				angleX = utility.calulateAngleX(x);
				utility.calulateCosx(angleX, evenseries);
			}else {
				System.out.println("Enter Vaild Even Number!!");
				}
			}else {
				System.out.println("Enter Valid Degree between 0 to 360!!");
			}
		scanner.close();
	}

}
