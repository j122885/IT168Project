/*
* File name: WaterTowerCalculator.java
*
* Programmer:Jeremy Howard
* ULID: jlhowa3
*
* Date: Aug 27, 2019
*
* Class: IT 168
* Lecture Section: 16
* Lecture Instructor: Kushal Sharma
* Lab Section:17
* Lab Instructor:Tonya Pierce
*/
package edu.ilstu;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
* <Calulates the area of the sphere in inches and feet, and uses the volume in feet to determine the total number of gallons for a new water tower.>
*
* @author Jeremy Howard
*
*/
public class WaterTowerCalculator
{

	/**
	 * @param args
	 */

		public static void main(String[] args)
		{
		
			final double PI= 3.14; 

			final double GAL= 7.48; // conversion of gallons to inches 

			 
			 

			Scanner scan= new Scanner(System.in); 

			System.out.print("Enter the width of the sphere:"); 

			double radius = scan.nextDouble() /2.0; /* finding the radius by dividing the width of the circle by 2 */ 

			double squaredRadius = radius*radius; // r^2

			double cubedRadius = radius*radius*radius; //r^3

			double arInches = 4*squaredRadius* PI; //calculates area in inches 
			
			double arFeet = arInches/144; //calculates area in feet 
			
			double voInches = (4.0/3)*PI*cubedRadius; //calculates the volume in inches
		
			double voFeet= voInches/1728; //calculates the volume in feet
			
			double result= GAL*voFeet; //calculates the gallons needed
			
			DecimalFormat df = new DecimalFormat("###,###.##");
			
			
			
			System.out.println("Area in inches:" + df.format(arInches)); 

			System.out.println("Area in feet:" + df.format(arFeet)); 

			System.out.println("Volume in inches:" + df.format(voInches)); 

			System.out.println("Volume in feet:" + df.format(voFeet));
			
			System.out.println("Gallons of water:" + df.format(result));


		}

	}
