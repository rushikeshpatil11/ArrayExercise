package com.array.exercise;

import java.util.Arrays;
//Concat of Two Array in One Array
public class ConcatOfTwoArray {

	public static void main(String[] args) {

		concatOfTwoArray();
	}

	public static void concatOfTwoArray() {
		int[] a = { 10, 20, 30, 40, 50 };
		int[] b = { 60, 70, 80, 90, 100 };
		int[] c = new int[a.length + b.length];
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			c[j] = a[i];
			j++;
		}
		for (int i = 0; i < b.length; i++) {
			c[j] = b[i];
			j++;
		}
		System.out.println("Array 1st is => " + Arrays.toString(a));
		System.out.println("Array 2nd is => " + Arrays.toString(b));
		System.out.println("Concat of Two Array is => " + Arrays.toString(c));
	}

}
