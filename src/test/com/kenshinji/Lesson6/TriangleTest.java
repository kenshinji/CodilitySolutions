package com.kenshinji.Lesson6;

import com.kenshinji.Lesson4.Triangle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {
	private int[] testArray1 = {10,2,5,1,8,20};	
	private int[] testArray2 = {10,50,5,1};
	@Test
	public void test() {
		assertEquals(1, Triangle.solution(testArray1));
		assertEquals(0, Triangle.solution(testArray2));
	}

}
