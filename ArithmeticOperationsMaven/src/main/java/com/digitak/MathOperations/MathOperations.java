package com.digitak.MathOperations;

public class MathOperations {

	/*public static void main(String[] args) {
		//int result = addNumbersWithReturnType();
		//int result1=addNumbersWithReturnTypeAndAcceptParameters(20,0);
		//multiplication();
		//divideNumber(6,0);
		//divideNumber1(9,2);
			}*/
	
	
	 public static int addNumbersWithReturnType(int a,int b){
		
		int c= a+b;
		
		System.out.println("addNumbersWithReturnType "+ c);
		return c;
	}
	public static int addNumbersWithReturnTypeAndAcceptParameters(int a,int b){
	
		int c= a+b;
		
		System.out.println("addNumbersWithReturnTypeTypeAndAcceptParameters "+ c);
		
		return c;
	} 
	
	public static int subtractNumbers(int a, int b){
		
		int c =a-b;				
		System.out.println("subtractNumbers "+ c);
		return c;
	}
	
	public static int divideNumber(int numerator,int demoninator){
		
		int result = numerator/demoninator;
		System.out.println("divideNumber "+ result);
		return result;	
	
	}
	public static double divideNumber1(int numerator,double demoninator){
		
		double result = numerator/demoninator;
		System.out.println("divideNumber "+ result);
		return result;	
	
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
