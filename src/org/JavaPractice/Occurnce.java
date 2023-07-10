package org.JavaPractice;
import java.util.HashMap;
import java.util.Map;

public class Occurnce {
	public static void main(String[] args) {
		int[] A = {1, 2, 3, 2, 1, 3, 1, 4};
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < A.length; i++) {
		    map.put(A[i], map.getOrDefault(A[i], 0) + 1);
		}
		int count = map.getOrDefault(2, 0);
		System.out.println(map);
		System.out.println(count);
	}

}
