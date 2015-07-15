package com.kenshinji.Lesson2;

import static org.junit.Assert.*;

import org.junit.Test;

public class MissingIntegerTest {
	private final int[] testArray = new int[]{1,3,6,4,1,2};
	@Test
	public void test() {
		assertEquals(5, MissingInteger.solution(testArray));
	}

}
