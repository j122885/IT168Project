/*
* File name: HighTemps.java
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

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
* <Counts the number of temps in the file>
*
* @author Jeremy Howard
*
*/
public class HighTemps
{
	static Scanner scan = new Scanner(System.in);

	static int array[] = new int [151];
	public static void main(String[] args)
	{
		
		
	        int curVal;
	        int count = 151;
	        
	        
	        Scanner input = null;
	        try
	        {
	            input = new Scanner(new File("temps.txt"));
	            
	            
	            
	            while (input.hasNextInt())
	            {
	                curVal = input.nextInt();
	                array[curVal +40]++;
	               
	              
	            }
	            System.out.println("Temperatures\t\tNumber of days");
	            for(int i = 0; i < count; i++) {
	            	if( array[i]> 0) {
	            		System.out.println(i-40 + "\t\t\t" + array[i]);
	            	
	            }
	            input.close();
	        }
	        }
	        catch (FileNotFoundException e)
	        {
	            System.out.println("Could not find data.txt file");
	            System.exit(1);
	        }
	    }
	}



















