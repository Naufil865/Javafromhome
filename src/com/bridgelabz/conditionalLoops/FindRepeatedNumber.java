package com.bridgelabz.conditionalLoops;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class FindRepeatedNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Utility utility = new Utility();
		int arr[] = {1,2,3,4,5,6,7,9,8,9};	
		int result;
		result = utility.findRepeatedNumber(arr);
		System.out.println("Reapeated Number is : " + result);
		scanner.close();
	}

}
