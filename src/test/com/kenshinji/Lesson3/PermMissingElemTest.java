package com.kenshinji.Lesson1;

import static org.junit.Assert.*;

import org.junit.Test;

public class PermMissingElemTest {
	private int[] testArray = {2,3,1,5};
	@Test
	public void test() {
		assertEquals(4, PermMissingElem.solution(testArray));
	}

}
