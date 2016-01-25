
package com.kenshinji.Lesson6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MaxProductOfThreeTest {

    private final int[] testArray = { -3, 1, 2, -2, 5, 6 };
    @Test
    public void test() {
        assertEquals(60, MaxProductOfThree.solution(testArray));
    }

}
