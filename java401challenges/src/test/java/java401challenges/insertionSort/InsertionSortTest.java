package java401challenges.insertionSort;

import org.junit.Before;
import org.junit.Test;


import java.util.Arrays;

import static org.junit.Assert.*;

public class InsertionSortTest {

    InsertionSort insertionSort = new InsertionSort();


    @Before
    public void setUp() {
        int[] arr = new int[] {8,4,42,23,16,15};
        insertionSort = new InsertionSort();
    }

    @Test
    public void insertionSortTest() {
        int[] arr = new int[] {8,4,42,23,16,15};
        assertArrayEquals(new int[]{4,8,15,16,23,42}, insertionSort.insertionSort(arr));
    }

}