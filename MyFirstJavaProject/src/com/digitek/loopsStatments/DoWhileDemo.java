package com.digitek.loopsStatments;

public class DoWhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNameUsingDoWhile();
	}

	
	public static void printNameUsingDoWhile(){
		
	int counter=5;	
		
		do {
			System.out.println("Print masage"  +  counter);
			counter++;
		
	}while (counter<5);
	
	}
}