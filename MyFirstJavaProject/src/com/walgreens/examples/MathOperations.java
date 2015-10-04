package com.walgreens.examples;

public class MathOperations {

	public static void main(String[] args) {
		addition();
		subtraction();
		multiplicationn();
	}

	

	public static void addition() {
		// Syntax: datetype variable = value;
		// datatype ex: int, double
		int number1 = 10;
		int number2 = 200;
		int result = (number1 + number2);
		System.out.println("result***"+ result);
	}
	
	
	public static void subtraction(){
		int number1 = 10;
		int number2 = 20;
		int result = number1 - number2;
		System.out.println("result***"+ result);
		
	}
	public static void multiplicationn(){
		int number1 = 10;
		int number2 = 20;
		int result = number1 * number2;
		System.out.println("result***"+ result);
	}
}

