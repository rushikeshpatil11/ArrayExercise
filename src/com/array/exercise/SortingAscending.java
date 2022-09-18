package com.array.exercise;

import java.util.Arrays;

//Sorting Given Array By Ascending Order
public class SortingAscending {

	public static void main(String[] args) {

		sortingAscendingOrder();
	}

	public static void sortingAscendingOrder() {
		int[] a = { 20, 10, 30, 50, 40 };
		System.out.println("Array Before Sorting ==> " + Arrays.toString(a));
		int count;
		for (int i = 0; i < a.length; i++) {

			for (int j = i; j < a.length; j++) {
				if (a[i] > a[j]) {
					count = a[i];
					a[i] = a[j];
					a[j] = count;
				}
			}
		}
		System.out.println("Array After Sorting Ascending Order ==> " + Arrays.toString(a));
	}

}
