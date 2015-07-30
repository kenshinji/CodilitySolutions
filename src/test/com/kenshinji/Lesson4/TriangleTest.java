package com.kenshinji.Lesson4;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {
	private int[] testArray1 = {10,2,5,1,8,20};	
	private int[] testArray2 = {10,50,5,1};
	@Test
	public void test() {
		assertEquals(1, Triangle.solution(testArray1));
		assertEquals(0, Triangle.solution(testArray2));
	}

}
