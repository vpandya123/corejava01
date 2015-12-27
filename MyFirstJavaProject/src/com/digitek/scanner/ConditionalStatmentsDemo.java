package com.digitek.scanner;

public class ConditionalStatmentsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		switchStatement();
		ifStatmentsExample();
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
}
