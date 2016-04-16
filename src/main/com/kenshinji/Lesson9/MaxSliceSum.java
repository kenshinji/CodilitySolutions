package com.kenshinji.Lesson9;


public class MaxSliceSum {
    public static int solution(int[] A) {
        // write your code in Java SE 8
		int maxsum = A[0];
		int cursum = A[0];

		for(int i=1;i<A.length;i++){
    			cursum += A[i];
    			cursum = Math.max(A[i], cursum);
    			maxsum = Math.max(cursum,maxsum);
    		}
    		return maxsum;
    }
}
