package com.array.exercise;

import java.util.Arrays;
import java.util.Scanner;

//Remove Given Element From Array
public class RemoveElement {

	public static void main(String[] args) {

		removeElement();

	}

	public static void removeElement() {
		Scanner sc = new Scanner(System.in);
		int[] a = { 10, 20, 30, 40, 50 };
		int[] b = new int[a.length - 1];
		int j = 0;
		int count = 0;
		System.out.println(Arrays.toString(a));
		System.out.println("Enter Element Which You Want to Remove From Array");
		int num = sc.nextInt();
		for (int i = 0; i < a.length; i++) {
			if (num == a[i])
				count++;
		}
		if (count != 0) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] != num) {
					b[j] = a[i];
					j++;
				}
			}
		} else {
			System.out.println("Given Element not Present in Array => " + num);
		}
		if (count != 0)
			System.out.println("After Removing Given Element==>" + Arrays.toString(b));
	}

}
