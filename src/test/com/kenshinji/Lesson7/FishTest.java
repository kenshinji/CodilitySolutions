package com.kenshinji.Lesson7;

import com.kenshinji.Lesson5.Fish;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FishTest {
	private int[] A = {4,3,2,1,5};
	private int[] B = {0,1,0,0,0};
	@Test
	public void test() {
		assertEquals(2, Fish.solution(A, B));
	}

}
