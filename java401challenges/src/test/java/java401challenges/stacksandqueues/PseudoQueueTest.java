package java401challenges.stacksandqueues;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PseudoQueueTest {

    PseudoQueue pq = new PseudoQueue<>();

    @Before
    public void setUp() {
        pq.enqueue(1);
        pq.enqueue(2);
        pq.enqueue(3);
        pq.enqueue(4);
        pq.enqueue(5);


    }

    @Test
    public void queueInstanceTest() {
        PseudoQueue queueTest = new PseudoQueue();
        assertEquals("front node should be null", null, queueTest.stack1.top);
    }


    @Test
    public void pseudoEnqueueTest() {
        // should add 0 to the back of the line, when called top should return 0.
        pq.enqueue(0);
        assertEquals(0, pq.stack1.peek());
    }

    @Test
    public void pseudoDequeueTest() {
        // order is back to front 5->4->3->2->1
        // should remove front of queue, which is 1.
        assertEquals("should remove 1", 1, pq.dequeue());
        // should remove front of queue, which is 2.
        assertEquals("should remove 2", 2, pq.dequeue());
    }

    @Test(expected = Exception.class)
    public void pseudoDequeue_emptyStack() {
        PseudoQueue<Integer> emptyPQueue = new PseudoQueue<>();
        emptyPQueue.dequeue();
    }

}
