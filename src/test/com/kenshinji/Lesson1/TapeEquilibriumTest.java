package com.kenshinji.Lesson1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TapeEquilibriumTest {
	private int[] testArray = {3,1,2,4,3};
	@Test
	public void test() {
		assertEquals(1, TapeEquilibrium.solution(testArray));
	}

}
