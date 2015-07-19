package com.kenshinji.Lesson2;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class MaxCountersTest {
	private static int[] operations = new int[] { 3, 4, 4, 6, 1, 4, 4 };
	@Test
	public void test() {
		assertEquals("[3, 2, 2, 4, 2]", Arrays.toString(MaxCounters.solution(5, operations)).trim());
	}

}
