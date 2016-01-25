
package com.kenshinji.Lesson1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class FrogJmpTest {

    @Test
    public void test() {
        int X = 10, Y = 85, D = 30;
        assertEquals(3, FrogJmp.solution(X, Y, D));
    }

}
