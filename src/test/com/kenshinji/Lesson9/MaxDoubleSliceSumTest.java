package com.kenshinji.Lesson9;

import com.kenshinji.Lesson7.MaxDoubleSliceSum;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxDoubleSliceSumTest {
	private int[] testArray = {3,2,6,-1,4,5,-1,2};
	@Test
	public void test() {
		assertEquals(17, MaxDoubleSliceSum.solution(testArray));
	}

}
