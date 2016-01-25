
package com.kenshinji.Lesson5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class BracketsTest {
    private final String emptyString = "";
    private final String testString1 = "{[()()]}";
    private final String testString2 = "([)()]";

    @Test
    public void test() {
        assertEquals(1, Brackets.solution(emptyString));
        assertEquals(1, Brackets.solution(testString1));
        assertEquals(0, Brackets.solution(testString2));
    }

}
