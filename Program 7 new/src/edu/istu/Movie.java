/*
* File name: Movie.java
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

/**
 * <Used to create movies>
 *
 * @author Jeremy Howard
 *
 */
public class Movie
{

	private String title;
	private String rating;
	private int year;
	private int score;

	/**
	 * @param title
	 * @param rating
	 * @param year
	 * @param score
	 */
	public Movie(String title, String rating, int year, int score)
	{

		this.title = title;
		this.rating = rating;
		this.year = year;
		this.score = score;
	}

	/**
	 * @return the title
	 */
	public String getTitle()
	{
		return title;
	}

	/**
	 * @return the rating
	 */
	public String getRating()
	{
		return rating;
	}

	/**
	 * @return the year
	 */
	public int getYear()
	{
		return year;
	}

	/**
	 * @return the score
	 */
	public int getScore()
	{
		return score;
	}
	/**
	 * toString
	 */
	public String toString()
	{

//			if(this.title.length() <= 13) {
//			return this.title + "\t\t\t\t\t\t\t\t\t\t" + this.year + "\t" + this.rating + "\t" + this.score;
//			}
//			else if(this.title.length() >= 50) {
//				return  this.title + "\t\t\t" + this.year + "\t" + this.rating + "\t" + this.score;
//			}
//			else if(this.title.length() <= 16) {
//				return  this.title + "\t\t\t\t\t\t\t\t" + this.year + "\t" + this.rating + "\t" + this.score;
//			}
//			else if(this.title.length() <= 8) {
//				return  this.title + "\\t\\t\\t\\t\\t\\t\\t\\t\\t\t\t" + this.year + "\t" + this.rating + "\t" + this.score;
//			}
//			else return  this.title + "\t\t\t\t\t\t\t" + this.year + "\t" + this.rating + "\t" + this.score;

		return String.format("%-67s%17d%10s%7d", this.title, this.year, this.rating, this.score);

	}

}
