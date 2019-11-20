/*
* File name: ChangeMaker.java
*
* Programmer:Jeremy Howard
* ULID: jlhowa3
*
* Date: Oct 9, 2019
*
* Class: IT 168
* Lecture Section: 16
* Lecture Instructor: Tonya Pierce
* Lab Section: 17
* Lab Instructor: Kushal Sharma
*/
package edu.ilstu;

import java.util.Scanner;

/**
* <Returns the amount of change given a price.>
*
* @author Jeremy Howard
*
*/
public class ChangeMaker
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		int price;
		int quarters = 0;
		int dimes=0;
		int nickels = 0;
		int qLeft;
		int dLeft;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Item price must be 25 cents to a dollar, in 5-cent increments." + 
		"\nEnter item price:");
		
		price = scan.nextInt();
		int change = (100-price);
		
		if(price >= 25 && price <= 100 && (price % 5) == 0) {
			
			 quarters = change/25;
			 qLeft = change - (quarters*25);
				if(change%25 != 0 && qLeft > 5) { 
					
					
					dimes = qLeft/10;
					
						if (qLeft%10 != 0) { 
							
							dLeft = qLeft - (dimes*10);
							nickels =  dLeft/5; 
							
						
						}
						else 
							nickels = 0;
							
								
				}
				else if(change%25 != 0 && qLeft <= 5 ) {
					
					nickels = qLeft/5;
					dimes = 0;
					
				}
				else 
				{
					dimes = 0;
					nickels = 0;
				}
			
		
			
			
		if( dimes == 0 && nickels == 0 && quarters>1) {			
			
			System.out.println("You bought an item for " + price +" cents and you gave me a dollar."
					+ "\nYou change is " +"\n" + quarters + " quarters");
			
		}else if(dimes == 0 && nickels == 0 && quarters==1) {	
				
			System.out.println("You bought an item for " + price +" cents and you gave me a dollar."
					+ "\nYou change is " +"\n" + quarters + " quarter");
				
		
		}else if(dimes != 0 && nickels == 0 && dimes > 1 && quarters>1) {
			
			System.out.println("You bought an item for " + price +" cents and you gave me a dollar."
					+ "\nYou change is " +"\n"+ quarters + " quarters" 
					+ "\n"+ dimes + " dimes" );
		}else if(dimes != 0 && nickels == 0 && dimes == 1 && quarters == 1) {
			
			System.out.println("You bought an item for " + price +" cents and you gave me a dollar."
					+ "\nYou change is " +"\n"+ quarters + " quarter" 
					+ "\n"+ dimes + " dime" );
		}else if(dimes != 0 && nickels == 0 && dimes == 1 && quarters > 1) {
			
			System.out.println("You bought an item for " + price +" cents and you gave me a dollar."
					+ "\nYou change is " +"\n"+ quarters + " quarters" 
					+ "\n"+ dimes + " dime" );
		}else if(dimes != 0 && nickels == 0 && dimes > 1 && quarters == 1  ) {
			
			System.out.println("You bought an item for " + price +" cents and you gave me a dollar."
					+ "\nYou change is " +"\n"+ quarters + " quarter" 
					+ "\n"+ dimes + " dimes" );
		}else if(nickels != 0 && dimes == 0 && dimes > 1 && quarters>1 && nickels >1){
			System.out.println("You bought an item for " + price +" cents and you gave me a dollar."
					+ "\nYou change is " +"\n"+ quarters + " quarters" 
					+ "\n"+ nickels + " nickels" ); 
		}else if(nickels != 0 && dimes == 0 && quarters>1 && nickels ==1){
			System.out.println("You bought an item for " + price +" cents and you gave me a dollar."
					+ "\nYou change is " +"\n"+ quarters + " quarters" 
					+ "\n"+ nickels + " nickel" ); 
		}else if(nickels != 0 && dimes == 0 && dimes > 1 && quarters==1 && nickels ==1){
			System.out.println("You bought an item for " + price +" cents and you gave me a dollar."
					+ "\nYou change is " +"\n"+ quarters + " quarter" 
					+ "\n"+ nickels + " nickel" ); 
		}else if(nickels != 0 && dimes != 0 && dimes > 1 && quarters>1 && nickels >1){
			System.out.println("You bought an item for " + price +" cents and you gave me a dollar."
					+ "\nYou change is " +"\n"+ quarters + " quarters" 
					+ "\n" + dimes + " dimes"+ "\n"+ nickels + " nickels" );
		}else if(nickels != 0 && dimes == 0  && quarters==1 && nickels ==1){
			System.out.println("You bought an item for " + price +" cents and you gave me a dollar."
					+ "\nYou change is " +"\n"+ quarters + " quarter" 
					+ "\n"+ nickels + " nickel" );
		}else if(nickels != 0 && dimes != 0 && dimes == 1 && quarters == 1 && nickels == 1){
			System.out.println("You bought an item for " + price +" cents and you gave me a dollar."
					+ "\nYou change is " +"\n"+ quarters + " quarter" 
					+ "\n" + dimes + " dime"+ "\n"+ nickels + " nickel" );
		
		}else if( dimes == 0 && nickels != 0 && quarters ==0 && nickels > 1) {			
			
			System.out.println("You bought an item for " + price +" cents and you gave me a dollar."
					+ "\nYou change is " +"\n" + nickels + " nickels");
		
		}else if( dimes == 0 && nickels != 0 && quarters ==0 && nickels == 1) {			
			
			System.out.println("You bought an item for " + price +" cents and you gave me a dollar."
					+ "\nYou change is " +"\n" + nickels + " nickel");
		
		}else if( dimes != 0 && nickels == 0 && quarters ==0 && dimes == 1) {			
			
			System.out.println("You bought an item for " + price +" cents and you gave me a dollar."
					+ "\nYou change is " +"\n" + dimes + " dime");
		}else if( dimes != 0 && nickels == 0 && quarters == 0 && dimes > 1) {			
			
			System.out.println("You bought an item for " + price +" cents and you gave me a dollar."
					+ "\nYou change is " +"\n" + dimes + " dimes");
		}else if(nickels != 0 && dimes != 0 && dimes == 1 && quarters == 0 && nickels == 1){
			System.out.println("You bought an item for " + price +" cents and you gave me a dollar."
					+ "\nYou change is "  
					+ "\n" + dimes + " dime"+ "\n"+ nickels + " nickel" );
		}else if(nickels != 0 && dimes != 0 && dimes > 1 && quarters == 0 && nickels > 1){
			System.out.println("You bought an item for " + price +" cents and you gave me a dollar."
					+ "\nYou change is "  
					+ "\n" + dimes + " dime"+ "\n"+ nickels + " nickel" );
		}else 
			System.out.println("You bought an item for " + price +" cents and you gave me a dollar."
					+ "\nYou change is "  +
						"$0.00");

		
		
		// else System.out.println("You bought an item for " + price +" cents and you gave me a dollar."
		//		+ "\nYou change is " +"\n"+ quarters + " quarters" 
		//		+ "\n"+ dimes + " dimes" 
		//		+ "\n" + nickels + " nickels"); 
					
					
	}else if( price > 100 && (price % 5) != 0)	{
		
		
		
		System.out.println("Cost is invalid - it must be no more than 100 cents.");
		System.out.println("Cost is invalid - it must be evenly dividble by 5.");
	}else if(price < 25 && (price % 5) != 0 ) {
					
		System.out.println("Cost is invalid - it must be no less than 25 cents.");		
		System.out.println("Cost is invalid - it must be evenly dividble by 5.");
		
	}else if(price > 100) {
	
		System.out.println("Cost is invalid - it must be no more than 100 cents.");
	}else if(price < 25) {
		
		System.out.println("Cost is invalid - it must be no less than 25 cents.");	
	}else if((price % 5) != 0) {
		System.out.println("Cost is invalid - it must be evenly dividble by 5.");

	}
	
		
		

	}

}
