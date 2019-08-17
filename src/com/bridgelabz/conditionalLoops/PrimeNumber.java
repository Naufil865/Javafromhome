/****************************************************************************** *  
 *  Purpose: Print Prime Number 
 *
 *  @author  Naufil
 *  @version 1.0
 *  @since   15-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.conditionalLoops;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Utility utility = new Utility();
		
		int start,end;
		int numbersArray[];
		int countPrimeNumber = 0,j=0;
		
		System.out.println("Enter the Start Number : ");
		start = scanner.nextInt();
		System.out.println("ENter End number : ");
		end = scanner.nextInt();
		
		 numbersArray= new int[end];
		
		 for (int i = start; i <= end - 1; i++) {
				numbersArray[i] = i;
				if (utility.PrimeNumber(numbersArray[i])) {
					countPrimeNumber++;
				}
			}
			
			int primeNumberArray[] = new int[countPrimeNumber];
			
			for(int i=1;i<=end-1;i++) {
				if(utility.PrimeNumber(numbersArray[i])) {
					primeNumberArray[j]=numbersArray[i];
					j++;
				}
			}

			System.out.print("Prime Numbers is ");
			
			for (int i = 0; i <= primeNumberArray.length - 1; i++) {
				System.out.print(primeNumberArray[i] + " ");
			}
		 scanner.close();

	}

}
