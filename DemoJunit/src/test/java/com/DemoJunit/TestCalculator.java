package com.DemoJunit;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class TestCalculator extends TestCase {

	//Calculator c = new Calculator();
	
	CalculatorService service = mock(CalculatorService.class);
	Calculator c= null;
	
	@Before
	public void setUp() {
		c=new Calculator(service);
	}
	@Test
	public void testPerform() {
	
		when(service.add(2, 3)).thenReturn(5);
		assertEquals(10,c.perform(2, 3));
		
	}
}
