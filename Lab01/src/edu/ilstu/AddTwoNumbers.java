/*
 * File name: AddTwoNumbers.java
 *
 * Programmer:Jeremy Howard
 * ULID:jlhowa3
 *
 * Date:8-21-19
 *
 * Class:IT168
 * Lecture Section:16
 * Lecture Instructor:Kushal Sharma
 * Lab Section:17
 * Lab Instructor:Tonya Pierce
 */


package edu.ilstu;

import java.util.Scanner;


/**
* <Adds two numbers read from the keyboard.>
*
* @author Jeremy Howard
*
*/
public class AddTwoNumbers 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        int num1 = 0;
        int num2 = 0;
        
        System.out.println("Hello");
        System.out.println("I will add two numbers for you.");
        System.out.print("Enter first number: ");        
        num1 = keyboard.nextInt();

	System.out.print("Enter second number: ");
        num2 = keyboard.nextInt();
        
        System.out.print("The sum of those two numbers is ");
        System.out.println(num1 + num2);
        
    }
}
