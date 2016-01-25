package com.kenshinji.Lesson5;

import com.kenshinji.Lesson3.PassingCars;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassingCarsTest {
	private int[] testArray = {0,1,0,1,1};
	@Test
	public void test() {
		assertEquals(5, PassingCars.solution(testArray));
	}

}
