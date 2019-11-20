package edu.ilstu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * A class to maintain an array of students
 */
public class StudentList
{
	// add appropriate instance variables here: need an array of Students
	// and a way to keep track of how many students are in the list
	// assume there will never be more than 100 students
	// call your array stuArray
	private Student[] stuArray;
	private int size;

	// provide a default constructor that sets up an empty student array
	public StudentList()
	{
		stuArray = new Student[100];
		size = 0;
	}

	// provide a private helper method that accepts a Student's name and
	// returns the index of the student in the array or -1 if the student
	// is not in the array. This method should be called by the
	// displayStudent method
	public int getIndexOfStudent(String name)
	{
		int index = 0;
		for (int i = 0; i < size; i++)
		{

			if (stuArray[i].getName().equals(name))
			{
				index = i;
			}
			else
				index = -1;

		}
		return index;
	}

	/**
	 * Reads a list of students from a file
	 * 
	 * @param fileName Name of the file to read from
	 */
	public void readList(String fileName)
	{

		int i = 0;

		Scanner scan;
		try
		{
			scan = new Scanner(new File(fileName));

			while (scan.hasNextLine())
			{
				String name = scan.nextLine();
				scan.hasNextLine();
				int hours = scan.nextInt();
				double gpa = scan.nextDouble();
				scan.nextLine();
				String major = scan.nextLine();
				scan.hasNextLine();
				Student a = new Student(name, major, gpa, hours);
				stuArray[i] = a;
				i++;
				size++;
			}

		}
		catch (FileNotFoundException e)
		{
			System.out.println("Could not find data.txt file");
			System.exit(1);
		}
		// fill in code to read a list of students from a file
		// into the array -- this should end with StudentList
		// consisting of exactly those students in the file--so
		// the first student in the file will be the first student
		// in the array, and all operations on the list will only
		// affect the set of students in the file until additional
		// students are added using the addStudent method below.
		// Make sure you don't overfill the array.
		// For each student, create the Student object using the default
		// constructor and then use the read method of Student to get
		// the data from the file
	}

	public String display()
	{

		String something = "";
		for (int i = 0; i < size; i++)
		{
			something += stuArray[i].toString();
		}
		return something;

	}

	/**
	 * Writes a list of students to a file
	 * 
	 * @param fileName output.text
	 */
	public void writeList(String fileName)
	{
		PrintWriter outfile = null;
		try
		{
			outfile = new PrintWriter(new FileWriter("output.txt"));

			for (int i = 0; i < size; i++)
			{

				outfile.println(stuArray[i].toString());
			}

			// use a for loop to write all of the Student objects from
			// the array to output.txt by calling the Student's write
			// method and passing it outfile

			outfile.close();
		}
		catch (IOException e)
		{
			System.out.println("An error occurred: " + e);
			System.out.println("The list of students was not written");
		}
	}

	/**
	 * Add a student to the end of the list
	 * 
	 * @param aStudent The student to add
	 */
	public void addStudent(Student aStudent)
	{
		// write code to add a student to the end of the list of students only if there
		// is room

		if (size < stuArray.length)
		{
			stuArray[size] = aStudent;
			size++;
		}
		else
			System.out.println("There is no more room for another student");
	}

	/**
	 * @param studentName
	 */
	public void displayStudent(String studentName)
	{
		// fill in missing pieces of the following code and uncomment it
		// add appropriate code to handle an incorrect name

		int index;
		index = -1; // fill in code here ;

		for (int i = 0; i < size; i++)
		{
			if (studentName.equals(stuArray[i].getName()))
			{
				index = i;
			}
		}
		if (index != -1)
		{
			System.out.println(this.stuArray[index]);
		}
		else
		{
			System.out.println("The name is not correct");
		}

	}

	// Write a method to count the number of freshmen, sophomores, juniors and
	// seniors in the array
	// and print the counts to the screen. The Student class has a getClassLevel
	// method that
	// returns a String with the value "Freshman", "Sophomore", "Junior" or
	// "Senior". Use an array
	// to store your counts.
	// add an appropriate javadoc comment
	/**
	 * Finds and prints the count of each class of students
	 */
	public void printClassCounts()
	{
		int fresh = 0;
		int soph = 0;
		int jun = 0;
		int senior = 0;

		for (int i = 0; i < size; i++)
		{

			switch (stuArray[i].getClassLevel())
			{

			case "Freshman":
				fresh++;
				break;
			case "Sophmore":
				soph++;
				break;
			case "Junior":
				jun++;
				break;
			case "Senior":
				senior++;
				break;
			}

		}
		int[] count = new int[4];
		count[0] = fresh;
		count[1] = soph;
		count[2] = jun;
		count[3] = senior;

		System.out.println("Freshman " + count[0]);
		System.out.println("Sophmore " + count[1]);
		System.out.println("Junior " + count[2]);
		System.out.println("Senior " + count[3]);
	}
}
