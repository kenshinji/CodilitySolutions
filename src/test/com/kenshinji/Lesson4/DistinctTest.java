package com.kenshinji.Lesson4;

import static org.junit.Assert.*;

import org.junit.Test;

public class DistinctTest {
	private int [] testArray = {2,1,1,2,3,1};
	@Test
	public void test() {
		assertEquals(3, Distinct.solution(testArray));
	}

}
