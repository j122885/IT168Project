import java.text.NumberFormat;

/*
* File name: EmpPayroll.java
*
* Programmer:Jeremy Howard
* ULID: jlhowa3
*
* Date: Sep 18, 2019
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
public class EmpPayroll
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	
	{
		String lastName = "Davis";
		String firstName = "Jeremy";
		String name = (firstName + " "  + lastName);
		double payRate = 9.5;
		int hoursWorked = 35;
		double grossPayYTD = 0;
		
		
		
		Employee employee1 = new Employee( lastName , firstName, payRate);
		Employee employee2 = new Employee("Richard", "Davis", 9.5);
		double calc = employee1.calculatePay(hoursWorked);
		System.out.println(calc);
		employee1.giveRaise(0.08);
		double calc2 = employee1.calculatePay(45);
		System.out.println(calc2);
		
		System.out.println(name);
		
	
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("Hourly pay rate: " + fmt.format(payRate));
		System.out.println("Gross pay year to date: " + fmt.format(grossPayYTD));
		
		
		
		
		

	}

}
