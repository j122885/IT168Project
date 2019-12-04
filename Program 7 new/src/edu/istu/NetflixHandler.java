/*
* File name: NetflixHanderler.java
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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <Manages the execution of the Netflix database>
 *
 * @author Jeremy Howard
 *
 */
public class NetflixHandler
{
	private Movie[] data;
	private int actualSize;
	public final int SIZE = 500;
	Scanner scan = new Scanner(System.in);
	Scanner forNum = new Scanner(System.in);

	/**
	 * default constructor
	 */
	public NetflixHandler()
	{
		data = new Movie[SIZE];

	}
	/**
	 * reads csv file into database movie array
	 */
	public void read()
	{
		Scanner input = null;
		try
		{
			int i = 0;

			input = new Scanner(new File("netflix.csv")).useDelimiter("[,\r\n]");

			while (input.hasNext())
			{
				input.nextLine();
				String title = input.next();

				String rating = input.next();

				int year = Integer.parseInt(input.next());

				int score = Integer.parseInt(input.next());
				Movie a = new Movie(title, rating, year, score);
				data[i] = a;
				i++;
				actualSize++;

			}
			input.close();

		}
		catch (FileNotFoundException e)
		{
			System.out.println("File not found");

		}

	}
	/**
	 * displays all movies
	 */
	public void displayAllMovies()
	{
		System.out.println("Title\t\t\t\t\t\t\t\t\t\t" + "Year\t" + "rating\t" + "score");
		for (int j = 0; j < actualSize; j++)
		{
			System.out.println(data[j].toString());

		}

	}

	/**
	 * Search and display movie by title
	 */
	public void searchTitle()
	{	
		System.out.print("Please provide a title: ");
		String title = scan.nextLine();
		boolean display = false;
		boolean found = false;
		for (int i = 0; i < actualSize; i++)
		{

			if (title.equalsIgnoreCase(data[i].getTitle()))
			{
				if (display == false)
				{
					System.out.println("Title\t\t\t\t\t\t\t\t\t\t" + "Year\t" + "rating\t" + "score");
				}
				System.out.println(data[i].toString());
				display = true;
				found = true;
			}

		}
		if (found == false)
		{
			System.out.println("The title does not match any of the movies.");
		}

	}
	/**
	 * Search and displays movies by year
	 */
	public void searchYear()
	{
		boolean flag = false;
		int year = 0;

		System.out.print("Please provide a year: ");
		while (!flag)
		{
			try
			{
				year = forNum.nextInt();
				flag = true;
			}

			catch (Exception e)
			{
				System.out.print("Please provide a valid input: ");
				flag = false;
				forNum.nextLine(); //throw the exception input out
			} 
		}		
		
		boolean display = false;
		boolean found = false;
		for (int i = 0; i < actualSize; i++)
		{

			if (year == data[i].getYear())
			{
				if (display == false)
				{
					System.out.println("Title\t\t\t\t\t\t\t\t\t\t" + "Year\t" + "rating\t" + "score");
				}
				System.out.println(data[i].toString());
				display = true;
				found = true;
			}

		}
		if (found == false)
		{
			System.out.println("The year does not match any of the movies.");
		}

	}

	/**
	 * Sorts movies given an array
	 */
	public void sort(Movie[] movies, int size)
	{

		Movie temp;

		for (int i = 0; i < size; i++) // I will not change until it gets out of th second loop
		{

			for (int j = i + 1; j < size; j++) // Goes through the movie array and checks if 1 + i(the spot after the last one
												// that was moved)
			{
				if (movies[j].getScore() > movies[i].getScore())
				{
					temp = movies[j];
					movies[j] = movies[i];
					movies[i] = temp;
				}

			}
		}

	}

	/**
	 * Makes recommendations based on the given rating or score
	 */
	public void makeRecommendations()
	{	boolean flag = false;
		int choose = 0;
		System.out.print("Do you want the recommendations based on ratings or scores?\n" + "1. Ratings\n" + "2. Scores\n" + "Please choose 1 or 2:");
		
		while (!flag)
		{
			try
			{
				choose = forNum.nextInt();
				flag = true;
			}

			catch (Exception e)
			{
				System.out.print("Please provide a valid input: ");
				flag = false;
				forNum.nextLine(); //throw the exception input out
			} 
		}
		

		while (!(choose >= 1 && choose <= 2 ))
		{
			System.out.print("Please provide a valid input:");
			choose = forNum.nextInt();

		}
		if (choose == 1)
		{
			System.out.print("Please provide a rating:");
			String rate = scan.next();

			Movie[] temp = new Movie[actualSize];
			int tempCount = 0;

			for (int i = 0; i < actualSize; i++)
			{

				if (data[i].getRating().equals(rate.toUpperCase()))
				{
					temp[tempCount] = data[i];
					tempCount++;

				}

			}
			if (tempCount > 0)
			{
				sort(temp, 5);
				int counter = 0;

				PrintWriter p = null;
				try
				{
					p = new PrintWriter(new FileWriter("top_5_movies.txt"));

					while (counter < 5)
					{

						p.println(temp[counter]);
						counter++;
					}

				}
				catch (IOException e)
				{
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				p.close();
				System.out.println("Recommendations made successfully! Top 5 movies found!");

			}
			else
			{

				System.out.println("The rating does not match any of the movies.");
			}
		}
		else if (choose == 2)
		{

			int counter = 0;
			sort(data, 20);
			PrintWriter p = null;
			try
			{
				p = new PrintWriter(new FileWriter("top_20_movies.txt"));

				while (counter < 20)
				{

					p.println(data[counter]);
					counter++;
				}

			}
			catch (IOException e)
			{
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());

			}
			p.close();
			System.out.println("Recommendations made successfully! Top 20 movies found!");
		}

	}

}
