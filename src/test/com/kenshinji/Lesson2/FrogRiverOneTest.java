package com.kenshinji.Lesson2;

import static org.junit.Assert.*;

import org.junit.Test;

public class FrogRiverOneTest {
	private final int[] testArray = new int[]{1,3,1,4,2,3,5,4};
	
	@Test
	public void test() {
		assertEquals(6, FrogRiverOne.solution(5, testArray));
	}

}
