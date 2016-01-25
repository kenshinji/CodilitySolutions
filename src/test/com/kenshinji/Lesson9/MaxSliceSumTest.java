package com.kenshinji.Lesson9;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxSliceSumTest {
	private int[] testArray = {3,2,-6,4,0};
	@Test
	public void test() {
		assertEquals(5, MaxSliceSum.solution(testArray));
	}

}
