package com.array.exercise;

import java.util.Arrays;

//Sort Even and Odd Element From Given Array
public class SortEvenOdd {

	public static void main(String[] args) {

		sortEvenOdd();
	}

	public static void sortEvenOdd() {
		int[] a = { 10, 15, 20, 25, 30, -80, -5 };
		int[] e = new int[a.length];
		int[] o = new int[a.length];
		int j = 0;
		int k = 0;
		int sumeven = 0;
		int sumodd = 0;
		System.out.println("Original Array ==> " + Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				sumeven = sumeven + a[i];
				e[j] = a[i];
				j++;
			} else {
				sumodd = sumodd + a[i];
				o[k] = a[i];
				k++;
			}
		}
		int[] even = new int[j];
		int[] odd = new int[k];
		for (int i = 0; i < even.length; i++)
			even[i] = e[i];
		for (int i = 0; i < odd.length; i++)
			odd[i] = o[i];
		System.out.println("Even Number Array ==> " + Arrays.toString(even));
		System.out.println("Even Number Sum ==> " + sumeven);
		System.out.println("Odd Number Array ==> " + Arrays.toString(odd));
		System.out.println("Odd Number sum ==> " + sumodd);
	}

}
