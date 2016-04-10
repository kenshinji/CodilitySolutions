package com.kenshinji.Lesson2;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 * Created by kenshinji on 4/10/16.
 */
public class CyclicRotationTest {

    private int[] test_rs = {9, 7, 6, 3, 8};
    private int[] test = {3, 8, 9, 7, 6};

    @Test
    public void test() {
        assertTrue(Arrays.equals(test_rs, CyclicRotation.solution(test, 3)));
    }
}