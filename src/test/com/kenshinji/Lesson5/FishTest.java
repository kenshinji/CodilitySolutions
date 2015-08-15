package com.kenshinji.Lesson5;

import static org.junit.Assert.*;

import org.junit.Test;

public class FishTest {
	private int[] A = {4,3,2,1,5};
	private int[] B = {0,1,0,0,0};
	@Test
	public void test() {
		assertEquals(2, Fish.solution(A, B));
	}

}
