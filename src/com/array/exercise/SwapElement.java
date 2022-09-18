package com.array.exercise;

import java.util.Arrays;
import java.util.Scanner;

//Swap Element From Given Array
public class SwapElement {

	public static void main(String[] args) {

		swapElement();

	}

	public static void swapElement() {
		Scanner sc = new Scanner(System.in);
		int[] a = { 10, 20, 30, 40, 50 };
		System.out.println(Arrays.toString(a));
		System.out.println("Enter any 2 index which you want to swap ");
		int num = sc.nextInt();
		int num1 = sc.nextInt();
		if (num >= 0 && num < a.length && num1 >= 0 && num1 < a.length) {
			a[num] = a[num] + a[num1];
			a[num1] = a[num] - a[num1];
			a[num] = a[num] - a[num1];
			System.out.println(Arrays.toString(a));

		} else {
			System.out.println("Index is Not Present in Array");
		}
	}

}
