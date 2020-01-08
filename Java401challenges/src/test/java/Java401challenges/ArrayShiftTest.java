package Java401challenges;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class ArrayShiftTest {
    @Test public void testArrayShift() {
       int [] expected = {2,4,6,8,10};
       int [] actual = ArrayShift.mid(new int[] {2,4,8,10}, 6);
       assertEquals( Arrays.toString(expected), Arrays.toString(actual));
    }
}
