package com.digitek.operators;

public class EqualityAndRelationalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		equalityOperator();
		inEqualityOperator();
		gratherThan();
		gratherThanOrEqualTo();
		lessThan();
		lessThanOrEqualTo();
	}
	
	
	
	
	public static void equalityOperator(){
		
		int no1 = 3;
		int no2 = 2;
		boolean output = no1 == no2;
		System.out.println("equalityOperator output contains:"  + output);

		
	}
	public static void inEqualityOperator(){
		
		int no1 = 3;
		int no2 = 2;
		boolean output = no1 != no2;
		System.out.println("inEqualityOperator output contains:"  + output);

		
	}
	public static void gratherThan(){
		
		int no1 = 3;
		int no2 = 2;
		boolean output = no1 > no2;
		System.out.println("gratherThanoutput contains:"  + output);

		
	}
	public static void gratherThanOrEqualTo(){
		
		int no1 = 2;
		int no2 = 2;
		boolean output = no1 >= no2;
		System.out.println("gratherThan or equal to output contains:"  + output);

		
	}
	public static void lessThan(){
		
		int no1 = 2;
		int no2 = 2;
		boolean output = no1 < no2;
		System.out.println("lessThan  contains:"  + output);
 }
 
	public static void lessThanOrEqualTo(){
		
		int no1 = 2;
		int no2 = 2;
		boolean output = no1 <= no2;
		System.out.println("lessThan or equal to output contains:"  + output);
 }
 
}
