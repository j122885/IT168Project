/*
* File name: Song.java
*
* Programmer:Jeremy Howard
* ULID: jlhowa3
*
* Date: Nov 20, 2019
*
* Class: IT 168
* Lecture Section: 16
* Lecture Instructor: Tonya Pierce
* Lab Section: 17
* Lab Instructor: Kushal Sharma
*/
package edu.ilstu;

/**
* <Holds details for a song>
*
* @author Jeremy Howard
*
*/
public class Song
{

	private String title;
	private String artist;
	/**
	 * @param title
	 * @param artist
	 */
	public Song(String title, String artist)
	{
		
		this.title = title;
		this.artist = artist;
	}
	/**
	 * @return the title
	 */
	public String getTitle()
	{
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}
	/**
	 * @return the artist
	 */
	public String getArtist()
	{
		return artist;
	}
	/**
	 * @param artist the artist to set
	 */
	public void setArtist(String artist)
	{
		this.artist = artist;
	}
	
	public String toString() {
		
		return 	this.getTitle() + " by " + this.getArtist();
	}
	
	
	
	
	
	
	
	
	
	
	
}
