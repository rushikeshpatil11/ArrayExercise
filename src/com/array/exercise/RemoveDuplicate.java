package com.array.exercise;

import java.util.Arrays;

//Remove Duplicate Element From Given Array
public class RemoveDuplicate {

	public static void main(String[] args) {

		removeDuplicate();
	}

	public static void removeDuplicate() {
		int[] a = { 10, 10, 10, 20, 10, 30, 20, 50, 50, 50 };
		int[] b = new int[a.length];
		System.out.println("Before Removing duplicate ==> " + Arrays.toString(a));
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j])
					count++;
			}
			if (count == 0) {
				b[k] = a[i];
				k++;
			}
		}
		int[] c = new int[k];
		for (int i = 0; i < c.length; i++)
			c[i] = b[i];
		System.out.println("After removing duplicate ==> " + Arrays.toString(c));
	}

}
