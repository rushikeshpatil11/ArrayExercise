package com.array.exercise;

import java.util.Arrays;

//Remove Zero Element From Given Array
public class RemoveZero {

	public static void main(String[] args) {

		int[] a = { 10, 0, 30, 0, 40, 0, 20, 0, 0 };
		int[] b = new int[a.length];
		int j = 0;
		System.out.println("Before Removing Zero ==> " + Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				b[j] = a[i];
				j++;
			}
		}
		int[] c = new int[j];
		for (int i = 0; i < c.length; i++)
			c[i] = b[i];
		System.out.println("After Removing Zero ==> " + Arrays.toString(c));
	}

}
