package com.java.programs;

public class MethodOverloading {

public int add(int a, int b) {
	System.out.println("aadition of two numbers:"+ (a+b));
	return a+b;
	}
public int add(int a,int b, int c) {
	System.out.println("addition of three numbers");
	return a+b+c;
}

public double add(double a, double b) {
	System.out.println("addition of double numbers:"+ (a+b));
	
	return a+b;
}

	public static void main(String args[]) {
		MethodOverloading mo =new MethodOverloading();
		mo.add(5, 8);
		mo.add(5, 5, 8);
		mo.add(5.1, 5.2);
	}
	

}
