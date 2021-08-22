package com.bridgelabz.basiccoreprograms;
import java.util.*;
public class Factors {

	public static void main(String[] args) {
		int N=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		N=sc.nextInt();
		primeFactors(N);
	}
	public static void primeFactors(int n)
    {
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        if (n > 2)
            System.out.print(n);
    }

}