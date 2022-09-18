package com.array.exercise;

import java.util.Arrays;
//Swaping of Two Array
public class SwapTwoArray {

	public static void main(String[] args) {

		swapArray();
	}

	public static void swapArray() {
		int[] a = { 10, 20, 30, 40, 50 };
		int[] b = { 60, 70, 80, 90, 100 };
		if (a != null && b != null) {
			System.out.println("Array A is =>" + Arrays.toString(a));
			System.out.println("Array B is =>" + Arrays.toString(b));
			if (a.length == b.length) {
				for (int i = 0; i < a.length; i++) {
					a[i] = a[i] + b[i];
					b[i] = a[i] - b[i];
					a[i] = a[i] - b[i];
				}
				System.out.println("After Swaping");
				System.out.println("Array A is =>" + Arrays.toString(a));
				System.out.println("Array B is =>" + Arrays.toString(b));

			} else
				System.out.println("Length of both Array is Not Equal");

		} else
			System.out.println("Given Arrays is Null");
	}

}
