package com.bridgelabz.basiccoreprograms;
import java.util.*;
public class SwapNumbers {

	public static void main(String[] args) {
		float first = 0, second = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers to be swapped");
		first=sc.nextFloat();
		second=sc.nextFloat();
        float temporary = first;
        first = second;
        second = temporary;
        System.out.println("After swap");
        System.out.println(first);
        System.out.println(second);

	}

}
