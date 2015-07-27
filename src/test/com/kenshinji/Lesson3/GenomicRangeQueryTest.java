package com.kenshinji.Lesson3;

import static org.junit.Assert.*;

import org.junit.Test;

public class GenomicRangeQueryTest {
	private String DNSSequence = "CAGCCTA";
	int[] P = { 2, 5, 0 };
	int[] Q = { 4, 5, 6 };

	@Test
	public void test() {
		assertArrayEquals(new int[]{2,4,1}, GenomicRangeQuery.solution(DNSSequence, P, Q));
	}
}
