package com.kenshinji.Lesson12;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by kenshinji on 5/3/16.
 */
public class CommonPrimeDivisorsTest {
    private int[] A = {15,10,3};
    private int[] B = {75,30,5};

    @Test
    public void test() {
        assertEquals(1, CommonPrimeDivisors.solution(A,B));
    }


}