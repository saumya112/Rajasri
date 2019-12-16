package com.exceptionhandling;

public class Test {
   // WITH OUT TRY AND CATCH BLOCK
	/*public static void main(String[] args) {
		System.out.println("saumya");
		System.out.println(10/0);
		System.out.println("saumya");

	}*/
	
	/*saumya
	Exception in thread "main" java.lang.ArithmeticException: / by zero
		at com.exceptionhandling.Test.main(Test.java:7)*/

/*public static void main(String[] args) {
	try {
		
		System.out.println(10/0);
	}//catch(ArithmeticException ex) 
	catch(NullPointerException ex) { //No exception in try : catch block not checked
		
		System.out.println("saumya");
		
	}*/ //out put:- 
	          /*Exception in thread "main" java.lang.ArithmeticException: / by zero
	             at com.exceptionhandling.Test.main(Test.java:19)*/
	
// try with out catch block	
 public static void main(String[] args) {
	 try {
		 System.out.println("saumya"); 
	 }
	 System.out.println("saumya");
 }
	
}

}
