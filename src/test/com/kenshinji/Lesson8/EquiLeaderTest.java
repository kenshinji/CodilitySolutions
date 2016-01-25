package com.kenshinji.Lesson8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EquiLeaderTest {
	private int[] testArray = {4,3,4,4,4,2};
	@Test
	public void test() {
		assertEquals(2, EquiLeader.solution(testArray));
	}

}
