package com.digitek.mathclass;

public class mathClassExamples {

	/*public static void main(String[] args) {
		
		squareRoot(25);
		squareRoot(100);
		findMaxNumber(25.5,22.3);
	}*/
	

	public static double squareRoot(int a){
		
		 double result = Math.sqrt(a);
		 
		 System.out.println("square Root Result "+ result);
		 
		 return result;	
		
		}
	
	public static double findMaxNumber(double a, double b){
		
		double result= Math.max(a, b);
		
		 System.out.println("Find Max Number "+ result);
		
		return result;
		
	}
	
}
