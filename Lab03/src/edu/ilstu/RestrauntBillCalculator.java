/*
* File name: RestrauntBillCalculator.java
*
* Programmer:Jeremy Howard
* ULID: jlhowa3
*
* Date: Sep 4, 2019
*
* Class: IT 168
* Lecture Section: 16
* Lecture Instructor: Kushal Sharma
* Lab Section:17
* Lab Instructor:Tonya Pierce
*/
package edu.ilstu;

/**
* <Calculates the tax, tip and total cost of a meal.>
*
* @author Jeremy Howard
*
*/
public class RestrauntBillCalculator
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		final double TIPRATE = 0.15;
		final double TAXRATE = 0.075;
		double cost = 45.75;
		double taxAmount = 0;
		double tipAmount = 0;
		double totalAmount = 0; 
		
		 taxAmount = cost*TAXRATE;
		 tipAmount  = cost*TIPRATE;
		 totalAmount = cost + taxAmount + tipAmount;
		
		 
		
		
		
		System.out.println("Meal Cost: " +cost);
		System.out.println("Tax: " + taxAmount);
		System.out.println("Tip: " + tipAmount);
		System.out.println("Total amount: " + totalAmount);
		

	}

}
