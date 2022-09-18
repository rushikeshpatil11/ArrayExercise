package com.array.exercise;

import java.util.Arrays;
import java.util.Scanner;

// Find (X) Highest Element From Given Array
public class XHighest {

	public static void main(String[] args) {

		findXHighest();
	}

	public static void findXHighest() {
		Scanner sc = new Scanner(System.in);

		int[] a = { 23, 64, 11, 78, 90 };
		int count;
		System.out.println("Enter Which Highest Number you want ==> ");
		int index = sc.nextInt();
		if (index >= 0 && index < a.length) {

			for (int i = 0; i < a.length; i++) {
				for (int j = i; j < a.length; j++) {
					if (a[i] > a[j]) {
						count = a[i];
						a[i] = a[j];
						a[j] = count;
					}
				}

			}
			System.out.println(Arrays.toString(a));
			System.out.println(index + " Highest Element is ==> " + a[a.length - index]);

		} else
			System.out.println(index + " Index not Present in Array");
	}

}
