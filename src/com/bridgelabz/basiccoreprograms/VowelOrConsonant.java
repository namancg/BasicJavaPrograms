package com.bridgelabz.basiccoreprograms;
import java.util.*;
public class VowelOrConsonant {

	public static void main(String[] args) {
		int i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character : ");
		char ch=sc.next( ).charAt(0);
		switch(ch)
		{
		 case  'a' :
		 case 'e'  :
		 case 'i'  :
		 case 'o'  :
		 case 'u'  :
		 case 'A' :
		 case 'E'  :
		 case 'I'   :
		 case 'O'  :
		 case 'U'  :i++;
		}
		if(i==1)
		System.out.println(ch+" is  Vowel");
		else 
			if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
			System.out.println(ch+" is Consonent");
			else
			System.out.println("Not an alphabet");	

	}

}
