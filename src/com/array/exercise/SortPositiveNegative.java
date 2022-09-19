package com.array.exercise;

import java.util.Arrays;

//Sort Positive and Negative Element
public class SortPositiveNegative {

	public static void main(String[] args) {

		sortPositiveNegative();
	}

	public static void sortPositiveNegative() {
		int[] a = { 10, -20, 30, 0, -40, -50 };
		int[] pos = new int[a.length];
		int[] neg = new int[a.length];
		int p = 0;
		int n = 0;
		System.out.println("Original Array ==>" + Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 0) {
				pos[p] = a[i];
				p++;
			} else {
				neg[n] = a[i];
				n++;
			}
		}
		int[] positive = new int[p];
		int[] negative = new int[n];
		for (int i = 0; i < positive.length; i++)
			positive[i] = pos[i];
		for (int i = 0; i < negative.length; i++)
			negative[i] = neg[i];
		System.out.println("Positive Array ==>" + Arrays.toString(positive));
		System.out.println("Negative Array ==>" + Arrays.toString(negative));
	}

}
