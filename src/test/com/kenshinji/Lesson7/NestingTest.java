
package com.kenshinji.Lesson7;

import com.kenshinji.Lesson5.Nesting;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class NestingTest {
    private final String testString1 = "(()(())())";
    private final String testString2 = "())";
    @Test
    public void test() {
        assertEquals(1, Nesting.solution(testString1));
        assertEquals(0, Nesting.solution(testString2));
    }

}
