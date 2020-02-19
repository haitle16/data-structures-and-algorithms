package java401challenges.quickSort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class QuickSortTest {

    QuickSort quickSort = new QuickSort();

    @Test
    public void quickSortTest() {
        int[] arr = new int[]{8, 4, 23, 42, 16, 15};
        quickSort.quickSort(arr, 0, 5);
        assertArrayEquals(new int[]{4, 8, 15, 16, 23, 42}, arr);
    }

    @Test
    public void quickSortEmptyTest() {
        int[] arr = new int[]{};
        quickSort.quickSort(arr, 0, 0);
        assertArrayEquals(new int[]{}, arr);
    }


}