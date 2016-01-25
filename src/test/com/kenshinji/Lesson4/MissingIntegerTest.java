package com.kenshinji.Lesson4;

import com.kenshinji.Lesson2.MissingInteger;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MissingIntegerTest {
	private final int[] testArray = new int[]{1,3,6,4,1,2};
	@Test
	public void test() {
		assertEquals(5, MissingInteger.solution(testArray));
	}

}
