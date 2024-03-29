/****************************************************************************** *  
 *  Purpose: This file contains logic for all the programs. This is done 
 *           so that most of our code/logic becomes reusable.
 *
 *  @author  Naufil
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.utility;

public class Utility {

	/**
	 * Purpose: Logic for adding 2 numbers
	 * 
	 * @param firstNumber  the first number to add
	 * @param secondNumber the second number to add
	 * @return result sum of the 2 numbers
	 */
	public int sumOfNumbers(int firstNumber, int secondNumber) {
		int result = firstNumber + secondNumber;
		return result;
	}

	/**
	 * @param firstNumber  the first number to subtract
	 * @param secondNumber the second number to subtract
	 * @return result subtract of the 2 numbers
	 */
	public int subtractOfNumbers(int firstNumber, int secondNumber) {
		int result = firstNumber - secondNumber;
		return result;
	}

	/**
	 * @param a the first number
	 * @param b the second number
	 * @param c the third number
	 * @return multiplying and adding the numbers
	 */
	public int integeropertaions(int a, int b, int c) {
		int result = a + b * c;
		return result;
	}

	/**
	 * @param a the first number
	 * @param b the second number
	 * @param c the third number
	 * @return multiplying and adding the numbers
	 */
	public int integeropertaions2(int a, int b, int c) {
		int result = a * b + c;
		return result;
	}

	/**
	 * @param a the first number
	 * @param b the second number
	 * @param c the third number
	 * @return dividing and adding the numbers
	 */
	public int integeropertaions3(int a, int b, int c) {
		int result = c + a / b;
		return result;
	}

	/**
	 * @param a the first number
	 * @param b the second number
	 * @param c the third number
	 * @return modulo and adding the numbers
	 */
	public int integeropertaions4(int a, int b, int c) {
		int result = a % b + c;
		return result;
	}

	/**
	 * @param a the first number
	 * @param b the second number
	 * @param c the third number
	 * @return result mathematical expression for double number
	 */
	public double doubleopertaions(double a, double b, double c) {
		double result;
		result = a + b * c;
		System.out.println("a + b *c :" + result);
		result = a * b + c;
		System.out.println("a + b *c :" + result);
		result = c + a / b;
		System.out.println("a + b *c :" + result);
		result = a % b + c;
		System.out.println("a + b *c :" + result);
		return result;
	}

	/**
	 * @param year Takes Input For Leap year
	 * @return Result Of Leap Year or Not
	 */
	public int leapyear(int year) {

		if (year >= 1582) {
			if ((year % 100 != 0 && year % 4 == 0) || (year % 400 == 0)) {
				System.out.println("It is a Leap Year :");
			} else {
				System.out.println("Not a Leap Year : ");
			}

		} else {
			System.out.println("Not Determine");
		}
		return year;
	}

	/**
	 * @param m		input months
	 * @param d		input days
	 * @return		boolean value
	 */
	public boolean springseason(int m, int d) {
		if (m >= 3 && m <= 6) {
			if (m == 3 && d <= 20) {
				return false;
			}

			else if (m == 6 && d >= 20) {
				return false;
			} else {
				return true;
			}

		} else {
			return false;
		}

	}
	
	public double deltaoperation(int a,int b,int c) {
		double delt = ( b * b )-( 4 * a * c);
			double delta = Math.abs(delt);
		return delta;
	}
	
	public double QuadraticEqn(int a,int b,double delta) {
		double root1,d;
		d = Math.sqrt(delta);
		root1 = (-b + d) / (2 * a);
		return root1;
		
	}
	


	public double QuadraticEqn2(int a,int b,double delta) {
		double root1,d;
		d = Math.sqrt(delta);
		root1 = (-b - d) / (2 * a);
		return root1;
		
	}
	

	/**
	 * @param x distance of x in integer 
	 * @param y	distance of y in integer
	 * @return distance 
	 */

	public double distance(int x, int y) {
		int d = (x*x + y*y);
		double distance = Math.sqrt(d);
		return distance;
	}
	

	/**
	 * @param min integer value 
	 * @param max integer value	
	 * @return random
	 */
	public int getRandomNumber(int min ,int max) {
		int range = max - min + 1;
		int random = (int)(Math.random() * range ) + 1;
		return random;
	}
	
	
	/**
	 * @param a input of array index 1
	 * @param b input of array index 2
	 * @return compare and return minimum number
	 */
	public double mathMinNumber(double a, double b) {
		return Math.min(a, b);
	}
	
	/**
	 * @param a input of array index 1
	 * @param b input of array index 2
	 * @return compare and return maximum
	 */
	public double mathMaxNumber(double a, double b) {
		return Math.max(a, b);
	}
	
	/**
	 * @return random number
	 */
	public double mathRandomNumber() {
		return Math.random();
	}
	
	/**
	 * Purpose: Method is written for Converting Temperature Fahrenheit to Celsius
	 * 
	 * @param temperatureInFerenheit
	 * @return temperatureInCelcius return temperature in celsius
	 */
	public double FahrenheitToCelsius(double temperatureInFerenheit) {
		double temperatureInCelcius;
		temperatureInCelcius = ((temperatureInFerenheit - 32) * 5) / 9;
		return temperatureInCelcius;
	}

	/**
	 * Purpose: Method is written for Converting Temperature Celcius to Fahrenheit
	 * 
	 * 
	 * @param temperatureInCelsius
	 * @return temperatureInFahrenheit return temperature in fahrenheit
	 */
	public double CelsiusToFahrenheit(double temperatureInCelsius) {
		double temperatureInFahrenheit;
		temperatureInFahrenheit = ((temperatureInCelsius * 9) / 5) + 32;
		return temperatureInFahrenheit;
	}

	
	/**
	 * @param velocity
	 * @return
	 */
	public double velocityIntoSpeed(int velocity) {
		double speed;
		speed = velocity * 0.609;
		return speed;
	}


	
	/**
	 * @param tempinfahrenheit 
	 * @param speed
	 * @return
	 */
	public double calculateWindChill(double tempinfahrenheit , double speed) {
		double a,b,c,windchill;
		a = 0.6215 * tempinfahrenheit;
		b = 0.4275 * tempinfahrenheit;
		c = b - 35.75;
		windchill = 35.74 + a + c * speed;
		//windchill cannot be negative so abs
		windchill = Math.abs(windchill);
		return windchill;
		
	}
	
	/**
	 * @param degree
	 * @return
	 */
	public double findRadian(int degree) {
		return Math.toRadians(degree);
	}
	
	public double findSin(double radian) {
		return Math.sin(radian);
	}
	
	public double findCos(double radian) {
		return Math.cos(radian);
	}
	
	public double findTan(double radian) {
		return Math.tan(radian);
	}
	
	public double findCot(double radian) {
		double cot;
		cot = 1 / Math.tan(radian);
		return cot;
	}
	
	public double findSec(double radian) {
		double sec;
		sec =  1 / Math.cos(radian);
		return sec;
	}
	
	public double findCosec(double radian){
		double cosec;
		cosec = 1 / Math.sin(radian); 
		return cosec;
	}
	
	/**
	 * @param timescoin
	 */
	public void flipCoin(int timescoin) {
		double percentagehead,percentagetail;
		int headCount=0,tailCount=0;
		
		for(int i =0 ; i < timescoin ; i++) {
			if(Math.random() < .5) {
				System.out.println("Heads");
				headCount++;
			}
			else {
				System.out.println("Tails");
				tailCount++;
			}
		}
		percentagehead = (int) headCount * 100 / timescoin;
		percentagetail = (int) tailCount * 100 / timescoin;
		System.out.println("Percentage of Heads is : " + percentagehead);
		System.out.println("Percentage of Tails is : " + percentagetail);

	}
	
	/**
	 * @param number
	 * @param powerValue
	 * @return
	 */
	public int PowerOfTwo(int number, int powerValue) {
		int result;
		result = (int) Math.pow(number, powerValue);
		return result;
	}
	
	/**
	 * @param number
	 */
	public void PrintHarmonic(int number) {
		System.out.print("H=");
		for (int i = 1; i <= number; i++) {
			if (i != number) {
				System.out.print("1/" + i);
				System.out.print(" + ");
			} else {
				System.out.print("1/" + i);
			}

		}
	}
	
	/**
	 * @param day
	 * @param month
	 * @param year
	 * @return
	 */
	public int CalculateDayOfWeek(int day,int month,int year) {
		int y0,m0,d0,x;
		y0 = year - (14 - month) / 12 ;
		x  = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		m0 = month + 12 * ((14 - month) / 12) - 2;
		d0 = (day + x + 31 * m0 / 12) % 7;
		return d0;
	}
	
	public double calulateCarLoan(double p,int y,double r) {
		double payment,n,Rate;
		n = 12  * y;
		Rate = r / (12 * 100); 
		payment = p * Rate / (1 - Math.pow(1 + r, -n));
		return payment;
	}
	
	public double CalulateSqrt(int c) {
		double t,epsilon;
		t = c;
		epsilon = 1e-15;
		while(Math.abs(t - c/t) > epsilon * t)
		{
			t = ((c / t) + t) / 2;
		}
		return t;
	}
	
	/**
	 * @param stake
	 * @param goal
	 * @param trails
	 */
	public void CalculateGamlingSimulator(int stake,int goal,int trails) {
		int percentagewin = 0;
		int tempstake = stake;
		int trail = 0;
		int win = 0;
		
		for(int i = 1 ; i <= trails ; i++) {
			while(tempstake > 0 && tempstake < goal) {
				if(Math.random() > 0.5) {
					tempstake++;
					trail++;
					///win
					
				}else {
					tempstake--;
					trail++;
					
					///loose
				}
				if(tempstake == goal) {
					win++;
				}
			}
		}
		percentagewin = win * 100 / trails;
		System.out.println("Game Won : " + win);
		System.out.println("Percentage Win : " + percentagewin);
		System.out.println("Average number of bets Made :" + trail / trails);
	}

	/**
	 * @param number
	 * @return
	 */
	public boolean PrimeNumber(int number) {
		if (number == 0 || number == 1) {
			return false;
		} else {
			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					return false;
				}
			}
			return true;
		}
	}
	
	public int SwapNibbles(int decToBinary) {
		return (((decToBinary & 0x0F) << 4) | ((decToBinary & 0xF0) >> 4));

	}
	
	public void PatternForK() {
		for(int i=1 ; i <= 9 ; i++ ) {
			for(int j=1 ; j<=13 ; j++) {
				if(i == 1) {
					if(j > 2 && j <= 10)
						System.out.print(" ");
					else
						System.out.print("*");
				}
				if(i == 2) {
					if(j > 2 && j <= 8)
						System.out.print(" ");
					else if(j > 11)
						System.out.print(" ");
					else
						System.out.print("*");
				}
				if(i == 3) {
					if( j > 2 && j <= 6)
						System.out.print(" ");
					else if( j > 9)
						System.out.print(" ");
					else
						System.out.print("*");
				}
				if(i == 4) {
					if (j > 2 && j <= 4)
						System.out.print(" ");
					else if(j > 7)
						System.out.print(" ");
					else
						System.out.print("*");
				}
				if (i == 5) {
					if (j > 5 && j <= 13)
						System.out.print(" ");
					else
						System.out.print("*");
				}
				if(i == 6) {
					if(j > 2 && j <= 4 )
						System.out.print(" ");
					else if(j > 7)
						System.out.print(" ");
					else
						System.out.print("*");
				}
				if(i == 7 ) {
					if(j > 2 && j <= 6)
						System.out.print(" ");
					else if(j > 9)
						System.out.print(" ");
					else
						System.out.print("*");
				}
				if(i == 8 ) {
					if(j > 2 && j <= 8)
						System.out.print(" ");
					else if(j > 11)
						System.out.print(" ");
					else
						System.out.print("*");
				}
				if(i == 9) {
					if(j > 2 && j <= 10 ) {
						System.out.print(" ");
					}
						else {
							System.out.print("*");
					}
				}
				
				
			}
			System.out.println();
		}
		
			
	}
	
	/**
	 * 
	 */
	public void PatternPrintD() {
		for(int i=1 ; i <= 9 ;i++) {
			for(int j=1 ; j <=13 ; j++) {
				switch(i) {
				case 1: 
					if(j > 10 && j <= 13) {
					System.out.print("");
					}else
					{
					System.out.print("*");
					}
					break;
				case 2:
					if(j > 2 && j <= 10)
						System.out.print(" ");
					else
					
						System.out.print("*");
					break;
				case 3:
					if(j > 2 && j <= 10)
						System.out.print(" ");
					else
					
						System.out.print("*");
					break;
			
				case 4:
					if(j > 2 && j <= 10)
						System.out.print(" ");
					else
					
						System.out.print("*");
					break;
				case 5:
					if(j > 2 && j <= 10)
						System.out.print(" ");
					else
					
						System.out.print("*");
					break;
				case 6:
					if(j > 2 && j <= 10)
						System.out.print(" ");
					else
					
						System.out.print("*");
					break;
				case 7:
					if(j > 2 && j <= 10)
						System.out.print(" ");
					else
					
						System.out.print("*");
					break;
				case 8:
					if(j > 2 && j <= 10)
						System.out.print(" ");
					else
					
						System.out.print("*");
					break;
				case 9:
					if(j > 10 && j <=13 )
						System.out.print("");
					else
						System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	/**
	 * @param x
	 * @return
	 */
	public double calulateAngleX(int x) {
		x = x % (2 * 180);
		return x;
	}
	
	public int CalulateFactorial(int n) {
		int fact = 1;
		for(int i = 1 ; i <= n ; i++) {
			fact = fact * i;
		}
		return fact;		
	}
	
	/**
	 * @param angleX
	 * @param oddseries
	 */
	public void calulateSinx(double angleX,int oddseries) {
		
		int count = 1;
		System.out.print("Sin"+ angleX + " = " + angleX + " - ");
		for(int i = 3 ;i <= oddseries ; i=i+2) {
			if(count % 2 !=0) {
				System.out.print(Math.pow(angleX, i) + " / " + CalulateFactorial(i));
				if(i != oddseries) {
					System.out.print(" + ");
				}
				count++;
			}else {
				System.out.print(Math.pow(angleX, i)+ " / " + CalulateFactorial(i));
				if( i !=oddseries) {
					System.out.print(" - ");
				}
			}
		}
	}
	
	/**
	 * @param angleX
	 * @param evenseries
	 */
	public void calulateCosx(double angleX , int evenseries) {
		int count = 1;
		System.out.print("cos"+ angleX + " = " + " 1 - ");
		for(int i = 2 ; i<=evenseries ; i=i+2) {
			if(count % 2 == 0 ) {
			System.out.print(Math.pow(angleX, i) + " / " + CalulateFactorial(i));
				if(i != evenseries) {
					System.out.print(" + ");
				}
				count++;
			}else {
				System.out.print(Math.pow(angleX, i) + " / " + CalulateFactorial(i));
				if(i != evenseries) {
					System.out.print( " - " );
				}
			}
		}
	}
	
	public int findRepeatedNumber(int[] arr) {
		for(int i=0 ; i < arr.length ; i++) {
			for(int j = i + 1 ; j < arr.length ;j++) {
				if(arr[i] == arr[j]) {
					return arr[i];
				}
			}
		}
		return 0;
	}
	
	public int SecondSmallest(int small ,int secondsmall,int []arr) {
		for(int i=0 ; i<arr.length ; i++) {
			if(arr[i] < small) {
				secondsmall = small;
				small = arr[i];
			}else if(arr[i] < secondsmall && arr[i] != small) {
				secondsmall = arr[i];
			}
		}
		return secondsmall;
	}
	
	public int SecondLargest(int large,int secondlarge,int []arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > large) {
				secondlarge = large;
				large = arr[i];				
			}else if(arr[i] < secondlarge && arr[i] != large) {
				secondlarge = arr[i];
			}
		}
		return secondlarge;
	}
}


