package com.kenshinji.Lesson6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DistinctTest {
	private int [] testArray = {2,1,1,2,3,1};
	@Test
	public void test() {
		assertEquals(3, Distinct.solution(testArray));
	}

}
