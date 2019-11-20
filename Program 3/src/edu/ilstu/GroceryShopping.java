/*
* File name: GroceryShopping.java
*
* Programmer:Jeremy Howard
* ULID: jlhowa3
*
* Date: Sep 14, 2019
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
* <Class that holds all the methods for the Grocery Shopping App>
*
* @author Jeremy Howard
*
*/
public class GroceryShopping
{
	 private String vegetableName;
	 private String fruitName;
	 private double vegetablePrice;
	 private double fruitPrice;
	 private double vegetableOrdered;
	 private double fruitOrdered;
	 final double SERVRATE = 0.035 ;
	 final double DELIVFEE = 5.0;
	 
	 /**
	  * default constructor
	  */
	 
	 
	 public GroceryShopping() { 
		 
	 }
	 /**
	  * Custom constructor that accepts a vegetable name, vegetable price, fruit price, number of vegetables ordered , and number of fruit ordered.
	  * 
	  */
	 
	 public GroceryShopping(String vegetableName, double vegetablePrice, String fruitPrice, double VegetablePrice, double vegetableOrdered, double fruitOrdered) { //custom constructor
	
		
		 vegetableOrdered = 0;
		 fruitOrdered = 0;
		 
	 }
	 /**
	  * @return vegetable name
	  */
	 
	public String getVegetableName() {
		return vegetableName;       
		
	}
	/**
	  * @return fruit name
	  */
	
	public String getFruitName() {
		return fruitName;
		
	}
	/**
	  * @return vegetable price
	  */
	
	public double getVegetablePrice() {
		return vegetablePrice;
	}
	/**
	  * @return fruit price
	  */
	
	public double getFruitPrice() {
		return fruitPrice;
	
	}
	/**
	  *@return number of vegetables ordered
	  */
	
	public double getVegetableOrdered() {
		return vegetableOrdered;
	
	}
	/**
	  *@return number of fruit ordered
	  */
	
	public double getfruitOrdered() {
		return fruitOrdered;
	
	}
	/**
	  *  sets the name of the vegetable
	  */
	
	public void setVegetableName(String vname) {
		this.vegetableName = vname;
		
	}
	/**
	  *  sets the name of the fruit
	  */
	public void setFruitName(String fname) {
		this.fruitName = fname;
		
	}
	/**
	  *  sets the price of the vegetable
	  */
	
	public void setVegetablePrice(double vprice) {
		this.vegetablePrice = vprice;
	}
	/**
	  *  sets the price of the fruit
	  */
	
	public void setFruitPrice( double fprice) {
		this.fruitPrice = fprice;
	
	}
	/**
	  *  sets the number the vegetables ordered
	  */
	
	public void setVegetableOrdered(double vorder) {
		this.vegetableOrdered = vorder;
	
	}
	/**
	  *  sets the number fruit ordered
	  */
	
	public void setfruitOrdered(double forder) {
		this.fruitOrdered = forder;
	
	}
	/**
	  *  Calculates and returns the subtotal of the order
	  */
	public double calculateSubtotal() {
		double vor = vegetableOrdered*vegetablePrice;
		double foor = fruitOrdered*fruitPrice;
		
		return vor + foor;
		
	}
	/**
	  *  Calculates and returns the additonal fee of the order
	  */
	public double calculateAdditionalFee() { 
		return (calculateSubtotal()*SERVRATE) + DELIVFEE;
	}
	public double calculateTotalBill() { 
		return calculateAdditionalFee() + calculateSubtotal();
	}
	DecimalFormat df = new DecimalFormat("$###,###.00");
	DecimalFormat nf = new DecimalFormat("###,###.00");
	
	/**
	  *  Displays a summary of the order
	  */
	 
	
	public String displayOrderSummary() { 
		String fruitLength = "";
		if(fruitName.length()>=8) {
			fruitLength += fruitName + "\t\t" + nf.format(fruitOrdered);
			
		}
		else {
			fruitLength += fruitName + "\t\t\t" + nf.format(fruitOrdered);
		}
		
		return "Grocery Shopping Order Summary\n" +
				"\nName:" + "\t\t\t" + "Pounds Ordered:"  + "\n"+
				vegetableName + "\t\t" + nf.format(vegetableOrdered) + "\n" + fruitLength + 
				"\n\nSub-total:\t\t" + df.format(calculateSubtotal()) +
				"\nAdditional Fee:\t\t" + df.format((calculateAdditionalFee()))  +
				"\nTotal Bill:\t\t"  + df.format((calculateTotalBill()));
				
		
				}
	/**
	  * returns the method that  displays a summary of the order
	  */
	
	public String toString() { //displays the order summary
		return displayOrderSummary();
	}
	
	
		
}
