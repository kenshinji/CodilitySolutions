
package com.kenshinji.Lesson4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class MaxProductOfThreeTest {

    private final int[] testArray = { -3, 1, 2, -2, 5, 6 };
    @Test
    public void test() {
        assertEquals(60, MaxProductOfThree.solution(testArray));
    }

}
