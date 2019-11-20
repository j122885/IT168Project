/*

* File name: CircleDriver.java
*
* Programmer:Jeremy Howard
* ULID: jlhowa3
*
* Date: Sep 18, 2019
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
* <calculates area, diameter, and circumference given a radius>
*
* @author Jeremy Howard
*
*
*/
public class CircleDriver
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the radius of a circle: ");
		double radius = scan.nextDouble();
		
		
		Circle circle1 = new Circle();
		circle1.setRadius(radius);
		
		System.out.print(circle1);
		
	}

}
