package java401challenges.stacksandqueues;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    // generic passing in a type int or string
    Queue<Integer> queue;
    Queue<String> stringQueue;

    @Before
    public void setUp(){
        queue = new Queue();
    }

    @Test
    public void queueInstanceTest() {
        Queue queueTest = new Queue();
        assertEquals("front node should be null", null, queueTest.front);
    }

    @Test
    public void enqueueTest() {
        queue.enqueue(213);
        assertEquals(213, queue.peek().intValue());
    }

    @Test (expected = Exception.class)
    public void peekEmptyTest() {
        queue.peek();
    }

    @Test
    public void peekTest() {
        queue.enqueue(2);
        queue.enqueue(4);
        assertEquals(2, queue.peek().intValue());
    }

    @Test
    public void queueLengthTest() {
        queue.enqueue(2);
        queue.enqueue(4);
        queue.enqueue(6);
        queue.enqueue(8);
        assertEquals(4,queue.length);
        queue.dequeue();
        assertEquals(3, queue.length);
    }

    @Test
    public void emptyQueueTest() {
        assertTrue(queue.isEmpty());
        queue.enqueue(4);
        assertFalse(queue.isEmpty());
        queue.dequeue();
        assertTrue(queue.isEmpty());
    }


}
