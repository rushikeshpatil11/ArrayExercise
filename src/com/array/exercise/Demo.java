package com.array.exercise;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		
		 int [] b= {20,10,30,40,50};
		 int [] c=Arrays.copyOf(b,3);
		 System.out.println(Arrays.toString(c));
	}

}
