import java.util.Scanner;

/*
* File name: Average.java
*
* Programmer:Jeremy Howard
* ULID: jlhowa3
*
* Date: Nov 13, 2019
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
public class Average
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Please enter the number of classes: ");
		int classes = scan.nextInt();
		int [] student = new int [classes];
		int count = 1;
		int add = 0;
		for(int i = 0; i < classes; i++) {	
		System.out.print("Enter the size of class " + count + ": ");
		int size  = scan.nextInt();
		add+= size;
		student[i] = size;
		count++;	
		}
		
		System.out.println("\nThe average class size is  "  + (add/classes) + ".");
		
		int increment = 1;
		
		System.out.println("\nClass\t\tNumber of Students");
		for(int i = 0; i < student.length; i++) {
			
			
			System.out.println(increment +"\t\t" + student[i]);
			increment++;
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		

		
		

	}

}
