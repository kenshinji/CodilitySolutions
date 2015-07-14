package com.kenshinji;


public class PermCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] test = new int[]{4,1,3,2};
		System.out.println(solution(test));
	}

	static int solution(int[] A){
		boolean[] countArray = new boolean[A.length];
		for(int i=0;i<A.length;i++)
		{	
		        if(A[i]-1<A.length)
			countArray[A[i]-1]=true;
		}
		for(int i=0;i<countArray.length;i++)
		{
			if(countArray[i]==false)
				return 0;
		}
		return 1;
	}

}
