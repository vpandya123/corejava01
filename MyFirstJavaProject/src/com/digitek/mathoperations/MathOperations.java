package com.digitek.mathoperations;

public class MathOperations {

	public static void main(String[] args) {
		//int result = addNumbersWithReturnType();
		int result1=addNumbersWithReturnTypeAndAcceptParameters(20,0);
		multiplication();
	}

	
	public static int addNumbersWithReturnType(){
		int a =15;
		int b =20; 
		
		int c= a+b;
		
		System.out.println("addNumbersWithReturnType "+ c);
		return c;
	}
	public static int addNumbersWithReturnTypeAndAcceptParameters(int a,int b){
	
		int c= a+b;
		
		System.out.println("addNumbersWithReturnTypeTypeAndAcceptParameters "+ c);
		
		return c;
	}
	
	public static void multiplication(){
		int result = 10* addNumbersWithReturnType();
		
		int result1 = 10*	result;
		System.out.println("addNumbersWithReturnType "+ result);
	}
	
	public static int subtractNumbers(int a, int b){
		
		int c =a-b;				
		System.out.println("subtractNumbers "+ c);
		return c;
	}
	
	public static boolean isEvenNumber(int number){
		
		boolean result =false;
		
		if(number%2==0){
			result =true;
			System.out.println("Even Number");			
		}
		else {
			System.out.println("odd Number");
		}
		
		return result;
	}
	
	
	
}
