package com.programming.practice_program.day6;

public class ArraysExample {

	public static void main(String[] args) {
		
		int[] arr;
		//arr = new int[10];
		
		//or
		arr = new int[]{1, 2, 3, 4};
		//arr[0] = 5;
		System.out.println("First element of an array is " + arr[0]);
		System.out.println("The length of an array is " + arr.length);
		for(int i = 0; i < arr.length; i++){
			System.out.println("" + arr[i]);
		}
		
	}
}

