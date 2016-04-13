package com.kenshinji.Lesson9;

/**
 * Created by kenshinji on 4/13/16.
 */
public class MaxProfit {

    public static int solution(int[] A) {
        if (A.length == 0 || A.length == 1) {
            return 0;
        }

        int min_price = A[0];
        int max_ending_here, max_profit = 0;
        for(int i = 1;i<A.length;i++) {
            max_ending_here = Math.max(0, A[i] - min_price);
            min_price = Math.min(min_price, A[i]);
            max_profit = Math.max(max_profit, max_ending_here);

        }
        return max_profit;
    }
}
