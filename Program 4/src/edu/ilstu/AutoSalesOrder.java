/*
* File name: AutoSalesOrder.java
*
* Programmer:Jeremy Howard
* ULID: jlhowa3
*
* Date: Sep 29, 2019
*
* Class: IT 168
* Lecture Section: 16
* Lecture Instructor: Tonya Pierce
* Lab Section: 17
* Lab Instructor: Kushal Sharma
*/
package edu.ilstu;
import java.text.DecimalFormat;
import  java.util.Date;
/**
* <Keeps track of the information for each customer order.>
*
* @author Jeremy Howard
*
*/

public class AutoSalesOrder
{
	 public static final double OILCHANGE = 299.99;
	 public static final double TIREROTATION = 149.50;
	 public static  final double CAREWASH = 499.99;
	 public static final double VEHICLETAX = 0.035;
	 public static final double SERVICETAX = 0.08;
	 public static final double SERVICEREBATE = 0.02;
	  
	 
	 private double orderPrice;
	 private String vdescript;
	 private double vprice;
	 private double vtax;
	 private double vsubtotal;
	 private double servicePackagePrice;
	 private double servicePackageTax;
	 private double servicePackageSub;
	 private double serviceCash;
	 private double serviceRebate;
	 private boolean oilIndicator;
	 private boolean tireIndicator;
	 private boolean washIndicator;
	 private double tires;
	 private double oil;
	 private double car;
	 private String wash;
	 private String rotation;
	 private String change;
	 private Date orderDate;
	 private String display;
	 DecimalFormat df = new DecimalFormat("$###,##0.00");
	 
	 
	 /**
	 * 
	 * Default constructor that sets the date to the current date
	 */
	 
	 
	 public AutoSalesOrder() {
	
		  this.orderDate = new Date();
			//date = orderDate;
		 }
	 
	 /**
		 * Custom constructor that accepts the vehicle description and vehicle price
		 *
		 */
	 public AutoSalesOrder(String vdescript, double vprice) {
		 this();
		 this.vdescript = vdescript;
		 this.vprice = vprice;
		 
	 	}

	 /**
		 * 
		 *@returns the vehicle decription
		 */
	 public String getVdescript()
	{
		return vdescript;
	}
	 /**
		 * 
		 * Sets the vehicle descriptions
		 */
	
	 public void setVdescript(String vdescript)
	{
		this.vdescript = vdescript;
	}
	 /**
		 * @returns the order price
		 *
		 */
	
	 public double getOrderPrice()
	{
		return orderPrice;
	}

	 /**
		 * 
		 * @return the service cash
		 */
	 public double getServiceCash()
	{
		return serviceCash;
	}

	 /**
		 * 
		 * Sets the vehicle price and calculates and sets the vehicle tax, service cash, vehicle subtotal, and order price
		 */
	 public void setVprice(double vprice)
	{
		
		
		this.vprice = vprice;
		vtax = Math.round(vprice*VEHICLETAX);
		serviceCash = Math.round(vprice*SERVICEREBATE);
		vsubtotal = vprice + vtax;
		orderPrice = vsubtotal + servicePackageSub;
	}

	 /**
		 * 
		 * Sets the oilIndicator true or false. If true sets oil to the oil change package price. If false, set oil to 0.
		 */
	 public void setOilIndicator(boolean oilIndicator)
	{
		this.oilIndicator = oilIndicator;
		if(oilIndicator == true){
			change = "3-year oil change package";
			oil = OILCHANGE;
			
		}
		else {
			 oil = 0;
			 change = "";
		}
	}

	 /**
		 * 
		 * Sets the tireIndicator true or false. If true sets oil to tire rotation package price. If false, set tire to 0.
		 */
	 
	 public void setTireIndicator(boolean tireIndicator)
	{
		this.tireIndicator = tireIndicator;
		
		if(tireIndicator == true){
			
			tires = TIREROTATION;
			rotation = "3-year tire rotation package";
			
		}
		else {
			 tires = 0;
			 rotation = ""; 
		}
	}

