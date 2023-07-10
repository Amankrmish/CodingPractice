package org.JavaPractice;
import java.util.Arrays;

public class Largest {
    public static void main(String[] args) {
        int[] a = { 10, 4, 3, 50, 23, 90 };
        int first, second, third;
        Arrays.sort(a);
        first = a[a.length - 1];
        second = a[a.length - 2];
        third = a[a.length - 3];
        System.out.println("Largest number : " + first + " Second Largest : " + second + " Third largest" + third);
    }

}
