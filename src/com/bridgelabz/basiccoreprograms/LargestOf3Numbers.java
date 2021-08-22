package com.bridgelabz.basiccoreprograms;
import java.util.*;
public class LargestOf3Numbers {

	public static void main(String[] args) {
		  	int x, y, z;
	        Scanner s = new Scanner(System.in);
	        x = s.nextInt();
	        y = s.nextInt();
	        z = s.nextInt();
	        if(x > y && x > z)
	        {
	            System.out.println("Largest number is:"+x);
	        }
	        else if(y > z)
	        {
	            System.out.println("Largest number is:"+y);
	        }
	        else
	        {
	            System.out.println("Largest number is:"+z);
	        }

	}

}
