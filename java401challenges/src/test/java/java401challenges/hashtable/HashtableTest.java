package java401challenges.hashtable;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest {

    Hashtable hashtable = new Hashtable(5);

    @Test
    public void containsTest() {
        hashtable.add("String", "Value");
        assertTrue(hashtable.contains("String"));
    }

}