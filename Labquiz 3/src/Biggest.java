import java.util.Scanner;

/*
* File name: Biggest.java
*
* Programmer:Jeremy Howard
* ULID: jlhowa3
*
* Date: Oct 30, 2019
*
* Class: IT 168
* Lecture Section: 16
* Lecture Instructor: Tonya Pierce
* Lab Section: 17
* Lab Instructor: Kushal Sharma
*/

/**
* <insert class description here>
*
* @author Jeremy Howard
*
*/
public class Biggest
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print(" Please enter  a number(999 to quit): ");
		int input = scan.nextInt();
		int large = input;
		int largest = 0;
		int last;
		while( input != 999) {
					 
			 last = input;		 
			 
			 if(large >= last) {
				 largest = large;
				 large = largest;
			 }else large = input;
			System.out.print(" Please enter  a number(999 to quit): ");
			input = scan.nextInt();
			
		}
		System.out.println( "The largest of your numbers is " + largest);
	}

}
