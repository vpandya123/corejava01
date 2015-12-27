package com.digitek.accessModifiers.package1;

public class CarUser {

	public static void main(String[] args) {
		// Create an object of the car- using new Car()
		Car carUserObj = new Car();
		//carUserObj.sound();
		carUserObj.drive();
		Car CarObject2= new Car();
		carUserObj.changSpeed();
		System.out.println("enginType "+ carUserObj.enginType);
		//System.out.println("modelName "+ carUserObj.modelName);
	}
}
