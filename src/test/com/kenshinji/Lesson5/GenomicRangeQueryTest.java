package com.kenshinji.Lesson5;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class GenomicRangeQueryTest {
	private String DNSSequence = "CAGCCTA";
	int[] P = { 2, 5, 0 };
	int[] Q = { 4, 5, 6 };

	@Test
	public void test() {
		assertArrayEquals(new int[]{2,4,1}, GenomicRangeQuery.solution(DNSSequence, P, Q));
	}
}
