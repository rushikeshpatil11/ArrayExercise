package com.array.exercise;

import java.util.*;

//Adding Element in existing Array
public class AddingElement {

	public static void main(String[] args) {

		addingElementInExistingArray();

	}

	public static void addingElementInExistingArray() {
		Scanner sc = new Scanner(System.in);
		int[] a = { 10, 20, 30, 40, 50 };
		int[] newa = new int[a.length + 1];
		System.out.println(Arrays.toString(a));
		System.out.println("Enter Element which You want to Add into Array => ");
		int element = sc.nextInt();
		System.out.println("Enter Index at which You want to Add => ");
		int index = sc.nextInt();
		for (int i = 0; i < newa.length - 1; i++) {
			newa[i] = a[i];
		}
		for (int i = newa.length - 1; i > index; i--) {
			newa[i] = newa[i - 1];
		}
		newa[index] = element;
		System.out.println("New Array is ==> " + Arrays.toString(newa));
	}

}
