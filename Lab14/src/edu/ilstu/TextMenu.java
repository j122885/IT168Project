package edu.ilstu;

import java.util.*;

/*
 * TextMenu.java
 * Created on Jan 13, 2005
 * By Mary Elaine Califf
 *
 */

/**
 * TextMenu class 
 * 
 * @author Mary Elaine Califf
 */
public class TextMenu
{
    private String [] menuItems;

    /**
     * @param menuItems
     * An array of Strings that represent the various menu labels.  The array 
     *  must be the exact size to hold the number of menu items desired.
     */
    public TextMenu(String[] menuItems)
    {
        this.menuItems = menuItems;
    }
    
    /**This method displays the menu and gets a choice from the user.  The choice 
     *  is validated.
     * 
	 * @param scan A Scanner object attached to the keyboard for user input
     * @return
     * A number between 1 and the number of menu items, representing the user's choice
     */
    public int getChoice(Scanner scan)
    {
        int choice;
        String input;
        
        this.displayMenu();
        System.out.print("Please enter your choice(1-" + menuItems.length + "): ");
        input = scan.next();
        choice = this.validateChoice(input);
        while (choice == -1)
        {
            System.out.println("That is not a valid choice. Please try again.");
            System.out.print("Enter a number between 1 and " + menuItems.length + ": ");
            input = scan.next();
            choice = this.validateChoice(input);
        }
        return choice;
    }
    
    // displays the menu to the screen
    private void displayMenu()
    {
        System.out.println();
        System.out.println();
        for (int i = 0; i < menuItems.length; i++)
        {
            System.out.println("  " + (i+1) + "  " + menuItems[i]);
        }
        System.out.println();
    }
    
    // validates the menu choice
    private int validateChoice(String input)
    {
        int choice;
        try 
        {
            choice = Integer.parseInt(input);
        }
        catch (NumberFormatException e)
        {
            choice = -1;
        }
        if (choice < 1 || choice > menuItems.length)
        {
            choice = -1;
        }
        return choice;
    }
}
