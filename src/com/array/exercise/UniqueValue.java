package com.array.exercise;

import java.util.Arrays;

//Only unique value remove all duplicate
public class UniqueValue {

	public static void main(String[] args) {

		int[] a = { 10, 10, 20, -9, -34, 20, 30, 40, 20, 40, 40 };
		int t = 0;
		int count = 0;
		int m = 0;
		System.out.println("Before Removing Duplicate ==> " + Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					t = a[i];
					for (int k = 0; k < a.length; k++) {
						if (t == a[k])
							a[k] = 0;
					}
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0)
				count++;
		}
		int unique[] = new int[count];
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				unique[m] = a[i];
				m++;
			}
		}
		System.out.println("Only Unique Value is ==> " + Arrays.toString(unique));
	}

}
