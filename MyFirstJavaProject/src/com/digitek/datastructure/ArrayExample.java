package com.digitek.datastructure;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intArray();
		 printFromStringAreay();
		 populateArray();
	}

public static void intArray() {
		
		int no1 = 5;
		int no2 = 10;
		//System.out.println("value of no1:" + no1);
		
		int[]listOfNumbers = {5,10,15,20,25};
		//System.out.println("no of elements in array"+ listOfNumbers.length);
		
		
		for (int counter=0; counter<listOfNumbers.length;counter = counter+2){
			System.out.println("counter:" + counter);
	}
			
		for (int counter=0; counter<listOfNumbers.length;counter++){
			System.out.println("list of number on array:" + listOfNumbers [counter]);
		}
			
			/*
		System.out.println("1st element in the array:" + listOfNumbers[0]);
		System.out.println("2nd element in the array:" + listOfNumbers[1]);
		System.out.println("3rd element in the array:" + listOfNumbers[2]);
		System.out.println("4th element in the array:" + listOfNumbers[3]);
		System.out.println("5th element in the array:" + listOfNumbers[4]);*/
}
	
	public static void printFromStringAreay(){
		
		String[] months ={"Jan","Feb","Mar","Apr","May"};
		
		for (int counter=0; counter<months.length;counter++){
			System.out.println(" months on array:" + months [counter]);
			}	
	}
	public static void populateArray() {
		
		String[] months = new String[5];
		
		for (int counter=0; counter<months.length;counter++){
			System.out.println(" months on array:" + months [counter]);
			System.out.println("counter loop number:" + counter);
			}
	
	
	
	// adding values to the array
		for (int counter=0; counter<months.length;counter++){
		months[counter] = "Added value"+ counter;
		System.out.println(" months on array:" + months [counter]);
		System.out.println("counter loop number:" + counter);
	}

	}
}


