package com.kenshinji.Lesson11;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


/**
 * Created by kenshinji on 5/4/16.
 */
public class CountSemiprimesTest {
    private int[] P = {1, 4, 16};
    private int[] Q = {26, 10, 20};

    @Test
    public void test() {
        assertArrayEquals(new int[]{10, 4, 0}, CountSemiprimes.solution(26, P, Q));
    }
}