package com.kenshinji.Lesson3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TapeEquilibriumTest {
	private int[] testArray = {3,1,2,4,3};
	@Test
	public void test() {
		assertEquals(1, TapeEquilibrium.solution(testArray));
	}

}
