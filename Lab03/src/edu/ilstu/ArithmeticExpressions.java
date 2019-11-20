/*
 * Filename:ArithmeticExpressions.java
 *
 * Programmer:Jeremy Howard
 * ULID: jlhowa3
 *
 * Date:  9-4-19
 *
 * Class:  IT168
 * Lecture Section:16
 * Lecture Instructor: Tonya Pierce
 * Lab Section:17
 * Lab Instructor:  Kushal Sharma
 */

package edu.ilstu;

/**
 * Write and test arithmetic expressions
 *
 * @author Jeremy Howard
 *
 */
public class ArithmeticExpressions {

	public static void main(String[] args) {
		// Constant declaration
		final int FREEZING = 32;
		final int FACTOR = 703;
		
		
		// Variable declarations and initializations
		
		double height = 64.5;
		double weight = 125.0;
		int fahrenheit = 78;
		int expected = 89;
		int observed = 78;
		
		
		
		// Problem 17
		
		double bmi = (weight/(height*height))*FACTOR;
		System.out.println("bmi:" + bmi);
		
		
		// Problem 18
		double celsius = (5.0/9)*(fahrenheit-FREEZING);
		System.out.println("Celsius:" + celsius);
		
		// Problem 19
		
		double percentageOfDiffernece = ((expected-observed)/(double)expected)*100.0;
		System.out.println("percentageOfDiffernece:" + percentageOfDiffernece);
		
		
		
	
		
		
	}

}
