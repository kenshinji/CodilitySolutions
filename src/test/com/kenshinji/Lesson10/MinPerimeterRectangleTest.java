
package com.kenshinji.Lesson10;

import com.kenshinji.Lesson8.MinPerimeterRectangle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MinPerimeterRectangleTest {

    @Test
    public void test() {
        assertEquals(22, MinPerimeterRectangle.solution(30));
    }

}
