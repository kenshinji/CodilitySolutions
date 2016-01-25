
package com.kenshinji.Lesson7;

import com.kenshinji.Lesson5.Brackets;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


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
