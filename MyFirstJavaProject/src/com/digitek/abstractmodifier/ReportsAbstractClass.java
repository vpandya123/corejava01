package com.digitek.abstractmodifier;

public abstract class ReportsAbstractClass {

	public void generateHeader(){
		System.out.println("******Header*****");		
		
	}
	public void putLogo(){
		System.out.println("******Logo*****");
		
	}
	public abstract void generateBody();
	
	
	
	public void generateFooter(){
		System.out.println("******Footer*****");
		
	}
	
	
}

