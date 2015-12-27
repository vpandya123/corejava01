package com.digitek.loopsStatments;

public class ForLoopDemo {

	public static void main(String[] args) {
		printStringRepeadly();
		printStringRepeadlyTwo();
		
	}
	
	public static void printStringRepeadly(){
		
		for(int counter=0; counter<5;counter++){
			System.out.println("Print masage"+counter);
			
		}
	}	
		public static void printStringRepeadlyTwo(){
			
			for(int counter=0; counter<5;counter= counter+2){
				System.out.println("Print masage"  +  counter);
				
			}	
	}
	
	
	

}
