package org.JavaPractice;
import java.util.Arrays;

public class PushZero {
    public static void main(String[] args) {
        int a[]={1, 2, 0, 4, 3, 0, 5, 0};
        int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                a[j]=a[i];
                j++;
            }
        }
        for (int i = j; i < a.length; i++) {
            a[i]=0;
        }
       System.out.println(Arrays.toString(a)); 
    }
}
