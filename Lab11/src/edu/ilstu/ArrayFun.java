/*
* File name: ArrayFun.java
*
* Programmer:Jeremy Howard
* ULID: jlhowa3
*
* Date: Oct 30, 2019
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
* <Class calculates the product of an array, the multiples of an array, and the values in the array. >
*
* @author Jeremy Howard
*
*/
public class ArrayFun
{
	static Scanner scan = new Scanner(System.in);
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		 int[] num  = new int[100];
		 int values = num.length;	

		
		 values = fillArray(num);
		System.out.println("The product is " + computeProduct(num, values));
		
		 System.out.print("Enter a factor:");
		 int factor = scan.nextInt();
		 
		 System.out.println("The number of multiples are: " + countMultiples(num, values, factor));
		 //values = countMultiples(num, values, factor);
		 
		 System.out.println("The values in the array are: " + printArray(num, values));

				 
	}

	public static int fillArray(int[] number) {
		int count = 0;
		System.out.print("Enter a number: ");
		int run = scan.nextInt();
		
		for(int i = 0; i < number.length && run != -999; i++) {
			
			number[i] =  run;
			count++;
			System.out.print("Enter a number: ");
			run = scan.nextInt(); }
			return count;
	
		}
		
	public static int  computeProduct(int[] number,int valid) {
		int product = 1;
		for(int i = 0; i < valid; i++) {
			 product = product* number[i] ;
			
		}
		return product;
	
	}                                                      
	
	public static int countMultiples(int[]number, int valid, int factor) {
		int count = 0;
		for(int i = 0; i < valid; i++) {
			if(number[i]%factor ==0) {
				count++;
			}
			i++;
		}
		
		return count;
		
	}
	
	public static String printArray(int[]number, int valid) {
	
			String toScreen = "";
		for(int i = 0; i < valid; i++) {
			
			 toScreen = toScreen  + " " + number[i];
			 
		}
		
		return toScreen;
	}
	
	
	
	
	
	
}
	
	
	
	

