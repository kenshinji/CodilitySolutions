package com.kenshinji.Lesson2;

import java.util.ArrayList;

/**
 * Created by kenshinji on 4/10/16.
 */
public class CyclicRotation {

    public static int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        if (A.length == 0) {
            return new int[]{};
        }
        int shift_count = K % A.length;
        int shift_index = A.length - shift_count;
        int[] rs = new int[A.length];
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = shift_index; i < A.length; i++) {
            result.add(A[i]);
        }
        for (int j = 0; j < shift_index; j++) {
            result.add(A[j]);
        }

        for (int k = 0; k < result.size(); k++) {
            rs[k] = result.get(k);
        }
        return rs;
    }
}
