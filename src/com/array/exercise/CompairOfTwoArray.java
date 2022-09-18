package com.array.exercise;

import java.util.Arrays;
//Compair of Two Array
public class CompairOfTwoArray {

	public static void main(String[] args) {

		compairTwoArray();

	}

	public static void compairTwoArray() {
		int[] a = { 10, 20, 30, 40, 50 };
		int[] b = { 10, 20, 30, 40, 50 };
		int count = 0;

		if (a != null && b != null) {

			if (a.length == b.length) {

				for (int i = 0; i < a.length; i++) {
					if (a[i] != b[i])
						count++;
				}
				System.out.println(Arrays.toString(a));
				System.out.println(Arrays.toString(b));
				if (count == 0)
					System.out.println("Both Array are Exact Match");
				else
					System.out.println("Both Array are Not Exact Match");

			} else
				System.out.println("Length of both Array is not equal");

		} else
			System.out.println("Array is null");

	}

}
