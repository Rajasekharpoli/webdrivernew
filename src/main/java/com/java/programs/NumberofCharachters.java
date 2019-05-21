package com.java.programs;

import java.util.Scanner;

public class NumberofCharachters {
	
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string:");
		String s= sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++) {
			if((s.charAt(i))!=' ') {
				count++;
			}
		}
		System.out.println("Number of charachters:"+count);
	}

}
