/*
* File name: RoomDimension.java
*
* Programmer:Jeremy Howard
* ULID: jlhowa3
*
* Date: Oct 23, 2019
*
* Class: IT 168
* Lecture Section: 16
* Lecture Instructor: Tonya Pierce
* Lab Section: 17
* Lab Instructor: Kushal Sharma
*/
package edu.ilstu;

/**
* <Calculates the area based on user input.>
*
* @author Jeremy Howard
*
*/
public class RoomDimension
{

	private double length;
	private double width;
	
	public RoomDimension( double length, double width) {
		
		this.length = length;
		this.width = width;
	}
	public double calculateArea() {
		
				return length*width;
				 
	}
	public String toString() {
		return "";
		
	}
	
	
	
	
}
