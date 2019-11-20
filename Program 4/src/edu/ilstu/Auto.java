/*
* File name: Auto.java
*
* Programmer:Jeremy Howard
* ULID: jlhowa3
*
* Date: Sep 26, 2019
*
* Class: IT 168
* Lecture Section: 16
* Lecture Instructor: Tonya Pierce
* Lab Section: 17
* Lab Instructor: Kushal Sharma
*/
package edu.ilstu;

/**
* <Helper class that holds the vehicle description.>
*
* @author Jeremy Howard
*
*/
public class Auto
{
	  private String year;
	  private String make;
	  private String model;
	  private double milegage;
	  private double price;
	  /**
	   * 
	   *  Custom constructor that takes in the year, make, and model of the vehicle.
	   */
	  
	  public Auto(String year, String make, String model){
		  this.year = year;
		  this.make = make;
		  this.model = model;
		  }

	  /**
	   * @return mileage
	   * 
	   */
	public double getMilegage()
	{
		return milegage;
	}
	/**
	   * 
	   * sets the mileage
	   */

	public void setMilegage(double milegage)
	{
		this.milegage = milegage;
	}

	/**
	   * 
	   * @return the price
	   */
	
	public double getPrice()
	{
		return price;
	}


	/**
	   *  sets the price
	   * 
	   */
	public void setPrice(double price)
	{
		this.price = price;
	}


	/**
	   * @returns the year
	   * 
	   */
	public String getYear()
	{
		return year;
	}

	/**
	   * @returns the make
	   * 
	   */
	public String getMake()
	{
		return make;
	}
	/**
	   * 
	   * @returns the model
	   */

	
	public String getModel()
	{
		return model;
	}

	/**
	   * toString that returns the year, make, and model that will be used for the vehicle description.
	   * 
	   */
	public String toString(){
		
		return year + " " + make +" "+ model;
	}

	

}
