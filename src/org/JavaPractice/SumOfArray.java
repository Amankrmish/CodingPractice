package org.JavaPractice;
import java.util.Arrays;

public class SumOfArray {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3};
		int sum=Arrays.stream(array).sum();
		System.out.println(sum);
	}

}
