package edu.ilstu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * <Holds all th methods for the MoreArrayFun driver>
 * @author Mary Elaine Califf and 
 *
 */
public class ArrayManager
{
	int [] array;
	int count =  100;
	
	
	public ArrayManager() {
		  array = new int[100];
	  }
    
    public  void fillArray()
    {
        int curVal;
        
        Scanner input = null;
        try
        {
            input = new Scanner(new File("data.txt"));
            count = 0;
            int i = 0;
            while (input.hasNextInt())
            {
                curVal = input.nextInt();
                array[i] = curVal;
                count++;
                i++;
            }
            input.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Could not find data.txt file");
            System.exit(1);
        }
    }
    
    public int smallest() {
    	
    	int small = array[0];
    	for( int i = 1; i < count; i++) {
    		if(this.array[i] <= small) {
    			small = this.array[i];
    		}
    	}
    	return small;
    }
    public int largest() {
    	
    	int large = array[0];
    	for( int i = 1; i < count; i++) {
    		if(this.array[i] >= large) {
    			large = this.array[i];
    		}
    	}
    	return large;
    }
    public int instance(int num) {
    	
    	for( int i = 0; i < count; i++) {
    		if(num == array[i]) {
    			
    			return i;
    		}
    	}
    	return -1;
    }
}

