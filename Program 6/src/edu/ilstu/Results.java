/*
* File name: Results.java
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

import java.util.Scanner;

/**
 * <This class does all the logic for determining winners in an election>
 *
 * @author Jeremy Howard
 *
 */
public class Results
{
	static Scanner scan = new Scanner(System.in);
	public final int BLOCK_SIZE = 3;
	private Candidate[] candidate;
	private int sizeOfCandidate;
	private String[] office;
	private int sizeOfOffice;
	private int counter = 1;
	int tempCount = 0;

	public Results()
	{
		candidate = new Candidate[BLOCK_SIZE];
		office = new String[BLOCK_SIZE];
		sizeOfCandidate = 0;
		sizeOfOffice = 0;
	}

	/**
	 * @return the sizeOfCandidate
	 */
	public int getSizeOfCandidate()
	{
		return sizeOfCandidate;
	}

	/**
	 * @return the sizeOfOffice
	 */
	public int getSizeOfOffice()
	{
		return sizeOfOffice;
	}

	/**
	 * Displays the candidates in the array
	 */

	public String toString()
	{

		String display = "";
		for (int i = 0; i < getSizeOfCandidate(); i++)
		{
			display += getCandidate()[i].toString() + "\n************************\n";
		}
		return display;
	}

	/**
	 * Checks if the candidate is already on the ballot
	 */
	public boolean hasCandidate(Candidate any)
	{
		for (int i = 0; i < getSizeOfCandidate(); i++)
		{
			if (getCandidate()[i].equals(any))
			{
				return true;
			}
		}
		return false;
	}

	/**
	 * Checks to see if the candidate array is full
	 */
	public boolean isCandidatesFull()
	{
		if (sizeOfCandidate == getCandidate().length)
		{
			return true;
		}
		return false;
	}

	/**
	 * checks to see if the office array is full
	 */
	public boolean isOfficeFull()
	{
		if (sizeOfOffice == office.length)
		{
			return true;
		}
		return false;
	}

	/**
	 * Creates a new candidate and checks if it's in the candidate array
	 */

	public void addCandidate()
	{

		System.out.print("Enter the first name: ");
		String first = scan.next();
		System.out.print("Enter the last name: ");
		String last = scan.next();
		System.out.print("Enter the candidate's office: ");
		String offices = scan.next();
		System.out.print("Enter the candidate's party: ");
		String party = scan.next();

		int vote = 0;
		boolean won = false;
		Candidate add = new Candidate(first, last, offices, party, vote, won);
		if (this.hasCandidate(add) == true)
		{
			System.out.println("Candidate already on ballot");

		}
		else
		{
			this.addCandidate(add);
		}
	}

	/**
	 * Adds the candidate to the candidate array
	 */
	private void addCandidate(Candidate add)
	{

		if (isCandidatesFull())
		{
			resizeCandidate();
			candidate[this.getSizeOfCandidate()] = add;
			sizeOfCandidate++;
		}
		else
		{
			candidate[this.getSizeOfCandidate()] = add;
			sizeOfCandidate++;
		}

		boolean hasOffice = false;
		for (int i = 0; i < getSizeOfOffice(); i++)
		{
			if (office[i].equals(add.getOffice()))
			{// checks if there is already a type of office
				hasOffice = true;
			}
		}

		if (hasOffice == false)
		{

			if (isOfficeFull() == false)
			{
				office[this.getSizeOfOffice()] = add.getOffice(); // if there is no office and it's not full, add it
				sizeOfOffice++;
			}
			else
			{
				resizeOffice();
				office[this.getSizeOfOffice()] = add.getOffice(); // if there is no office and it's full, resize and add it
				sizeOfOffice++;
			}

		}

	}

	/**
	 * Resizes the candidate array
	 */

	public void resizeCandidate()
	{

		Candidate[] temp = new Candidate[this.getSizeOfCandidate() + BLOCK_SIZE];

		for (int i = 0; i < candidate.length; i++)
		{

			temp[i] = candidate[i];
		}
		candidate = temp;
	}

	/**
	 * Resizes the office array
	 */
	public void resizeOffice()
	{

		String[] temp = new String[this.getSizeOfCandidate() + BLOCK_SIZE];

		for (int i = 0; i < office.length; i++)
		{

			temp[i] = office[i];
		}
		office = temp;
	}

