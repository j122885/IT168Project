/*
* File name: Circle.java
*
* Programmer:Jeremy Howard
* ULID: jlhowa3
*
* Date: Sep 18, 2019
*
* Class: IT 168
* Lecture Section: 16
* Lecture Instructor: Tonya Pierce
* Lab Section: 17
* Lab Instructor: Kushal Sharma
*/
package edu.ilstu;

import java.text.DecimalFormat;


/**
* <Method container for CircleDriver>
*
* @author Jeremy Howard
*
*/
public class Circle
{ 
	 double radius;
	 final double PI = 3.14159;
	 
	
	public void setRadius( double rad) {
		
		this.radius = rad;
	}
	public double getRadius() {
		return radius;
	}
	public double calculateArea()
	{	
		return PI*radius*radius;
	}
	public double calculateDiameter() {
		return radius*2.0;
	}
	public double calculateCircumference() {
		
		return 2*PI*radius;
		
	}
	
	
	public String toString() {
		DecimalFormat df = new DecimalFormat("###,###.00");
		
		return  
		"\nArea = " + df.format(calculateArea()) +
		"\nDiameter = " + df.format(calculateDiameter()) + 
		"\nCircumference = " + df.format( calculateCircumference());
		
	}
	
	
	
	
	
	
	
	
	
	

}
