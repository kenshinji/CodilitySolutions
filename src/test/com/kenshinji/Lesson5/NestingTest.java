/*
 * @(#)NestingTest.java 1.0 2015年8月7日
 *
 * Copyright 2015 Hewlett-Packard, Inc. All rights reserved.
 * HP PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.kenshinji.Lesson5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * 
 * 
 * @author Fred Wang 下午4:51:13
 * @since HPDM 4.7
 */
public class NestingTest {
    private final String testString1 = "(()(())())";
    private final String testString2 = "())";
    @Test
    public void test() {
        assertEquals(1, Nesting.solution(testString1));
        assertEquals(0, Nesting.solution(testString2));
    }

}
