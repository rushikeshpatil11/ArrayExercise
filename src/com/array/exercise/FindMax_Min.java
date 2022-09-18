package com.array.exercise;

import java.util.Arrays;

//Finding max and min value of given array
public class FindMax_Min {

	public static void main(String[] args) {

		findingMazMin();
	}

	public static void findingMazMin() {
		int[] a = { 23, 54, 78, 76, 35, 12 };
		int count;
		System.out.println("Array is => " + Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[i] > a[j]) {
					count = a[i];
					a[i] = a[j];
					a[j] = count;
				}
			}

		}
		System.out.println("Maximum Value From Array is => " + a[a.length - 1]);
		System.out.println("Minimum Value From Array is => " + a[0]);
	}

}
