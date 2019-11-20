/*
* File name: GeographicAreaLookup.java
*
* Programmer:Jeremy Howard
* ULID: jlhowa3
*
* Date: Oct 12, 2019
*
* Class: IT 168
* Lecture Section: 16
* Lecture Instructor: Tonya Pierce
* Lab Section: 17
* Lab Instructor: Kushal Sharma
*/
package edu.ilstu;

/**
* <Class that holds the method for determining geographic location.>
*
* @author Jeremy Howard
*
*/
public class GeographicAreaLookup
{
	private static String code;
	private static String area;
	
	public GeographicAreaLookup(String code) {
		this.code = code;
	}
	
	
	public static String determineAreaByZip() {
		
		
		if(Integer.parseInt(code.substring(0,1)) >= 0 && Integer.parseInt(code.substring(0,1)) <= 3) {
			
			 area =  code + " is in East Cost area";
		}else if(Integer.parseInt(code.substring(0,1)) >= 4 && Integer.parseInt(code.substring(0,1)) <= 6) {
			
			area =  code + " is in Central Plains area";
		}else if(Integer.parseInt(code.substring(0,1)) == 7 ){
			
			area =  code + "a is in South area";
		
		}else if(Integer.parseInt(code.substring(0,1)) >= 8 && code.charAt(0) <= 9) {
			
			 area =  code + " is in West area";
		}else 
			 area = "Invalid Zipcode";
		
		
	
		return area;
		
	}
	
	public String toString() {
		
		return determineAreaByZip();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
