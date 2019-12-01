/*
* File name: NetflixApp.java
*
* Programmer:Jeremy Howard
* ULID: jlhowa3
*
* Date: Nov 23, 2019
*
* Class: IT 168
* Lecture Section: 16
* Lecture Instructor: Tonya Pierce
* Lab Section: 17
* Lab Instructor: Kushal Sharma
*/
package edu.istu;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * <This app allows a user to navigate the database and manages the flow of the
 * database>
 *
 * @author Jeremy Howard
 *
 */
public class NetflixApp
{
	static Scanner scan = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		NetflixHanderler a = new NetflixHanderler();
		a.read();
		int choice = 0;
		do
		{
			menu();

			try
			{
				choice = scan.nextInt();

				while (!(choice >= 1 && choice <= 5))
				{

					System.out.print("Please provide a valid input: ");
					choice = scan.nextInt();
				}

				switch (choice)
				{
				case 1:
					a.displayAllMovies();
					break;
				case 2:
					a.searchTitle();
					break;
				case 3:
					a.searchYear();
					break;
				case 4:
					a.makeRecommendations();
					break;
				case 5:
					System.out.println("Thank you for using the database. Please come back next time.");
					System.exit(0);
					break;

				}

			}
			catch (InputMismatchException e)
			{

				System.out.print("This is not a valid input. Please try again.");
				scan.next();
			}
		} while (choice != 5);

	}

	public static void menu()
	{
		System.out.println("\n\t\t\t\t    Welcome to the Netflix Database");
		System.out.println("\t\t\t\t==========================================");
		System.out.println("\t\t\t\t   1. Browse all movies.\r\n" + "\t\t\t\t   2. Search a movie based on title.\r\n" + "\t\t\t\t   3. Search movies based on year.\r\n"
				+ "\t\t\t\t   4. Top movies recommendation.\r\n" + "\t\t\t\t   5. Exit.");
		System.out.println("\t\t\t\t==========================================");
		System.out.print("Please make your choice:");
	}

}
