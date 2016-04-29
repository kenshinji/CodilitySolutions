package com.kenshinji.Lesson12;

/**
 * Created by kenshinji on 4/29/16.
 */
public class ChocolatesByNumbers {

    public static int solution(int N, int M) {
        return N / gcd(N,M);
    }

    private static int gcd(int N, int M) {
        if (N < M) {
            int temp = N;
            N = M;
            M = temp;
        }

        if (N % M == 0) {
            return M;
        } else {
            return gcd(M, N % M);
        }

    }
}
