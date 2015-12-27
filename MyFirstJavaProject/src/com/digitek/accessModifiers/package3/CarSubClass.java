package com.digitek.accessModifiers.package3;

import com.digitek.accessModifiers.package1.Car;

public class CarSubClass extends Car{

	public static void main(String[] args) {
		Car carUserObj = new Car();
		//carUserObj.sound();
		carUserObj.drive();
		carUserObj.changSpeed();
		Car CarObject2= new Car();
	//	System.out.println("enginType "+ carUserObj.enginType);
		//System.out.println("transmission "+ carUserObj.transmission);
		//System.out.println("modelName "+ carUserObj.modelName);
	}

}
