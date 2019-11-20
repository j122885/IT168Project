/*
* File name: CarpetDriver.java
*
* Programmer:Jeremy Howard
* ULID: jlhowa3
*
* Date: Oct 23, 2019
*
* Class: IT 168
* Lecture Section: 16
* Lecture Instructor: Tonya Pierce
* Lab Section: 17
* Lab Instructor: Kushal Sharma
*/
package edu.ilstu;

import java.util.Scanner;

/**
* <Calculates the total cost of a carpet>
*
* @author Jeremy Howard
*
*/
public class CarpetDriver
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the length of the carpet: ");
		double length = scan.nextDouble();
		
		System.out.print("Enter the width of the carpet: ");
		double width = scan.nextDouble();

		System.out.print("Enter the cost per square foot of the carpet:");
		double foot = scan.nextDouble();
		
		
		RoomDimension room = new RoomDimension( length, width);
		
		RoomCarpet total = new RoomCarpet( room, foot);
		
		
		System.out.println(total);
	}

}
