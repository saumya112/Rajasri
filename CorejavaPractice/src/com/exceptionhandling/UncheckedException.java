package com.exceptionhandling;

public class UncheckedException {

	public static void main(String[] args) {
		System.out.println("saumaya");
		
		//System.out.println(10/0); //ArithmeticException
		
		/*int[] a = {10,20,30};
		System.out.println(a[5]); // ArrayIndexOutOfBoundsException */
		
		String s = "saumya";
		//System.out.println(s.charAt(9));// StringIndexOutOfBoundsException
		
		Integer i = Integer.valueOf(10); //program will execute
		Integer i1 = Integer.valueOf("ten"); ////NumberFormatException
		
		System.out.println(i); 

	}

}
