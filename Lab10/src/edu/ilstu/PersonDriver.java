/*
* File name: PersonDriver.java
*
* Programmer:Jeremy Howard
* ULID: jlhowa3
*
* Date: Oct 23, 2019
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
* <Compares two names and ages input by the user>
*
* @author Jeremy Howard
*
*/
public class PersonDriver
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a first name:");
		String firstName = scan.nextLine();
		System.out.print("Enter a Last name:");
		String lastName = scan.nextLine();
		System.out.print("Enter a age:");
		int age = scan.nextInt();
		Person p1 = new Person(firstName, lastName, age);
		System.out.println("");
		
		scan.nextLine();
		System.out.print("Enter a first name:");
		String secondFirstName = scan.nextLine();
		
		System.out.print("Enter a Last name:");
		String secondLastName = scan.nextLine();
		
		System.out.print("Enter a age:");
		int secondAge = scan.nextInt();
		Person p2 = new Person(secondFirstName, secondLastName,  secondAge);
		
		System.out.println("");
		
boolean validateName = p1.equalsName(p2);
		
		if(validateName) {
			System.out.println(p1 + " and " + p2  + " have the same name");
		} else {
			System.out.println(p1 + " and " + p2  + " have different names");
		}
		
		
	
		if(p1.getAge() > p2.age) {
			System.out.println(p1 + " is older than " + p2  );
		} else if(p1.getAge() < p2.age) {
			System.out.println(p1 + " is younger than " + p2  );
		}else if(p1.getAge() == p2.age) {
			System.out.println(p1 + " and " + p2  + " are the same age");
		}

	}

}
