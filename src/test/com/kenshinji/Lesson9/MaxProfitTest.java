package com.kenshinji.Lesson9;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by kenshinji on 4/13/16.
 */
public class MaxProfitTest {
    private int[] test_array = {23171, 21011, 21123, 21366, 21013, 21367};

    @Test
    public void test(){
        assertEquals(356, MaxProfit.solution(test_array));
    }
}