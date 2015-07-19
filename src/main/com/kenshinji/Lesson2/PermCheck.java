package com.kenshinji.Lesson2;

public class PermCheck {

	public static int solution(int[] A) {
		boolean[] countArray = new boolean[A.length];
		for (int i = 0; i < A.length; i++) {
			if (A[i] - 1 < A.length)
				countArray[A[i] - 1] = true;
		}
		for (int i = 0; i < countArray.length; i++) {
			if (countArray[i] == false)
				return 0;
		}
		return 1;
	}

}
