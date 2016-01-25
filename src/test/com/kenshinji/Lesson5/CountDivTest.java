package com.kenshinji.Lesson5;

import com.kenshinji.Lesson3.CountDiv;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountDivTest {

	@Test
	public void test() {
		assertEquals(3, CountDiv.solution(6,11,2));
	}

}
