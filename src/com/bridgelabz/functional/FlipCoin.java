/****************************************************************************** *  
 *  Purpose: Calculate Coin Flip
 *
 *  @author  Naufil
 *  @version 1.0
 *  @since   14-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class FlipCoin {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Utility utility = new Utility();
		
		int coin;
		System.out.println("Enter the nUmber of time coin flip : ");
		coin = scanner.nextInt();
		utility.flipCoin(coin);
		scanner.close();
		
		
		
	}

}
