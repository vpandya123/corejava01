package com.digitek.operators;

public class ConditionalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//operatorAnd();
		//operatorOr();
		ternaryOperator();
	}
	
	/*
	 * Conditional Operators aka short circuit operators
	 * AND (&&), OR (||), ternary (?:)
	 */

	public static void operatorAnd(){
		
		int no1 = 10;
		int no2 = 13;
		int no3 = 12;
		
		boolean output = compare1(no1, no2) && compare2(no2, no3);
		System.out.println("operator AND output contains:" + output);
 
	}

	private static boolean compare1(int no1, int no2) {
		System.out.println("compare1()");
		return no1 > no2;
	}
	
	private static boolean compare2(int no1, int no2) {
		System.out.println("compare2()");
		return no1 < no2;
	}
	
	
	public static void operatorOr(){
		
		int no1 = 14;	
		int no2 = 11;
		int no3 = 12;
		boolean output = extracted1(no1, no2) || extracted2(no2, no3);
		System.out.println("operator Or output contains:"+ output);				
		
}

	private static boolean extracted1(int no1, int no2) {
		System.out.println("extracted1()");
		return no1 < no2;
	}
	private static boolean extracted2(int no1, int no2) {
		System.out.println("extracted1()");
		return no1 < no2;
	}
	
	public static void ternaryOperator() {
		
		int no1 = 05;	
		int no2 = 10;
		int smallestValue = (no1 > no2) ? no1 : no2;
		System.out.println("smallest value: "+ smallestValue);
	}
	

}
