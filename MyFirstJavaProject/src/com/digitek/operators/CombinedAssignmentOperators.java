package com.digitek.operators;

public class CombinedAssignmentOperators {

	public static void main(String[] args) {
		combinedOperatore1();
		combinedOperatore2();
		combinedOperatore3();
		combinedOperatore4();
		combinedOperatore5();

	}

	public static void combinedOperatore1(){
		
		int x = 10;
		x +=5; ///x=x+5
		System.out.println("combinedOperator1 - value of x :" +x);
	}
	public static void combinedOperatore2(){
		
		int x = 10;
		x -=5; ///x=x-5
		System.out.println("combinedOperator2 - value of x :" +x);
	}
	
	public static void combinedOperatore3(){
		
		int x = 10;
		x *=5; ///x=x*5
		System.out.println("combinedOperator3 - value of x :" +x);
	}
	public static void combinedOperatore4(){
		
		int x = 10;
		x /=5; ///x=x/5
		System.out.println("combinedOperator4 - value of x :" +x);
	}
public static void combinedOperatore5(){
		
		int x = 11;
		x %=5; ///x=x%5
		System.out.println("combinedOperator5 - value of x :" +x);
	}
}
