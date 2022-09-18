package com.array.exercise;

//Find Missing Element From array (1 to 100)
public class FindMissing {
	public static void main(String[] args) {
		findMissingElementFromArray();

	}

	public static void findMissingElementFromArray() {
		int sumof1to100 = 0;
		int[] a = new int[100];
		for (int i = 0; i < a.length; i++) {
			a[i] = i;
			sumof1to100 = sumof1to100 + i;
		}
		a[89] = 0;
		int sumofarray = 0;
		for (int i = 0; i < a.length; i++) {
			sumofarray = sumofarray + a[i];
		}
		System.out.println(" Sum of 1 to 100        => " + sumof1to100);
		System.out.println(" Sum of Given Array is  => " + sumofarray);
		System.out.println("Missing Element of Given Array is =>" + (sumof1to100 - sumofarray));
	}

}
