package com.digitek.mathoperations;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

@RunWith(Parameterized.class)
public class MathParametrizedTests {

	@Parameter(0)
	public int expected;
	@Parameter(1)
	public int firstNumber;
	@Parameter(2)
	public int secondNumber;

	
	@parameters
	public static Collection<Integer[]> valus(){
		Integer[][]params = new Integer[][]{{3,1,2},{5,2,3}};
		return Arrays.asList(params);
	}
	@Test
	public void addNumbersWithReturnTypeAndAcceptParametersTest(){
		MathOperations mo = new MathOperations ();
		int actualResult = mo.addNumbersWithReturnTypeAndAcceptParameters(firstNumber,secondNumber);
		Assert.assertEquals(expected, actualResult);
		
	}
}
