package com.kenshinji.Lesson6;

import static org.junit.Assert.*;

import org.junit.Test;

public class EquiLeaderTest {
	private int[] testArray = {4,3,4,4,4,2};
	@Test
	public void test() {
		assertEquals(2, EquiLeader.solution(testArray));
	}

}
