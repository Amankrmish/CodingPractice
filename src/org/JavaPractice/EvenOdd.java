package org.JavaPractice;

public class EvenOdd {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        // Initialize the pointer for even elements
        int evenIndex = 0;

        // Initialize the pointer for odd elements
        int oddIndex = 1;

        // Traverse the array from left to right
        for (int i = 0; i < array.length; i++) {

            // If the element is at an even index, then
            // swap it with the element at the odd index
            if (i % 2 == 0) {

                // Swap the elements
                int temp = array[evenIndex];
                array[evenIndex] = array[oddIndex];
                array[oddIndex] = temp;

                // Increment the even and odd indexes
                evenIndex += 2;
                oddIndex += 2;
            }
        }

        // Print the rearranged array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
