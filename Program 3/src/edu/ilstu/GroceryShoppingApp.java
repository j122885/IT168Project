/*
* File name: GroceryShoppingApp.java
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
import java.util.Scanner;

/**
* <Creates a shopping cart for user and outputs totals for orders.>
*
* @author Jeremy Howard
*
*/
public class GroceryShoppingApp
{ 

	/**
	 *  Creates a new order.
	 */
	public static void main(String[] args)
	{
		String vegetableName;
		double vegetablePrice;
		String fruitName;
		double fruitPrice;
		double vegetableOrdered;
		double fruitOrdered;
		String poundTable = "";
		
		
		
		
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("$###.00");
		
		String t1 = "Vegetable Name\t" + "Price Per Pound\n" +
					"Broccoli\t"+        "$3.12\n" +
					"Yellow Onion\t" +	 "$1.15\n" +
					"Chili Pepper\t"+	 "$4.58\n" +
					"Greens Bundle\t" +  "$2.82" ;
		String t2 = "Fruit Name\t" + "Price Per Pound\n" +
					"Apple\t\t" +       "$1.73\n" +
					"Grape\t\t"  +	  "$2.15\n" +
					"Key Lime\t"  +	  "$2.58\n" +
					"Navel Orange\t" +"$1.86" ;
		
		
		System.out.println(t1);

		System.out.println("-----------------------------------------");
		System.out.println("Table 1: Vegetable names with corresponding price per pound");
		
		System.out.print("\nPlease select the vegetable from Table 1: ");
		vegetableName = scan.nextLine();
		
		System.out.print("Please enter the price of the selected vegetable: ");
		vegetablePrice =scan.nextDouble();
		
		System.out.println("\n-----------------------------------------");
		System.out.println(t2);
		System.out.println("-----------------------------------------");
		System.out.println("Table 2: Fruit names with corresponding price per pound");

		scan.nextLine();
		System.out.print("\nPlease select the fruit from Table 2: ");
		fruitName = scan.nextLine();
		
		
		System.out.print("Please enter the price of the selected fruit: ");
		fruitPrice = scan.nextDouble();
		
		System.out.println("\n-----------------------------------------");
		
		System.out.println("Grocery Shopping Menu");
		System.out.println("\nName:" + "\t\t\t" + "Price Per Pound:");
		System.out.println( vegetableName + "\t\t" + df.format(vegetablePrice));
		

				if(fruitName.length()>=8) {
					poundTable += fruitName + "\t\t" + df.format(fruitPrice);
					
				}
				else {
					poundTable += fruitName + "\t\t\t" + df.format(fruitPrice);
				}
				
					
		System.out.println(poundTable);
		
		
		//System.out.println(fruitName + "\t\t\t" + df.format(fruitPrice));
		System.out.println("-----------------------------------------");
		
		System.out.print("\nEnter the pounds of " + vegetableName + " ordered: ");
		vegetableOrdered = scan.nextDouble();
		System.out.print("Enter the pounds of " + fruitName + " ordered: ");
		fruitOrdered = scan.nextDouble();
		
		System.out.println("\n-----------------------------------------");

		
		GroceryShopping list1 = new GroceryShopping();	
		list1.setVegetableName(vegetableName);    
		list1.setVegetablePrice(vegetablePrice);
		list1.setFruitName(fruitName);
		list1.setFruitPrice(fruitPrice);
		list1.setVegetableOrdered(vegetableOrdered);
		list1.setfruitOrdered(fruitOrdered);
		
		
		System.out.println(list1);
		System.out.println("-----------------------------------------");
		
		
	}

}
