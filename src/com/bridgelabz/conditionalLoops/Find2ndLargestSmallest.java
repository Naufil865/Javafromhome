package com.bridgelabz.conditionalLoops;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Find2ndLargestSmallest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Utility utility = new Utility();
		
		int arr[]= {20,22,24,26,28,30};
		int small,secondsmall,large,secondlarge;
		small = Integer.MAX_VALUE;
		secondsmall = Integer.MAX_VALUE;
		large = Integer.MIN_VALUE;
		secondlarge = Integer.MIN_VALUE;
		
		secondsmall = utility.SecondSmallest(small, secondsmall, arr);
		System.out.println("Second Smallest Number in Array : "+secondsmall);
		secondlarge = utility.SecondLargest(large, secondlarge, arr);
		System.out.println("Second Largest Number in Array : "+secondlarge);
		
	}

}
