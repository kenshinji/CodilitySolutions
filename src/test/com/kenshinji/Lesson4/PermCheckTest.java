package com.kenshinji.Lesson4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PermCheckTest {
	private final int[] test = new int[]{4,1,3,2};
	@Test
	public void test() {
		assertEquals(1, PermCheck.solution(test));
	}

}
