package org.JavaPractice;
import java.util.Arrays;

public class Shorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int temp = 0;
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}

		}
		System.out.println(Arrays.binarySearch(arr, 90));
		System.out.println(Arrays.toString(arr));
	}

}
