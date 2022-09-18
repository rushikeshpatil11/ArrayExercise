package com.array.exercise;

import java.util.Arrays;

//Sorting Given Array By Descending Order
public class SortingDescending {

	public static void main(String[] args) {

		sortingDescendingOrder();
	}

	public static void sortingDescendingOrder() {
		int[] a = { 40, 20, 30, 10, 50 };
		int count;
		System.out.println("Array Before Sorting ==> " + Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[i] < a[j]) {
					count = a[i];
					a[i] = a[j];
					a[j] = count;
				}

			}
		}
		System.out.println("Array After Sorting Descending Order  ==> " + Arrays.toString(a));
	}

}
