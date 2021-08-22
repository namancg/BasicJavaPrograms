package com.bridgelabz.basiccoreprograms;
import java.util.*;

public class PowerOf2 {

	public static void main(String[] args) {
		int N;        
		int currentPower = 1;    
		int exponent = 0;            
		Scanner sc = new Scanner(System.in);
		System.out.println("How many powers of 2?");
		N = sc.nextInt();
		while (exponent<N)
		 {
		     currentPower=currentPower*2;
		     exponent++;
		     System.out.println(currentPower);

	     }
	  
	}
	
}