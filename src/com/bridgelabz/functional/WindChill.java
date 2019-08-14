/****************************************************************************** *  
 *  Purpose: Calculate tempertaure in Fahernaite(Wind Chill) 
 *
 *  @author  Naufil
 *  @version 1.0
 *  @since   14-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class WindChill {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Utility utility =  new Utility();
		int temperature,velocity;
		double windchill,tempinfahrenheit=0,speed;
		
		System.out.println("Enter value for temperature : ");
		temperature = scanner.nextInt();
		
		System.out.println("Enter value for Velocity : ");
		velocity = scanner.nextInt();
		
		if(temperature <= 50 && temperature > 0 && velocity >= 3 && velocity <= 120)
		{
			tempinfahrenheit = utility.CelsiusToFahrenheit(temperature);
			speed = utility.velocityIntoSpeed(velocity);
			speed = Math.pow(speed, 0.16);
			windchill = utility.calculateWindChill(tempinfahrenheit, speed);
			System.out.println("By Calulating WindChill : " + windchill);
			
		}else {
			System.out.println("please enter right value .... ");
			
		}
		scanner.close();

	}

}
