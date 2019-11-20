/*
* File name: BookDriver.java
*
* Programmer:Jeremy Howard
* ULID: jlhowa3
*
* Date: Sep 20, 2019
*
* Class: IT 168
* Lecture Section: 16
* Lecture Instructor: Tonya Pierce
* Lab Section: 17
* Lab Instructor: Kushal Sharma
*/
package edu.ilstu;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
* <Calculates the totals for The Life of PI and Harry Potter.>
*
* @author Jeremy Howard
*
*/
public class BookDriver
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("$##.00");
		
		
		String title = "Life of Pi";
		double price = 13.50;

		
		Book lop = new Book(title ,price );
		Book harryp = new Book( "Harry Potter", 22.0);
	
		System.out.print( "Enter number to buy of Life of PI: ");
		double firstInput;
		firstInput = scan.nextDouble();
		 lop.calaculateSales(firstInput);
		System.out.println("Cost for Life of Pi: " + df.format(price));
		
		System.out.print( "Enter number to buy of Harry Potter: ");
		double secondInput;  
		secondInput = scan.nextDouble();
		harryp.calaculateSales(secondInput);
		System.out.println("Harry Potter: " + df.format(22.0));
		
		System.out.print("Enter percent increase for Life of Pi (in decimal form): ");
		double lip = lop.increasePrice(scan.nextDouble()); //calculates the increased price
		
		System.out.print("Enter percent increase for Harry Potter (in decimal form): ");
		double hip = harryp.increasePrice(scan.nextDouble()); //calculates the increased price
		
		
		 
		 
		System.out.println("Cost for Life of Pi = " + df.format(lip*firstInput)); // Outputs total cost of Life of Pi - Tonya Pierce told me that we are to output the increased price with not tax
		System.out.println("Harry Potter = " + df.format(hip*secondInput) ); //Outputs total cost of Harry Potter
				
			
		
		
		
	
		
		

	}

}
