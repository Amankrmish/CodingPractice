package org.JavaPractice;
import java.util.Arrays;

public class Second {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int a[] = { 12, 35, 1, 10, 34, 1 };
        Arrays.sort(a);
        int second;
        second = a[a.length - 2];
        System.out.println(Arrays.toString(a));
        System.out.println("Second largest" + second);

    }
}
