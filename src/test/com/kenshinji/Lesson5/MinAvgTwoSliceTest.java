
package com.kenshinji.Lesson5;

import com.kenshinji.Lesson3.MinAvgTwoSlice;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
