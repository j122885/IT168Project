/*
* File name: AutoSaleApp.java
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
import java.text.DecimalFormat;
import java.util.Scanner;

/**
* <Allows the user to order a new car.>
*
* @author Jeremy Howard
*
*/
public class AutoSaleApp
{
	private static String vdescript;
	private static double price;
	static AutoSalesOrder first = new AutoSalesOrder(vdescript, price);
	static Scanner scan = new Scanner(System.in);
	static int dove;
	

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		
		
		selectVehicle(); //displays the welcome message and allows the user to pick a car
		
		 if(dove >= 1 && dove <= 3) {
				 //displays options to use service cash to get service packages
			 	selectServiceOptions();
				System.out.println(first.toString()); //displays auto receipt
		 }
		else  { 
			System.out.println("The vehicle you have selected is not in our inventory.");
		
		}
	}
		
		
	
		

	
	
	public static void selectVehicle() {
		
		
		
		  
		String welcome =		"\nCHOOSE FROM OUR PROLIFIC VEHICLE INVENTORY ..." +
								"\n------------------------------------------------------------" +
								"\n Item# Vehicle\t\t\t  Miles\t\t Price" +
								"\n------------------------------------------------------------" +
								"\n 1     2018 Tesla Model 3\t  48,000\t $20,000.00" +
								"\n 2     2018 Dodge Charger\t  25,000\t $24,000.00" +
								"\n 3     2018 Chevy Subaru\t  18,000\t $18,000.00"; //String that holds the car table
		System.out.println("Welcome to Amazing Autos!"); //welcome message
		System.out.println("\nLet us help you find your next automobile.");
		System.out.println(welcome);
		System.out.print("\nSelect your vehicle by item # (e.g. 1, 2, 3): "); //prompts the user to choose a vehicle
		dove = scan.nextInt(); //user input for the switch methods
		
		switch(dove) { //holds different cases based on the car that is selected
		case 1: //if user inputs 1
			Auto order1 = new Auto( "2018", "Tesla ", "Model 3" );
			vdescript = order1.toString();// initializes Auto class toString to the vehicle description
			first.setVdescript(vdescript); //Sets vehicle description in the Auto Sales Order class to the variable that holds the Auto toString
			first.setVprice(20000); // sets the price to $20,0000
			price = order1.getPrice(); //gets the price from the Auto class and stores it in price 
			System.out.println("\nYou've selected the 2018 Tesla Model 3 ... a wise choice!");
		break;
		
		case 2: //if use inputs 2
			Auto order2 = new Auto("2018", "Dodge", "Charger");
			vdescript = order2.toString();// initializes Auto class toString to the vehicle description
			first.setVdescript(vdescript); //Sets vehicle description in the Auto Sales Order class to the variable that holds the Auto toString
			first.setVprice(24000); // sets the price to $24,0000
			price = order2.getPrice(); //gets the price from the Auto class and stores it in price 
			System.out.println("\nYou've selected the 2018 Dodge Charger ... a wise choice!");
		break;
		
		case 3: //if user inputs 3
			Auto order3 = new Auto("2018" , "Chevy", "Subaru"); 
			vdescript = order3.toString(); // initializes Auto class toString to the vehicle description
			first.setVdescript(vdescript); //Sets vehicle description in the Auto Sales Order class to the variable that holds the Auto toString
			first.setVprice(18000); // sets the price to $18,0000
			price = order3.getPrice(); //gets the price from the Auto class and stores it in price 
			System.out.println("\nYou've selected the 2018 Chevy Subaru ... a wise choice!");
			break;
			
		 
	}
	
		
	
	}
		
	public static void selectServiceOptions() {
		DecimalFormat df = new DecimalFormat("$###,###.00");
	
		System.out.println("\nProtect your purchase with our pre-paid service offerings.");
		System.out.println("Today's purchase qualifies for " + df.format(first.getServiceCash()) +   " in Service Cash.");
		
		System.out.print("\n\tAdd our 3-year oil change package for $299.99 (Y or N)? ");
		scan.nextLine();
		String answer1 = scan.nextLine();
		if(answer1.toLowerCase().equals("y")) { 
			
			first.setOilIndicator(true);
			
		}else {
			first.setOilIndicator(false);
		}
		
		
		System.out.print("\tAdd our 3-year tire rotation package for $149.50 (Y or N)? ");
		String answer2 = scan.nextLine();
		if(answer2.toLowerCase().equals("y")) {
			
			first.setTireIndicator(true);
			
		}else {
			first.setTireIndicator(false);
		}
		
		
		System.out.print("\tAdd our 3-year car wash package for $499.99 (Y or N)? ");
		String answer3 = scan.nextLine();
		if(answer3.toLowerCase().equals("y")) {
			
			first.setWashIndicator(true);
			
		}else {
			first.setWashIndicator(false);
		}
		
	
	
	System.out.println("\nCongratulations on your purchase!");
	System.out.println("\n------------------------------------------------------------");
	
	}







}




	

	





	

	
