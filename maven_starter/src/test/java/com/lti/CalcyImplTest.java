package com.lti;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcyImplTest {

	@Test
	public void testAddForSuccess() {
		CalcyImpl target = new CalcyImpl();
		int result =target.add(100, 101);
		assertEquals(201,result);
	//	fail("Not yet implemented");
	}

	@Test(expected=IllegalArgumentException.class)
	public void testAddForException() {
		CalcyImpl target = new CalcyImpl();
		int result =target.add(-100, 10);
		
		//fail("Not yet implemented");
	}

}
