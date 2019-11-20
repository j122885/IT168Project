/*
* File name: Candidate.java
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

/**
 * <Helper class that allows a user to create a new candidate>
 *
 * @author Jeremy Howard
 *
 */
public class Candidate
{
	private String firstName;
	private String lastName;
	private String office;
	private String party;
	private int votes;
	private boolean won = false;

	/**
	 * @param firstName
	 * @param lastName
	 * @param office
	 * @param party
	 * @param votes
	 * @param won
	 */
	public Candidate(String firstName, String lastName, String office, String party, int votes, boolean won)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.office = office;
		this.party = party;
		this.votes = votes;
		this.won = won;
	}

	public Candidate(Candidate other)
	{
		this(other.firstName, other.lastName, other.office, other.party, other.votes, other.won);
	}

	/**
	 * @return the votes
	 */
	public int getVotes()
	{
		return votes;
	}

	/**
	 * @param votes the votes to set
	 */
	public void setVotes(int votes)
	{
		this.votes = votes;
	}

	/**
	 * @return the won
	 */
	public boolean isWon()
	{
		return won;
	}

	/**
	 * @param won the won to set
	 */
	public void setWon(boolean won)
	{
		this.won = won;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName()
	{
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName()
	{
		return lastName;
	}

	/**
	 * @return the office
	 */
	public String getOffice()
	{
		return office;
	}

	/**
	 * @return the party
	 */
	public String getParty()
	{
		return party;
	}

	public boolean equals(Candidate o)
	{

		if (this.getFirstName().equals(o.getFirstName()) && this.getLastName().equals(o.getLastName()) && this.getParty().equals(o.getParty()))
		{

			return true;

		}
		else
			return false;

	}

	public String toString()
	{
		return "Candidate: " + firstName + " " + lastName + "\nOffice: " + office + "\nCandidateParty: " + party + "\nTotal Votes: " + votes;
	}

	public boolean votesEqual(Candidate o)
	{
		if (this.getVotes() == o.getVotes())
		{
			return true;
		}
		return false;
	}

}
