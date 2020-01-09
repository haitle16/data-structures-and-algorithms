package java401challenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTest {
    @Test public void testBinarySearch() {
        int result = 2;
        int actual = BinarySearch.binSearch(new int[] {2,5,7,8,10,12,14}, 7);
        int result2 = 5;
        int actual2 = BinarySearch.binSearch(new int[] {2,5,7,8,10,12,14}, 12);
        int result3 = -1;
        int actual3 = BinarySearch.binSearch(new int[] {}, 12);
        assertEquals( actual, result);
        assertEquals( actual2, result2);
        assertEquals( actual3, result3);
    }
}
