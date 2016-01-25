
package com.kenshinji.Lesson6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfDiscIntersectionsTest {
    private final int[] testArray = { 1, 5, 2, 1, 4, 0 };
    @Test
    public void test() {
        assertEquals(11, NumberOfDiscIntersections.solution(testArray));
    }

}
