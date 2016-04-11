package com.kenshinji.Lesson2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by kenshinji on 4/10/16.
 */
public class OddOccurrencesInArrayTest {
    private int[] test_array = {9, 3, 9, 3, 9, 7, 9};

    @Test
    public void test() {
        assertEquals(7, OddOccurrencesInArray.solution(test_array));
    }

}