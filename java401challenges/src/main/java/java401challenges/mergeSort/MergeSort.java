package java401challenges.mergeSort;

import java.util.Arrays;

public class MergeSort {
    public static int[] mergeSort(int[] arr) {

        int n = arr.length;

        if(n > 1) {
            int mid = arr.length / 2;
            int[] left = new int[mid];
            int[] right = new int[arr.length - left.length];

            for(int i = 0; i < mid; i++){
                left[i] = arr[i];
                right[i] = arr[i+mid];
            }
            System.out.println(Arrays.toString(left));
            System.out.println(Arrays.toString(right));

        }
        return arr;
    }
}
