/*
* File name: WordGame.java
*
* Programmer:Jeremy Howard
* ULID: jlhowa3
*
* Date: Sep 5, 2019
*
* Class: IT 168
* Lecture Section: 16
* Lecture Instructor: Tonya Pierce
* Lab Section:17
* Lab Instructor:Kushal Sharma
*/
package edu.ilstu;
import java.util.Scanner;

/**
* <Takes in information from the user and turns it into a story.>
*
* @author Jeremy Howard
*
*/
public class WordGame
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner scanName= new Scanner(System.in);
		Scanner scanAge = new Scanner(System.in);
		Scanner scanCity = new Scanner(System.in);
		Scanner scanCollege = new Scanner(System.in);
		Scanner scanProfession = new Scanner(System.in);
		Scanner scanAnimal = new Scanner(System.in);
		Scanner scanPet = new Scanner(System.in);     //scanners for the various user imputs
		
		System.out.print( "Enter a name: ");
		String name = scanName.nextLine(); //stores user input for name
		
		System.out.print("Enter an age under 18: ");
		int age = scanAge.nextInt(); //stores user input for age
		
		System.out.print("Enter your city: ");
		String city = scanCity.nextLine(); //stores user input for city
		
		System.out.print("Enter the name of a college: ");
		String college = scanCollege.nextLine(); //stores user input for college
		
		System.out.print("Enter a profession: ");
		String profession = scanProfession.nextLine(); //stores user input for profession
		
		System.out.print("Enter an animal: ");
		String animal = scanAnimal.nextLine(); //stores user input for animal
		
		System.out.print("Enter a pet's name: ");
		String pet = scanPet.nextLine(); //stores user input for pet name
		
		
		String one = "\nThere once was a person named " + name + " who lived in " + city + ".\n" ;
		String two = "Even though " + name + " was only " + age + ", " +  name + " went to college at " + college + ".\n";
		String three = name + " graduated and went to work as a " + profession + ".\n";
		String four = "Soon thereafter, " + name + " adopted a(n) " + animal + " named " + pet + ".\n";
		String five = name + " and " + pet + " both lived happily ever after!\n"; //store parts of the story in strings
		System.out.println(  one + two + three + four + five ); //outputs the strings to form one story
		
		
		int first = one.indexOf(city);
		int firstprd = one.indexOf(".");
		int second =  two.indexOf(college);
		int secondprd = two.indexOf(".");
		int third = three.indexOf(profession);
		int thirdprd = three.indexOf(".");
		int fourth =  four.indexOf(pet);
		int fourthprd = four.indexOf(".");
		int fifth =  five.indexOf("after!"); //stores indexes of the last word in each sentence
		
		
		String newPhrase1 = "New Phrase is: " + one.substring(first,firstprd) + " " + two.substring(second,secondprd) + " " + three.substring(third,thirdprd) + " ";
		String newPhrase2 = four.substring(fourth,fourthprd) + " " + five.substring(fifth);
		//stores the last word of each sentence in strings for "New Phrase is:"
		System.out.println(newPhrase1 + newPhrase2); //outputs both of the strings to the console
		
		
				
		
		
	}

}
