package com.kenshinji.Lesson10;

import com.kenshinji.Lesson8.Peaks;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PeaksTest {
	private int[] testArray = { 1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2 };

	@Test
	public void test() {
		assertEquals(3, Peaks.solution(testArray));
	}

}
