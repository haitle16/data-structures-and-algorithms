package java401challenges.stacksandqueues;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QueueTest {

    // generic passing in a type int or string
    Queue<Integer> queue;
    Queue<String> stringQueue;

    @Before
    public void setUp(){
        queue = new Queue();
    }

    @Test
    public void enqueueTest(){
        queue.enqueue(213);
        assertEquals(213, queue.peek().intValue());
    }
}
