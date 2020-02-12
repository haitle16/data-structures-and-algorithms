package java401challenges.mergeSort;

import java401challenges.insertionSort.InsertionSort;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    MergeSort mergeSort = new MergeSort();

    @Test
    public void mergeSortTest() {
        int[] arr = new int[] {8,4,42,23,16,15};
//        mergeSort.mergeSort(arr);
        System.out.println(mergeSort.mergeSort(arr));

    }


}