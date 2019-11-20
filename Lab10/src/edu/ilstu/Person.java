package edu.ilstu;
/*
* File name: Person.java
*
* Programmer:Jeremy Howard
* ULID: jlhowa3
*
* Date: Oct 23, 2019
*
* Class: IT 168
* Lecture Section: 16
* Lecture Instructor: Tonya Pierce
* Lab Section: 17
* Lab Instructor: Kushal Sharma
*/

/**
* <Class that serves the Person Driver Class>
*
* @author Jeremy Howard
*
*/
public class Person
{
	String firstName;
	String lastName;
	int age;
	
	
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		
	}
	
	
	/**
	 * @return the firstName
	 */
	public String getFirstName()
	{
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName()
	{
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	/**
	 * @return the age
	 */
	public int getAge()
	{
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public String toString() {
		return firstName + " "+ lastName + ", "  + age + " years old";
	}
	
	public boolean equalsName( Person p2) {
		
	
		if( p2.getLastName().equals(this.lastName)  && p2.getFirstName().equals(this.firstName) ) {
			
			return true;
		}
		
		
		return false;
	}
	
}
