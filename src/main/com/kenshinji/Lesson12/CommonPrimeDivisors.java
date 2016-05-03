package com.kenshinji.Lesson12;

/**
 * Created by kenshinji on 5/3/16.
 */
public class CommonPrimeDivisors {

    public static int solution(int[] A, int[] B){
        int result = 0;
        int length = Math.min(A.length, B.length);
        for(int i = 0;i< length;i++) {
            if (hasSamePrimeDivisor(A[i], B[i])) {
                result++;
            }
        }
        return result;
    }

    private static boolean hasSamePrimeDivisor(int x, int y) {
        int gcdVal = gcd(x, y);

        x = removePrimeDivisor(x, gcdVal);
        if(x != 1)
            return false;

        y = removePrimeDivisor(y, gcdVal);
        return y == 1;
    }

    private static int removePrimeDivisor(int x, int y) {
        int gcdVal = 1;
        while (x != 1) {
            gcdVal = gcd(x, y);
            if(gcdVal == 1)
                break;
            x = x / gcdVal;
        }
        return x;
    }

    private static int gcd(int x, int y) {
        if (x % y == 0) {
            return y;
        }else {
            return gcd(y, x % y);
        }
    }
}
