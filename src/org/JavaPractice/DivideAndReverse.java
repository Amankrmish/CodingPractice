package org.JavaPractice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class DivideAndReverse {

  public static ArrayList<Integer> divideAndReverse(ArrayList<Integer> arraylist, int k) {
    // Divide the ArrayList into two parts: the first part till the kth element, and the second part after the kth element.
	  
    ArrayList<Integer> firstPart = new ArrayList<>(arraylist.subList(0, k));
    ArrayList<Integer> secondPart = new ArrayList<>(arraylist.subList(k, arraylist.size()));

    // Reverse the first and second parts.
    Collections.reverse(firstPart);
    Collections.reverse(secondPart);

    // Combine the reversed first and second parts into a new ArrayList.
    ArrayList<Integer> reversedArrayList = new ArrayList<>();
    reversedArrayList.addAll(firstPart);
    reversedArrayList.addAll(secondPart);

    return reversedArrayList;
  }

  public static void main(String[] args) {
    // Create an ArrayList.
    ArrayList<Integer> arraylist = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

    // Divide the ArrayList till the 5th element and reverse it.
    int k = 5;
    ArrayList<Integer> reversedArrayList = divideAndReverse(arraylist, k);

    // Print the reversed ArrayList.
    System.out.println(reversedArrayList);
  }
}
