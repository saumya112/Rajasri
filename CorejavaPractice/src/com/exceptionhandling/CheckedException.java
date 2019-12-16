package com.exceptionhandling;

import java.io.*;

public class CheckedException {
	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		System.out.println("saumya");
		Thread.sleep(1000); //InterruptedException
		
		FileInputStream f = new FileInputStream("abc.rs"); //FileNotFoundException
		System.out.println("rest of the exception");
		
	}

}
