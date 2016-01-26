package com.digitek.scanner;

import java.util.Scanner;

public class ConditionalStatmentsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		//switchStatement();
		//ifStatmentsExample();
		yourBonusOnSale();
	}

	public static void ifStatmentsExample(){ 
		int marks1 = 44;
		int marks2 = 35;
		int total = marks1 + marks2;
		
		if(total >= 90) 
		{			System.out.println("Grade A, marks: " + total);
			}
		else if(total >= 80 & total < 90) 
		{			System.out.println("Grade B, marks: " + total);
			}
		else if(total >= 70 & total < 80) 
		{			System.out.println("Grade C, marks: " + total);
			}
		else if(total >= 60 & total < 70) 
		{			System.out.println("Grade D, marks: " + total);
			}
		else  
		{			System.out.println("Grade F, marks: " + total);
			}
	}
	public static void switchStatement() {
		
char paymentCard = 'A'; //D, A, M
		
		switch(paymentCard) {
		
				case 'M':
					System.out.println("You have selected mastercard for payment");
					break;
				
				case 'D':
					System.out.println("You have selected discover for payment");
					break;
				
				case 'A':
					System.out.println("You have selected Amex for payment");
					break;
					
				default:
				System.out.println("You have selected default payment - Visa");
			
		}		
	}
	public static void yourBonusOnSale(){
		Scanner scannerObject = new Scanner(System.in);		
		System.out.println("Please enter totalSale");		
		int totalSale = scannerObject.nextInt();	
		
		if( totalSale >= 10000) {			
			
			double bonus = totalSale*.05;
			
			System.out.println("Good JOB YOUR Bonus Is : " + bonus);
			}
		if( totalSale >= 5000 & totalSale <= 9999) {			
			double bonus = totalSale*.03;
			System.out.println("Good JOB YOUR Bonus Is : " + bonus);
			}
		if( totalSale >= 1000 & totalSale <= 4999) {			
			double bonus = totalSale*.01;
			System.out.println("Good JOB YOUR Bonus Is : " + bonus);
			}
		else {		
			
			System.out.println("Sorry you Are Not Qualify For Bonus : " );
			}

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
