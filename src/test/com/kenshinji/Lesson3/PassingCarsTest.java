package com.kenshinji.Lesson3;

import static org.junit.Assert.*;

import org.junit.Test;

public class PassingCarsTest {
	private int[] testArray = {0,1,0,1,1};
	@Test
	public void test() {
		assertEquals(5, PassingCars.solution(testArray));
	}

}
