package java401challenges.stacksandqueues;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    Stack stack1 = new Stack();

    @Before
    public void setUp() {
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);
    }

    @Test
    public void stackPushTest() {
        assertEquals("top node should be 5", 5, stack1.top.value);
    }

    @Test
    public void stackPopTest() {
        stack1.pop();
        assertEquals("top node should be 4 after popping", 4, stack1.top.value);
        stack1.pop();
        assertEquals("top node should be 3 after 2nd popping", 3, stack1.top.value);
    }

    @Test public void stackPeekTest() {
        assertEquals("top node should be 5 using peek",5, stack1.peek());
        stack1.push(6);
        assertEquals("top node should be 6 after pushing new value",6, stack1.peek());
    }

    @Test
    public void stackEmptyTest() {
        assertFalse(stack1.isEmpty());
        stack1.pop();
        stack1.pop();
        stack1.pop();
        stack1.pop();
        stack1.pop();
        assertTrue(stack1.isEmpty());
    }

    @Test
    public void stackLengthTest() {
        assertEquals("should have length of 5", 5, stack1.length);
        stack1.pop();
        assertEquals("should have length of 4 after popping one", 4, stack1.length);
    }
}
