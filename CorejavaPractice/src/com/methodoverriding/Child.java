package com.methodoverriding;



/*
 * public class Child extends Parent {
 * 
 * void marriage() {//OVERRIDING METHOD System.out.println("White girl"); }
 * 
 * public static void main(String[] args) { new Child().marriage();
 * 
 * 
 * }
 * 
 * }
 */
public class Child extends Parent{
	static void m1() {
		System.out.println("child m1 method");
		
	}
	 static void m2() {
		System.out.println("child m2 method");
	}
	public static void main(String[] args) {
		Parent p = new Child();//COMPILE TIME : PARENT  RUN TIME: CHILD
		p.m1();
		Child c = (Child)p;//convert parent reference to child
		c.m2();
	}
}