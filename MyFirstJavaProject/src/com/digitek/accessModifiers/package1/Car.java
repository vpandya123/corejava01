package com.digitek.accessModifiers.package1;

public class Car {

	//Instance variables.
	private String modelName ="Honda";
	protected String transmission= "Auto";
	
	
	String enginType = "V6";
	//Default constructor.
	public Car(){
		
	}
	
	//Business methods
	private void sound(){
		System.out.println("Car Honks "  + modelName);
	}
	
	public void drive(){
		System.out.println("Car drives  "  +  modelName);
	}
	protected static void changSpeed(){
		System.out.println("Car changSpeed"); 
	}
	public static void main(String[] args) {
		// Create an object of the car- using new Car()
		Car carUserObj = new Car();
		carUserObj.sound();
		carUserObj.name();
		carUserObj.drive();
		carUserObj.changSpeed();
		Car CarObject2= new Car();
		System.out.println("enginType "+ carUserObj.enginType);
		System.out.println("modelName "+ carUserObj.modelName);
	}

	private void name() {
		// TODO Auto-generated method stub
		
	}

	
	
}
