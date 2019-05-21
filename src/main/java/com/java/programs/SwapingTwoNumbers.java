package com.java.programs;

import java.util.Scanner;

public class SwapingTwoNumbers {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value:" );
		String a= sc.nextLine();
		System.out.println("Enter second value:" );
		String b= sc.nextLine();
		a=a+b;  
		/* a=a+b;
		b=a-b;
		a=a-b;   */
		b=a.substring(0, (a.length()-b.length()));
		a=a.substring(b.length());
		
		System.out.println(a);
		System.out.println(b);
	}

}
