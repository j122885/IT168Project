/*
* File name: StringExeriment.java
*
* Programmer:Jeremy Howard
* ULID: jlhowa3
*
* Date: Sep 11, 2019
*
* Class: IT 168
* Lecture Section: 16
* Lecture Instructor: Tonya Pierce
* Lab Section:17
* Lab Instructor:Kushal Sharma
*/
package edu.ilstu;

/**
* <Prints your name in various ways>
*
* @author Jeremy Howard
*
*/
public class StringExperiment
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		String firstName = "Jeremy";
		String middleName = "Lorrel";
		String lastName = "Howard";
		int mi = (lastName.length() )/2;
		int fi =  (firstName.length() )/2;
		
		System.out.println( firstName + " "  + middleName + " " + lastName); 
		System.out.println( firstName + " "  + middleName.charAt(0) + " " + lastName);
		System.out.println( firstName + " "  + middleName + " " + lastName); 
		System.out.println( firstName.toUpperCase() + " "  + " " + lastName); 
		System.out.println("Length of last name = " +  lastName.length());
		System.out.println( lastName.substring(mi,1+mi)); 
		System.out.println( firstName.substring(fi,1+fi)); 
		
	}

}
