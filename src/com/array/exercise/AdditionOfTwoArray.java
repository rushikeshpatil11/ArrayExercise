package com.array.exercise;

import java.util.Arrays;
//Addition of Two Array 
public class AdditionOfTwoArray {

	public static void main(String[] args) {

		additionOfTwoArray();
	}

	public static void additionOfTwoArray() {
		int[] a = { 10, 20, 30, 40, 50 };
		int[] b = { 60, 70, 80, 90, 100 };
		int[] add = new int[a.length];

		if (a != null && b != null) {

			if (a.length == b.length) {
				for (int i = 0; i < a.length; i++)
					add[i] = a[i] + b[i];
				System.out.println("Array 1st is => " + Arrays.toString(a));
				System.out.println("Array 2nd is => " + Arrays.toString(b));
				System.out.println("Addition of Two Array is => " + Arrays.toString(add));

			} else
				System.out.println("Length of both array is not equal");
		} else
			System.out.println("Arrays is null");

	}

}
