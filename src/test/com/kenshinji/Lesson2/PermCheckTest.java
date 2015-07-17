package com.kenshinji.Lesson2;

import static org.junit.Assert.*;

import org.junit.Test;

public class PermCheckTest {
	private final int[] test = new int[]{4,1,3,2};
	@Test
	public void test() {
		assertEquals(1, PermCheck.solution(test));
	}

}
