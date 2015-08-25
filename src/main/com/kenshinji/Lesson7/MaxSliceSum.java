package com.kenshinji.Lesson7;

/*
 * the reason I write this class is to help me fully understand the Lesson 7's content.
 * 
 */
public class MaxSliceSum {
	private static int[] testArray = {5,-7,3,5,-2,4,-1};
	
	//this is the lowest solution
	public static int getSum(int[] A){
		int result = 0;
		for(int i=0;i<A.length;i++){
			for(int j = i;j<A.length;j++){
				int sum = 0;
				for(int k = i;k <= j;k++){
					sum += A[k];
				}
				result = sum > result?sum:result;
			}
		}
		return result;
	}
	
	//this is a better solution, which leverage the prefix sum method
	public static int getSum2(int[] A){
		int result = 0;
		for(int i=0;i<A.length;i++){
			int sum = 0;
			for(int j = i;j<A.length;j++){
				sum += A[j];
				result = sum>result?sum:result;
			}
		}
		return result;
	}

	
	public static void main(String[] args){
		System.out.println(getSum2(testArray));
	}
}
