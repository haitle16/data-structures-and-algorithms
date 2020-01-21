package java401challenges.stacksandqueues;

import java.time.Period;
import java.util.NoSuchElementException;

public class PseudoQueue<T> {

    Stack<T> stack1;
    Stack<T> stack2;

    public PseudoQueue() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    public void enqueue(T value) {
        this.stack1.push(value);
    }
    public T dequeue() {

        while(!this.stack1.isEmpty()) {
            stack2.push((stack1.pop())); // pushing popped top value of stack 1 into stack 2
        }
        T popVal = stack2.pop();
        while(!this.stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return popVal;

    }
}
