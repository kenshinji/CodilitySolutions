package com.kenshinji.Lesson3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PermMissingElemTest {
	private int[] testArray = {2,3,1,5};
	@Test
	public void test() {
		assertEquals(4, PermMissingElem.solution(testArray));
	}

}
