package com.digitak.MathOperations;

import org.junit.Assert;
import org.junit.Test;

public class MathOperationsTest {

	
	@Test
	public void addNumbersWithReturnTypeAndAcceptParametersTest(){
		MathOperations mo = new MathOperations ();
		int actualResult = mo.addNumbersWithReturnTypeAndAcceptParameters(12, 20);
		Assert.assertEquals(32, actualResult);
		
	}
	@Test
	public void subtractNumbersTest(){
		MathOperations mo = new MathOperations ();
		int actualResult = mo.subtractNumbers(22, 11);
		Assert.assertEquals(11, actualResult);
	}
	@Test
	public void isEvenNumber1(){
		MathOperations mo = new MathOperations ();
		boolean actualResult = mo.isEvenNumber(25);
		Assert.assertFalse(actualResult);
	}
	@Test
	public void isEvenNumber2(){
		MathOperations mo = new MathOperations ();
		boolean actualResult = mo.isEvenNumber(24);
		Assert.assertTrue(actualResult);
	}
	@Test
	public void addNumbersWithReturnType(){
		MathOperations mo = new MathOperations ();
		int actualResult = mo.addNumbersWithReturnType(2,4);
		Assert.assertEquals(6, actualResult);
	
	}
	@Test
	public void divideNumber(){
		MathOperations mo = new MathOperations ();
	 int actualResult = mo.divideNumber(4,2);
		Assert.assertEquals(2, actualResult);
		
	
	}
	/*@Test (expected=ArithmeticException.class)
	public void divideNumberWithZero(){
		MathOperations mo = new MathOperations ();
	 int actualResult = mo.divideNumber(4,0);
	 
	}*/
	@Test
	public void divideNumber1(){
		MathOperations mo = new MathOperations();
	 double actualResult = mo.divideNumber1(5,2);
		Assert.assertEquals(2.5, actualResult,0);
	}
}
