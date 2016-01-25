package com.kenshinji.Lesson7;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxSliceSumTest {
	private int[] testArray = {3,2,-6,4,0};
	@Test
	public void test() {
		assertEquals(5, MaxSliceSum.solution(testArray));
	}

}
