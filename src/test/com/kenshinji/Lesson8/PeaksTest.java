package com.kenshinji.Lesson8;

import static org.junit.Assert.*;

import org.junit.Test;

public class PeaksTest {
	private int[] testArray = { 1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2 };

	@Test
	public void test() {
		assertEquals(3, Peaks.solution(testArray));
	}

}
