/*
* File name: TimeCalculator.java
*
* Programmer:Jeremy Howard
* ULID: jlhowa3
*
* Date: Sep 11, 2019
*
* Class: IT 168
* Lecture Section: 16
* Lecture Instructor: Kushal Sharma
* Lab Section:17
* Lab Instructor:Tonya Pierce
*/
package edu.ilstu;

import java.util.Scanner;

/**
* <Calculates the number of hours, minutes, and seconds given the input of an amount of seconds>
*
* @author Jeremy Howard
*
*/
public class TimeCalculator
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{ 
		final int SECONDSTOHOURS = 3600;
		final int SECONDSTOMINUTES = 60;
		
		Scanner scan = new Scanner(System.in); 

		System.out.print("Enter number of seconds: "); 

		 

		
		int time = scan.nextInt(); 

		int hours = time/SECONDSTOHOURS; 

		int minutes =  (time%SECONDSTOHOURS)/SECONDSTOMINUTES;  

		int seconds =  ((time%SECONDSTOHOURS)%SECONDSTOMINUTES); 

		System.out.println("Hours: " + hours); 

		System.out.println("Minutes: " + minutes); 

		System.out.println("Seconds: " + seconds); 

	}

}
