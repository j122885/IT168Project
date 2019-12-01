/*
 * File name: CDDriver.java
 * 
 * Programmer: 
 * ULID:
 *
 * Date:  
 *
 * Class: 
 * Lecture Section:
 * Lecture Instructor:
 * Lab Section:
 * Lab Instructor:  
 */
package edu.ilstu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * <Add and display songs on a CD>
 *
 * @author
 *
 */
public class CDDriver
{

	public static void main(String[] args) throws IOException
	{
		final int MAX_ARRAY_SIZE = 50;
		final String FILENAME = "Collection.txt";

		int count = 0; // Counter to keep track of number of elements in the array
		int choice = 0; // Menu choice

		// Create array to hold song collection
		Song[] song = new Song[MAX_ARRAY_SIZE];

		// Create TextMenu object for menu (this may involve writing multiple lines of
		// code)
		String[] menuItems = { "Add a new Song", "Display song", "Exit" };
		TextMenu tm = new TextMenu(menuItems);

		// Read the data from the input file into the array
		// Count the elements currently in the array

		Scanner imp = null;
		try
		{
			imp = new Scanner(new File("Collection.txt"));
			while (imp.hasNext())
			{
				String input = imp.nextLine();
				String input2 = imp.nextLine();
				song[count] = new Song(input, input2);
				count++;
			}

		}
		catch (FileNotFoundException e)
		{

			System.out.println("File not found");

		}

		Scanner scan = new Scanner(System.in);
		// Get the menu choice
		choice = tm.getChoice(scan);
		
		while (choice != 3)
		{
			switch (choice)
			{
			case 1:
				// Read data for new song to add to the collection from the keyboard

				Scanner add = new Scanner(System.in);
				System.out.print("Enter a title: ");
				String nm = add.nextLine();

				System.out.print("Enter an artist: ");
				String art = add.nextLine();

				// Add the song to the array
				Song p = new Song(nm, art);
				song[count] = p;

				// Don't forget to increment the count
				count++;

				// Add the song to the file

				try
				{
					FileWriter fw = new FileWriter(FILENAME, true);
					// PrintWriter pw = new PrintWriter(fw);
					fw.write(nm + "\n");

					fw.write(art + "\n");
					fw.close();
				}
				catch (IOException e)
				{
					System.out.println("File not found");
				}
				break;
			case 2:
				// Print the list
				for (int i = 0; i < count; i++)
				{

					System.out.println(song[i].toString());
				}

				break;

			default:
				System.out.println("Invalid menu choice.  Please try again.");
			}

			// Get the menu choice

			choice = tm.getChoice(scan);
		}

	}

}
