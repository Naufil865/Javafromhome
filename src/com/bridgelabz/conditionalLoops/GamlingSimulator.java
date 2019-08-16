package com.bridgelabz.conditionalLoops;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class GamlingSimulator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Utility utility = new Utility();
		
		int stake,goal,trails;
		System.out.println("Enter the Stake : ");
		stake = scanner.nextInt();
		System.out.println("Enter the goal : ");
		goal = scanner.nextInt();
		System.out.println("Enter the trails : ");
		trails = scanner.nextInt();
		
		utility.CalculateGamlingSimulator(stake, goal, trails);
		
		
		scanner.close();

	}

}
