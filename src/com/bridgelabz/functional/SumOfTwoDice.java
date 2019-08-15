package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class SumOfTwoDice {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		Utility utility = new Utility();
		
		int firstRandomNumber,secondRandomNumber,sumOfDice;
		//random number is 1 to 6 because dice has 1 to 6 probability
		for(int i=0;i<=10;i++) {
			firstRandomNumber=utility.getRandomNumber(1,6);
			secondRandomNumber=utility.getRandomNumber(1,6);
			sumOfDice=firstRandomNumber+secondRandomNumber;
			System.out.print("First Dice "+firstRandomNumber);
			System.out.print(" Second Dice "+secondRandomNumber);
			System.out.println(" Sum of two dice" + i + "is " + sumOfDice);
		}
		scanner.close();
							
	}

}
