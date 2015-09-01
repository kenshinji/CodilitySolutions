package com.kenshinji.Lesson7;


public class MaxSliceSum {
    public static int solution(int[] A) {
        // write your code in Java SE 8
    		int maxsum = 0;
    		int cursum = 0;
    		for(int i=0;i<A.length;i++){
    			cursum += A[i];
    			cursum = Math.max(0, cursum);
    			maxsum = Math.max(cursum,maxsum);
    		}
    		return maxsum;
    }
}
