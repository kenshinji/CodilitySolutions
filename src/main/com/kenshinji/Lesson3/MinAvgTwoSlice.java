
package com.kenshinji.Lesson3;


public class MinAvgTwoSlice {
	// this solution is based on the fact that there must be minimal average slice
	// of length 2 or 3 in all the minimal average slices.
	// we can use the slice of length 4 and 5 to prove it.
	// if there is a slice of length 4 is the minimal average slice, then
	// (a1+a2+a3+a4)/4 <= (a1+a2)/2 -> a3+a4 <= a1+a2
	// (a1+a2+a3+a4)/4 <= (a3+a4)/2 -> a1+a2 <= a3+a4
	// so a1+a2 = a3+a4 -> (a1+a2+a3+a4)/4 = (a1+a2)/2
	// if there is a slice of length 5 is the minimal average slice, then
	// we can use the same method to prove it.
	// it's easy to conclude that (a1+a2+a3+a4+a5)/5 = (a1+a2)/2 = (a3+a4+a5)/3.
	
	// the trick of this solution is convert comparing devision into comparing multiplication， in order to avoiding 
	// the lost of precision.
	public static int solution(int[] A) {
		long min = Long.MAX_VALUE;
		int index = -1;
		for(int i = 0;i<A.length-2;i++){
			if(min > Math.min((A[i]+A[i+1])*3, (A[i]+A[i+1]+A[i+2])*2)){
				min = Math.min((A[i]+A[i+1])*3, (A[i]+A[i+1]+A[i+2])*2);
				index = i;
			}
		}
		if((A[A.length-2]+A[A.length-1])*3<min){
			index = A.length-2;
		}
		return index;
	}
}
