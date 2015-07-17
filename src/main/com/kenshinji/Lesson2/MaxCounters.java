package com.kenshinji.Lesson2;

import java.util.Arrays;

public class MaxCounters {
	private static int[] operations= new int[]{3,4,4,6,1,4,4};
	
	public static void main(String[] args){
		System.out.println("result is "+Arrays.toString(solution(5, operations)));
	}
    public static int[] solution(int N, int[] A) {
        // write your code in Java SE 8]
    		
    		int[] result = new int[N];
    		int Max = 0;
    		for(int operation:A){
    			if(operation>=1&&operation<=N){
    				result[operation-1]++;
    				if(result[operation-1]>Max)Max = result[operation-1];
    			}else if(operation == N + 1){
    				Arrays.fill(result, Max);
    			}
    		}
    		return result;
    		
    }
}
