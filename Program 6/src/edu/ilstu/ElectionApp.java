/*
* File name: ElectionApp.java
*
* Programmer:Jeremy Howard
* ULID: jlhowa3
*
* Date: Nov 7, 2019
*
* Class: IT 168
* Lecture Section: 16
* Lecture Instructor: Tonya Pierce
* Lab Section: 17
* Lab Instructor: Kushal Sharma
*/
package edu.ilstu;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * <This app allows you to create your own election.>
 *
 * @author Jeremy Howard
 *
 */
public class ElectionApp
{
	static Scanner scan = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		Results one = new Results();
//		outputMenu();
		int choice = 0;
		do
		{
			outputMenu();

			try
			{
				choice = scan.nextInt();

/*				while (choice != 6)
				{*/

					switch (choice)
					{
					case 1:
						one.addCandidate();

						break;
					case 2:
						one.addVotes();

						break;

					case 3:
						one.determineWinner();

						break;

					case 4:
						System.out.println(one.toString());

						break;
					case 5:
						System.out.println(one.displayWinners());

						break;
					case 6:
						System.out.println("Goodbye");
						System.exit(0);
					default:
						System.out.println("This is not a valid choice. Please try again.");
						break;
						//outputMenu();
						//continue;
					}
					System.out.println("\n");
//				outputMenu();
//				
//				 choice = scan.nextInt();

				//}

				/*
				 * if (choice == 6) { System.out.println("Goodbye"); System.exit(0);
				 * 
				 * }
				 */

			}
			catch (InputMismatchException e)
			{
				System.out.println("This is not an valid choice.Please enter a number between 1 and 6");

				System.out.println("\n");
				scan.next();
				//outputMenu();

			}
		} while (choice != 6);
	}

	public static void outputMenu()
	{

		String menu = ("Choose from the following options: \n" + "1- Add a candidate\n" + "2- Add votes\n" + "3- Determine winner\n" + "4- Display list of candidates\n" + "5- Display winners\n"
				+ "6- Exit");
		System.out.println(menu);
		System.out.print("Your choice? ");

	}

}
