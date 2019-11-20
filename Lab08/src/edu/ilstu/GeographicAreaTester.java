/*
* File name: GeographicAreaTester.java
*
* Programmer:Jeremy Howard
* ULID: jlhowa3
*
* Date: Oct 12, 2019
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
* <Determines the geographic area given a zipcode.>
*
* @author Jeremy Howard
*
*/
public class GeographicAreaTester
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		String code;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a zipcode: ");
		code = scan.nextLine();
		
		GeographicAreaLookup zip1 = new GeographicAreaLookup(code);
		System.out.println(zip1);
		
		
		
		
		
	}

}
