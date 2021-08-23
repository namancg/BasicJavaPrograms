package com.bridgelabz.basiccoreprograms;
import java.util.*;

public class PowerOf2 {
	public static void main(String[] args) {

	Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of N: ");
		int N = sc.nextInt();
		
		if(N <31 && N>=0) {
			
			for(int i=0; i<= N; i++) {
				
				System.out.println(""+Math.pow(2, i));
				
			}
			
		}
		else {
			System.out.println("Value should be less than 31");
		}
	  
	}
	
}
