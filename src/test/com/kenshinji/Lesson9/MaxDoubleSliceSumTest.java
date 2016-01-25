package com.kenshinji.Lesson7;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxDoubleSliceSumTest {
	private int[] testArray = {3,2,6,-1,4,5,-1,2};
	@Test
	public void test() {
		assertEquals(17, MaxDoubleSliceSum.solution(testArray));
	}

}
