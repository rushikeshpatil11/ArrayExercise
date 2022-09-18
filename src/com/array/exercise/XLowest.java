package com.array.exercise;

import java.util.Arrays;
import java.util.Scanner;

//Find (X) Lowest Element From Given Array
public class XLowest {

	public static void main(String[] args) {

		findLowest();
		
	}

	public static void findLowest() {
		Scanner sc=new Scanner(System.in);
		int[] a= {23,65,19,78,69};
		int count;
		System.out.println("Enter Which Lowest Number you want ==> ");
		int index=sc.nextInt();
		if(index>=0 && index<a.length) {
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				if(a[i]<a[j]) {
					count=a[i];
					a[i]=a[j];
					a[j]=count;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(index + " Lowest Element Present in Array is ==> "+a[a.length-index]);
		}
		else
			System.out.println(index+ " Index is Not Present In Array");
	}

}
