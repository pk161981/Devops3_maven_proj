package com.programming.practice_program.day6;

public class AverageExample {

	public static void main(String[] args) {
		int[] arr = new int[]{1, 2, 3, 4, 5, 6};
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		int average = 0;
		average = sum/arr.length;
		System.out.println("Average is " + average);
	}
}
