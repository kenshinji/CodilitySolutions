
package com.kenshinji.Lesson3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FrogJmpTest {

    @Test
    public void test() {
        int X = 10, Y = 85, D = 30;
        assertEquals(3, FrogJmp.solution(X, Y, D));
    }

}
