/*
* File name: Book.java
*
* Programmer:Jeremy Howard
* ULID: jlhowa3
*
* Date: Sep 20, 2019
*
* Class: IT 168
* Lecture Section: 16
* Lecture Instructor: Tonya Pierce
* Lab Section: 17
* Lab Instructor: Kushal Sharma
*/
package edu.ilstu;

/**
* <Calculates the total cost and price increase for two books>
*
* @author Jeremy Howard
*
*/
public class Book
{
	private final double SALESTAX = 0.075 ;
	private double price;
	private String title;
	
	/* 
	 *  constructor that take in variables for title and price 
	 * 
	 */
	public Book(String atitle , double thaprice) {
		
		title = atitle;
		price = thaprice;
	}
	/* 
	 *  gets the price
	 * 
	 */
	
	public double getPrice()
	{
		return price;
	}
	/* 
	 *  
	 * sets the price
	 */
	public void setPrice(double price)
	{
		this.price = price;
	}
	/* 
	 *  
	 * gets the title
	 */
	public String getTitle()
	{
		return title;
	}
	/* 
	 * sets the title
	 * 
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}
	/* 
	 *    Increases the price and take in a percentage in decimal form
	 * 
	 */
	
	public double increasePrice(double percent) {
	
	double increasePrice  = (percent * price);
	return price = increasePrice + price;
	
	}
	/* 
	 *  Calculates Sales given the number of books
	 * 
	 */
	
	public double calaculateSales(double nbooks) {
	
	double tax = nbooks * price * SALESTAX;
	double totalBill = (price*nbooks) + tax;
	return totalBill;
	}
	
	
	

}
