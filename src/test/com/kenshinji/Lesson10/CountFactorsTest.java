package com.kenshinji.Lesson10;

import com.kenshinji.Lesson8.CountFactors;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CountFactorsTest {

    @Test
    public void test() {
        assertEquals(8, CountFactors.solution(24));
    }

}
