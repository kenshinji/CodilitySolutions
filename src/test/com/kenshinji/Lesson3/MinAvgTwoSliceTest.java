
package com.kenshinji.Lesson3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Fred Wang 上午11:14:33
 */
public class MinAvgTwoSliceTest {
    private final int[] testArray = { 4, 2, 2, 5, 1, 5, 8 };
    @Test
    public void test() {
        assertEquals(1, MinAvgTwoSlice.solution(testArray));
    }

}
