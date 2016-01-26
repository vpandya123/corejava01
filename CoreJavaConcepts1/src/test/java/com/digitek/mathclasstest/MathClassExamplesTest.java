package com.digitek.mathclasstest;

import org.junit.Assert;
import org.junit.Test;

import com.digitek.mathclass.mathClassExamples;
import com.digitek.mathoperators.mathOperatorsExamples;



public class MathClassExamplesTest {

	
	
	@Test
	public void squareRoot(){
		
		mathClassExamples me = new mathClassExamples();
		
		double result = me.squareRoot(25);
		
		Assert.assertEquals(5, result,0);	
	
	
	}
	
	

	@Test
	public void findMaxNumber(){
		
		mathClassExamples me = new mathClassExamples();
		
		double result = me.findMaxNumber(20.5, 25.2);
		
		Assert.assertEquals(25.2, result,0);
		
	}
@Test
	
	public void addition(){
		
		mathOperatorsExamples mos = new mathOperatorsExamples();
		
		int result = mos.addition(25, 25);
		
		Assert.assertEquals(50, result);	
		
	}
}

