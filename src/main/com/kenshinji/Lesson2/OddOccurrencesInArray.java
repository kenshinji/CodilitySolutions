package com.kenshinji.Lesson2;

/**
 * Created by kenshinji on 4/10/16.
 */
public class OddOccurrencesInArray {
    public static int solution(int[] A) {
        // write your code in Java SE 8
        int result = 0;
        for (int i:A) {
            result ^= i;
        }
        return result;
    }
}
