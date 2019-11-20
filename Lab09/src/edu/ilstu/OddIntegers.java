/*
* File name: OddIntegers.java
*
* Programmer:Jeremy Howard
* ULID: jlhowa3
*
* Date: Oct 21, 2019
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
* <Given a number it, displays the first positive integers.>
*
* @author Jeremy Howard
*
*/  
public class OddIntegers
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{	Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		
		int number = scan.nextInt();
		int i = 0;
		int count = 1;
		int addition = 1;
		
		while(i < number) {
			
			System.out.println(count);
			count= count +2;
			
			if(i < number -1) {
				addition = addition + count;
			} 
				
			
			i++;
			
		}
		
		System.out.println(addition);
		
		
		
		
		
		
		

	}

}
