package com.kenshinji.Lesson12;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by kenshinji on 4/29/16.
 */
public class ChocolatesByNumbersTest {

    @Test
    public void test() {
        assertEquals(5, ChocolatesByNumbers.solution(10,4));
    }
}