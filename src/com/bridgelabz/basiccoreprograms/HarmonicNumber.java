package com.bridgelabz.basiccoreprograms;
import java.util.*;
public class HarmonicNumber {

	public static void main(String[] args) {
		  int N = 0;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter The Number Of Harmonic Series Needed");
		  N=sc.nextInt();
	      double result = 0.0;
	      System.out.println("The harmonic series is: ");
	      while (N > 0) {
	            result = result + (double)1 / N;
	            N--;
	            System.out.print(result + ", ");
	        }

	}

}
