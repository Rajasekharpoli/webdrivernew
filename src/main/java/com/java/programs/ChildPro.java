package com.java.programs;

public class ChildPro extends ParentPro{
	
public void car() {
	System.out.println("child class");
}
	public static void main(String args[]) {
		ChildPro cp = new ChildPro();
		cp.car();
		ParentPro pp= new ParentPro();
		pp.vehicle();
	}
}
