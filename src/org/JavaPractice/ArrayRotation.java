package org.JavaPractice;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = { 1, 2, 0, 4, 3, 0, 5, 0 };
        int k = sc.nextInt();

        int n = a.length;
        int temp[] = new int[n];
        int c = 0;
        for (int i = k; i < n; i++) {
            temp[c] = a[i];
            c++;
        }
        for (int i = 0; i < k; i++) {
            temp[c] = a[i];
            c++;
        }
        for (int i = 0; i < n; i++) {
            a[i] = temp[i];
        }
        System.out.println(Arrays.toString(a));

    }
}