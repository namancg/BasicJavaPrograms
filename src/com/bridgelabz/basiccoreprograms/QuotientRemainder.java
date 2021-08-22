package com.bridgelabz.basiccoreprograms;
import java.util.*;
public class QuotientRemainder {

	public static void main(String[] args) {
		int dividend = 0, divisor = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Dividend and Divisor");
		dividend=sc.nextInt();
		divisor=sc.nextInt();
	    int quotient = dividend / divisor;
	    int remainder = dividend % divisor;
	    System.out.println("Quotient = " + quotient);
	    System.out.println("Remainder = " + remainder);
	}

}
