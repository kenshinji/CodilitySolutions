
package com.kenshinji.Lesson5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class NestingTest {
    private final String testString1 = "(()(())())";
    private final String testString2 = "())";
    @Test
    public void test() {
        assertEquals(1, Nesting.solution(testString1));
        assertEquals(0, Nesting.solution(testString2));
    }

}
