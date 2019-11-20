/*
* File name: RandomCalc.java
*
* Programmer:Jeremy Howard
* ULID: jlhowa3
*
* Date: Sep 6, 2019
*
* Class: IT 168
* Lecture Section: 16
* Lecture Instructor: Tonya Pierce
* Lab Section:17
* Lab Instructor:Kushal Sharma
*/
package edu.ilstu;

import java.text.DecimalFormat;

/**
* <Chooses three random numbers and add, subtracts, multiplies them all together. It also raises them to the power of each other. Data and results are displayed.>
*
* @author Jeremy Howard
*
*/
public class RandomCalc
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		double a = 1 + (Math.random()*6);
		double b = 1 + (Math.random()*6);
		double c = 1 + (Math.random()*6); //stores random values (1-6) in a,b,c 
		
		double add = a + b + c; // adds random values
		double subtract = a-b-c; // subtracts random value
		double multiply = a*b*c; //multiplies random values
		double power1 = Math.pow(a,b); //raises a to the power of b
		double power2 = Math.pow(power1, c); //raises the result from power1 to c
		
		DecimalFormat df = new DecimalFormat("###,###.##");
		
		System.out.println(a + " + " + b  + " + " + c + " = " + add); //outputs
		System.out.println(a + " - " + b  + " - " + c + " = " + subtract); //outputs
		System.out.println(a + " * " + b  + " * " + c + " = " + multiply); //outputs
		System.out.println( a + " to the power of " + b + " to the power of " + c + " = " + df.format(power2)); //outputs

	

	}

}
