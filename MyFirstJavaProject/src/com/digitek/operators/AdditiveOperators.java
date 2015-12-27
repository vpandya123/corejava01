package com.digitek.operators;

public class AdditiveOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PostIncrement();
		preIncrement();
		concatenation();
		
	}

	public static void PostIncrement(){
		
		int no1 = 5;
		System.out.println("no before post increment" + no1);
		int no = no1++;
		System.out.println("no before post increment" + no);
		System.out.println("no before post increment" + no1);	
	}
    public static void preIncrement(){
		
		int no1 = 5;
		System.out.println("no before pre increment" + no1);
		int no = ++no1;
		System.out.println("no before pre increment" + no);
			
	}
	
	public static void concatenation() {
		String text = "Hello";
		int number = 10;
		
		String result = text + number ;
		
		System.out.println("result: "+ result);
		
	}	
}
