package stackandqueues;

import org.junit.Before;
import stacksandqueues.Queue;

import static org.junit.Assert.assertEquals;

public class QueueTest {

    // generic passing in a type int or string
    Queue<Integer> queue;
    Queue<String> stringQueue;

    @Before
    public void setUp(){
        queue = new Queue();
    }

    public void enqueueTest(){
        queue.enqueue(213);
        assertEquals(213, queue.peek().intValue());
    }
}