	 /**
		 * 
		 * Sets the washIndicator true or false. If true sets car to tire rotation package price. If false, set car to 0.
		 */
	 public void setWashIndicator(boolean washIndicator)
	 {
		this.washIndicator = washIndicator;
		if(washIndicator == true){
			
			car = CAREWASH;
			wash = "3-year tire rotation package";
			
		}
		else {
			 car = 0;
			 wash = ""; 
		}
		
	}
	 /**
		 * Calculates the service package price, service package rebate, service package price, and service package subtotal.
		 */
	
	 private void calculateOrderLineitemsCosts() {
		
		servicePackagePrice = tires + oil + car;
		serviceRebate = serviceCash;
		if(servicePackagePrice == 0  ) {
			serviceRebate = 0;
		}
		else if(serviceCash > servicePackagePrice) {
			serviceRebate = servicePackagePrice;
		}
		servicePackageTax = Math.round(servicePackagePrice*SERVICETAX);
		servicePackageSub = servicePackagePrice + (- serviceRebate) +  servicePackageTax;
		
	}
	 /**
		 *  Method that holds if else statements that decided the service packages to display in the receipt.
		 */
	 
	 
	 public String displayPackage(){
		 
		 if(change.equals("3-year oil change package") && rotation.equals("3-year tire rotation package") &&  wash.equals("3-year tire rotation package") ) {
		 return	 display= 			"\n\nService Package"	+
									"\n\t" + change +
									"\n\t" + rotation +
									"\n\t" + wash;
		 } else if(change.equals("3-year oil change package") && rotation.equals("3-year tire rotation package")) {
			 return display = "\n\nService Package"	+
						"\n\t" + change +
						"\n\t" + rotation;
		 }else if(change.equals("3-year oil change package") && wash.equals("3-year tire rotation package")) {
			 return display= 			"\n\nService Package"	+
											"\n\t" + change +
											"\n\t" + wash;
			  
		 }else if(rotation.equals("3-year tire rotation package") &&  wash.equals("3-year tire rotation package")) {
			 
			 return display ="\n\nService Package"	+
					
						"\n\t" + rotation +
						"\n\t" + wash;
		 } else if(change.equals("3-year oil change package")) {
			 return display ="\n\nService Package"	+
						"\n\t" + change;
					 
		 }else if(rotation.equals("3-year tire rotation package")) {
			 return display ="\n\nService Package"	+
					"\n\t" + rotation;
		 }else if(wash.equals("3-year tire rotation package")) {
			 return display = "\n\nService Package"	+
						"\n\t" + wash;
			 
		 }else {
				 return display = "\n\nService Package"+
		 "\n\t none";
	 
	 		}
		 
	 }
	 
	 /**
		 * to String that will display the sales order receipt
		 */
	 public String toString(){
		 calculateOrderLineitemsCosts();
		 
		 
		 return 
				 			
							"Auto Sales Order Receipt" +
							"\nOrder Date: "  + orderDate +
							"\n------------------------------------------------------------" +
							"\nItem \t\t\t\t\t\t      Amount" +
							"\n------------------------------------------------------------" +
							"\nVehicle" +
							"\n\t" + getVdescript() +
							"\n  Sales Price\t\t\t\t\t  " + df.format(vprice) + 
							"\n  SalesTax\t\t\t\t\t     " + df.format((vprice*VEHICLETAX)) + 
							"\n  Subtotal\t\t\t\t\t  " + df.format(((vprice*VEHICLETAX) + vprice)) +
							
							displayPackage() +
										
							 
						    "\n  Sale price" +"\t\t\t\t\t      " + df.format(servicePackagePrice) +
							"\n  SalesTax"+ "\t\t\t\t\t      " + df.format(servicePackageTax) +
							"\n  Rebate" +  "\t\t\t\t\t    " + "(" + df.format(serviceRebate)+ ")" +
					 		"\n  Subtotal" + "\t\t\t\t\t     " + df.format(servicePackageSub) +
					 		
					 		"\n------------------------------------------------------------" +
					 		"\nGrand Total\t\t\t\t\t  " + df.format((servicePackageSub + ((vprice*VEHICLETAX) + vprice))) +
					 		"\n------------------------------------------------------------";
					 		 
	 	}
	} 						 
	 