	/**
	 * Adds votes for candidates
	 */
	public void addVotes()
	{

		for (int i = 0; i < getSizeOfCandidate(); i++)
		{

			System.out.print("Enter new votes for " + candidate[i].getFirstName() + " " + candidate[i].getLastName() + ": ");
			int vote = scan.nextInt();

			if (candidate[i].getVotes() > 0)
			{ // If there are votes in the candidate, add the number of votes
				candidate[i].setVotes(candidate[i].getVotes() + vote);
			}
			else

				candidate[i].setVotes(vote);
		}
	}

	/**
	 * Determines the winner for the specific office.
	 */
	public void determineWinner()
	{

		int counter = 1;
		for (int i = 0; i < getSizeOfOffice(); i++)
		{
			System.out.println(counter + "- " + office[i]); // Displays the current offices that have candidates
			counter++;
		}

		System.out.print("Choose an office: ");
		int choose = scan.nextInt();

		createCandidateListByOffice(choose);

	}

	/**
	 * Creates the temparary array for the office that is being judged
	 */
	private void createCandidateListByOffice(int choose) // takes in a value that is one more than the position of the office in the
															// array
	{
		tempCount = 0;
		int temper = 0;
		int is = choose - 1;
		Candidate[] temp = new Candidate[getSizeOfCandidate()];
		
		for(int i = 0; i < sizeOfCandidate; i++) {
			if(candidate[i].getOffice().equals(office[is])){
				candidate[i].setWon(false);
			}
		}
		for (int i = 0; i < temp.length; i++)
		{

			if (candidate[i].getOffice().equals(office[is]))
			{
				temp[temper] = candidate[i];
				tempCount++;
				temper++;
			}
		}
		findHighestVotes(temp);

	}

	/**
	 * Finds the highest votes in the office array and displays the winner or tie
	 * for the race
	 */
	private void findHighestVotes(Candidate[] temp)
	{
		int through = 0;

		if (tempCount == 1)
		{
			if (temp[0].getVotes() > 1)
			{
				for (int i = 0; i < sizeOfCandidate; i++)
				{

					if (temp[0].equals(candidate[i]))
					{
						candidate[i].setWon(true);
						System.out.println(candidate[i].toString());
						System.out.println("************************");
						System.out.println("The winner is: " + candidate[i].getFirstName() + " " + candidate[i].getLastName());
					}

				}
			}
			if (temp[0].getVotes() < 1)
			{

				System.out.println("Candidate has no votes.Winner cannot be determined.");
			}
		}

		else if (tempCount > 1)
		{
			int largest = 0;
			for (int i = 0; i < tempCount; i++)
			{

				if (temp[i].getVotes() >= largest)
				{ // looks for the largest number of votes in temp
					largest = temp[i].getVotes();
				}

			}

			for (int i = 0; i < tempCount; i++)
			{ // compares the votes of candidates in temp to the largest
				// and sets that candidate with the largest value won status to true
				if (temp[i].getVotes() == largest)
				{
					counter = 0;

					for (int j = 0; j < tempCount; j++)
					{

						if (temp[j].getVotes() == largest)
						{
							counter++;
						}
					}

					if (counter < 2)
					{
						for (int p = 0; p < tempCount; p++)
						{
							System.out.println(temp[p].toString());
							System.out.println("************************");
						}

						System.out.println("The winner is: " + temp[i].getFirstName() + " " + temp[i].getLastName());
						for (int j = 0; j < getSizeOfCandidate(); j++)
						{

							if (temp[i].getVotes() == candidate[j].getVotes() && temp[i].getOffice().equals(candidate[j].getOffice()))
							{
								candidate[j].setWon(true);

							}

						}

					}
					else if (counter >= 2)
					{
						System.out.println(temp[i].toString());
						System.out.println("************************");
						through++;
						if (through == counter)
						{
							System.out.println("It is a tie. No winner can be determined.");
						}
					}
				}

			}

		}

	}

	/**
	 * Displays all the winning candidates
	 */
	public String displayWinners()
	{
		String end = "";
		if (counter < 2)
		{
			String display = "";
			for (int i = 0; i < getSizeOfCandidate(); i++)
			{
				if (getCandidate()[i].isWon() == true)
				{
					display += getCandidate()[i].toString() + "\n************************\n";
				}

			}

			end = "The Winners are: \n" + display;
		}
		else if (counter >= 2)
		{

			end = "It is a tie. No winner can be determined.";
		}
		return end;

	}

	public Candidate[] getCandidate()
	{
		return candidate;
	}

}
