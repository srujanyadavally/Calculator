package com.srujan.cal.Calculator;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;


public class CalculatorTest {
	
	@Test
	
	public void twoAndThreeIsFive() throws Exception {
		
		final long result = new Calculator().addFun(2, 3);
		assertThat(result, is(5L));
		

	}

	

}
