package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class PatternPrint {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Utility utility = new Utility();
		
		String s;
		char alphabet;
		System.out.println("Please select K or D number for pattern:");
		s = scanner.next();
		s = s.toLowerCase();
		alphabet = s.charAt(0);
		
		switch(alphabet) {
		case 'k':
			utility.PatternForK();
			break;
		case 'd':
			utility.PatternPrintD();
			break;
		}
		scanner.close();
		

	}

}
