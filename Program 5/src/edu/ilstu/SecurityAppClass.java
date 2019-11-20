/*
* File name: SecurityAppClass.java
*
* Programmer:Jeremy Howard
* ULID: jlhowa3
*
* Date: Oct 13, 2019
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
* <Tool that can be used to generate a password, encrypt a phrase, and decrypt a phrase>
*
* @author Jeremy Howard
*
*/
public class SecurityAppClass
{
	static Scanner scan = new Scanner(System.in);
	 
	
	
	public static void main(String[] args)
	{
		mainMenu();
	

		}
	/*Asks the user to choose one of three tools
	 */
	public static void mainMenu(){
		
		System.out.println("------------------------------------------------");
		System.out.println("Thank you for choosing the IT-168 Security tool!");
		System.out.println("------------------------------------------------");
		
		System.out.println("Please select a tool from the options below:\n" + 
				"1. Password Generator\n" + 
				"2. Encryption Tool\n" + 
				"3. Decryption Tool");
		
		System.out.print("Your Selection(1,2,3)> ");
		 int tool = scan.nextInt();
		 switch(tool) {
			case 1:
				passwordSelected();
				break;
			case 2: 
				enctyptionSelected();
				break;
			case 3:
				decryptionSelected();
				break;
			}
	}

	/*Asks the user to enter a phrase that will access the generate password method.
	 */
	public static void passwordSelected() {
		scan.nextLine();
		System.out.print("Please Enter a phrase that is at least 8 characters long>");
		String pass = scan.nextLine();
		
			while( pass.length() < 8) {
			System.out.println("The phrase must be at least 8 characters long!");
			System.out.print("Please Enter a phrase that is at least 8 characters long> ");
			pass = scan.nextLine();
		}
		
		System.out.println("Your password is: " + Security.generatePassword(pass));
		
		
	}
	/*Asks the user choose which encryption they want to use..
	 */
	public static void enctyptionSelected() {
		
		System.out.println("Please select the type of Encryption from the options below:\n" + 
				"1. Caeser Encryption\n" + 
				"2. Vigener Encryption\n");
		System.out.print("Your selection> ");
		int choice = scan.nextInt();
		

		while(!(choice ==1 || choice == 2 )) {
			System.out.println("That is not a valid choice. Please choose between option 1 and 2");
			System.out.print("Your selection> ");
			choice = scan.nextInt();
		
		}
		
		
			if(choice ==2) {
				
				scan.nextLine();
				System.out.print("Please Enter the phrase you want to encrypt> ");
				String phrase = scan.nextLine();
				
				System.out.print("Please Enter the key you want to use for encryption> ");
				String key = scan.nextLine();
				
				System.out.println("Here is your Encryped Phrase: " + Security.vigenereEncrypt(phrase, key));
				
			}else if(choice ==1) {
				scan.nextLine();
				System.out.print("Please Enter the phrase you want to encrypt> ");
				String phrase = scan.nextLine();
				
				System.out.print("Please Enter the offset you want to use for encryption> ");
				int offset = scan.nextInt();
				System.out.println("Here is your Encryped Phrase: " + Security.caesarEncrypt(phrase, offset));
			}
		
	}
	/*Asks the user choose which decryption they want to use..
	 */
	public static void decryptionSelected() {
		
		System.out.println("Please select the type of Encryption from the options below:\n" + 
				"1. Caeser Decryption\n" + 
				"2. Vigener Decryption\n");
		System.out.print("Your selection> ");
		int choice = scan.nextInt();
		

		while(!(choice ==1 || choice == 2 || scan.hasNextInt())) {
			System.out.println("That is not a valid choice. Please choose between option 1 and 2");
			System.out.print("Your selection> ");
			choice = scan.nextInt();
		
		}
		
			if(choice ==2) {
				
				scan.nextLine();
				System.out.print("Please Enter the phrase you want to decrypt> ");
				String phrase = scan.nextLine();
				
				System.out.print("Please Enter the key you want to use for decryption> ");
				String key = scan.nextLine();
				
				System.out.println("Here is your decryped Phrase: " + Security.vigenereDecrypt(phrase, key));
				
			}else if(choice ==1) {
				scan.nextLine();
				System.out.print("Please Enter the phrase you want to decrypt> ");
				String phrase = scan.nextLine();
				
				System.out.print("Please Enter the offset you want to use for decryption> ");
				int offset = scan.nextInt();
				System.out.println("Here is your decryped Phrase: " + Security.caesarDecrypt(phrase, offset));
			}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
