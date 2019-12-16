package com.exceptionhandling;

public class Error {

	public static void main(String[] args) {
		int[] a = {10000000000}; /*java.lang.Error: Unresolved compilation problem: 
		                             The literal 100000000000 of type int is out of range*/ 
		System.out.println(a);

	}

}
