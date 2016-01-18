package com.digitek.mathoperations;

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
}
