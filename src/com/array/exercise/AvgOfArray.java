package com.array.exercise;

import java.util.Arrays;

//Calculate Avg of Given Array 
public class AvgOfArray {

	public static void main(String[] args) {

		calculateAvg();

	}

	public static void calculateAvg() {
		int[] a = { 10, 20, 30, 40, 50 };
		int sum = 0;

		for (int i = 0; i < a.length; i++) {

			sum = sum + a[i];
		}
		double avg = sum / a.length;
		System.out.println(Arrays.toString(a));
		System.out.println("Sum of Given Array is => " + sum);
		System.out.println("Avg. of Given Array is => " + avg);
	}

}
