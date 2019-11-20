/*
* File name: MoreArrayFun.java
*
* Programmer:Jeremy Howard
* ULID: jlhowa3
*
* Date: Nov 6, 2019
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
* <Tells whether a number is found in an array>
*
* @author Jeremy Howard
*
*/
public class MoreArrayFun
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{	Scanner scan = new Scanner(System.in);
		ArrayManager man = new ArrayManager();
		man.fillArray();
		System.out.println(man.smallest());
		System.out.println(man.largest());
		
		System.out.print("Enter a number: ");
		int num = scan.nextInt();
		while( num != -999 ) {
			if(man.instance(num) != -1) {
			System.out.println(man.instance(num));
			} else System.out.println("Not found");
			
			System.out.print("Enter a number: ");
			num = scan.nextInt();
			
		}
	}

}
