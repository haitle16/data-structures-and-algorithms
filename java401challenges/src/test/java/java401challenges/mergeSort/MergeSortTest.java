package java401challenges.mergeSort;

import java401challenges.insertionSort.InsertionSort;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MergeSortTest {

    MergeSort mergeSort = new MergeSort();

    @Test
    public void mergeSortTest() {
        int[] arr = new int[] {8,4,42,23,16,15};
        mergeSort.mergeSort(arr);
        assertArrayEquals(new int[] {4,8,15,16,23,42},arr);
    }

    @Test
    public void merSortEmptyTest() {
        int[] arr = new int[]{};
        mergeSort.mergeSort(arr);
        assertArrayEquals(new int[]{}, arr);
    }


}