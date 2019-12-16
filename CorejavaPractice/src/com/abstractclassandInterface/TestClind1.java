package com.abstractclassandInterface;

public class TestClind1 implements Message {

	@Override
	public void gm() {
		System.out.println("good morning");

	}

	@Override
	public void gevn() {
		System.out.println("good evening");

	}

	@Override
	public void gn() {
		System.out.println("good night");

	}

	public static void main(String[] args) {
		TestClind1 t1 = new TestClind1();
		t1.gm();
		t1.gevn();
		t1.gn();
		
	}

}
