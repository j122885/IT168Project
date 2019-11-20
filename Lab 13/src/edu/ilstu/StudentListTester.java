/*
* File name: StudentListTester.java
*
* Programmer:Jeremy Howard
* ULID: jlhowa3
*
* Date: Nov 19, 2019
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
* <Databases students given a file>    //the instructions were very unclear as to what was asked of us
*									// It said to test all the capabilities of the studentList class
* @author Jeremy Howard				//I did exactly that by using every method once(Instructions did not say
* 										//that it had to repeat or go through a number of times)				
*
*/
public class StudentListTester
{
	static Scanner scan = new Scanner(System.in);
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{   
		StudentList one = new StudentList();
		
		System.out.print("Enter a file list of students:");
		String input = scan.nextLine();
		one.readList(input);
		
		
		System.out.println("Add a student to the class.");
		System.out.print("Enter student's name: ");
		String name = scan.nextLine();
		System.out.print("Enter student's major: ");
		String major = scan.nextLine();
		System.out.print("Enter student's gpa: ");
		double gpa = scan.nextDouble();
		System.out.print("Enter student's hours: ");
		int hours = scan.nextInt();
		Student a = new Student(name, major, gpa, hours);
		one.addStudent(a);
		
		System.out.print("Display a student. Enter a name: ");
		String nameDisplay = scan.next();
		one.displayStudent(nameDisplay);
		
		System.out.println("The class counts are...");
		one.printClassCounts();
		
		
		one.writeList(("studentout.txt"));
	}

}
