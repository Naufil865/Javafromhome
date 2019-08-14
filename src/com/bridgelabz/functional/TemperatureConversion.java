/****************************************************************************** *  
 *  Purpose: Calculate tempertaure conversion ( Fahernaite ,celsius)
 *
 *  @author  Naufil
 *  @version 1.0
 *  @since   14-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class TemperatureConversion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Utility utility = new Utility();
		
		Double temperatureinfahrenheit,temperatureincelsius;
		
		System.out.println("Enter Temperature in Fahrenheit : ");
		temperatureinfahrenheit = scanner.nextDouble();
		temperatureincelsius = utility.FahrenheitToCelsius(temperatureinfahrenheit);
		System.out.println("Your enter fahrenheit : " + temperatureinfahrenheit +" celsius :  "+ temperatureincelsius );
		
		System.out.println("Enter Temperature in Celsius : ");
		temperatureincelsius = scanner.nextDouble();
		temperatureinfahrenheit = utility.CelsiusToFahrenheit(temperatureincelsius);
		System.out.println("You enter celsius : " + temperatureincelsius + "Fahrenheit : " + temperatureinfahrenheit);
		scanner.close();

	}

}
