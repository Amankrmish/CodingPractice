package org.JavaPractice;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Common {
    public static void main(String args[]) {
        int a[] = { 1, 2, 0, 4, 3, 0, 5, 0 };
        int b[] = { 1, 8, 6 };
        List<Integer> commonElemList = new ArrayList<>();
        HashSet<Object> set = new HashSet<>();
        
        for (int element : a) {
            set.add(element);
        }

        for (int element : b) {
            if (set.contains(element)) {
                commonElemList.add(element);
            }
        }
        System.out.println(commonElemList);
    }
}