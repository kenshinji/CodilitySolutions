package com.kenshinji.Lesson4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrogRiverOneTest {
	private final int[] testArray = new int[]{1,3,1,4,2,3,5,4};
	
	@Test
	public void test() {
		assertEquals(6, FrogRiverOne.solution(5, testArray));
	}

}
