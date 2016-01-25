package com.kenshinji.Lesson6;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DominatorTest {
    private final int[] testArray = { 3, 4, 3, 2, 3, -1, 3, 3 };
    @Test
    public void test() {
        assertTrue(Dominator.solution(testArray) == 0
                   || Dominator.solution(testArray) == 2
                   || Dominator.solution(testArray) == 4
                   || Dominator.solution(testArray) == 6
                   || Dominator.solution(testArray) == 7);
    }

}
