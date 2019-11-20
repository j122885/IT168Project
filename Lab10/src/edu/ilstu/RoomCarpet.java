/*
* File name: RoomCarpet.java
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

import java.text.DecimalFormat;

/**
* <Class that uses the room dimension class to calculate the totalCost of the carpet.>
*
* @author Jeremy Howard
*
*/
public class RoomCarpet
{
private RoomDimension dimensions;
private double carpetPricePerSqFoot;

public RoomCarpet(RoomDimension dimensions, double carpetPricePerSqFoot){
	this.dimensions = dimensions;
	this.carpetPricePerSqFoot = carpetPricePerSqFoot;
}
public double calculateTotalCost() {
	
	
	return carpetPricePerSqFoot*dimensions.calculateArea();
}

public String toString() {
	DecimalFormat df = new DecimalFormat("$###,###.00");
	return 	"Total cost of the carpet is " + df.format(calculateTotalCost());
}


}
