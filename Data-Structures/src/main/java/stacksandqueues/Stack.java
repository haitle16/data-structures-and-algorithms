package stacksandqueues;

import java.util.NoSuchElementException;

public class Stack<T> {

    Node<T> top;
    int length = 0;

    public void push(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.next = top;
        top = newNode;
        this.length++;
    }

    public T pop() {
        try{
            Node<T> nodePopped = this.top;
            this.top = nodePopped.next;
            nodePopped.next = null;
            this.length--;
            return nodePopped.value;
        } catch(NullPointerException e){
            throw new NoSuchElementException("Empty queue, nothing to dequeue!");
        }
    }

    public T peek() {
        if(this.top == null) {
            throw new NoSuchElementException("Cannot peek at an empty queue!");
        }
        return this.top.value;
    }

    public boolean isEmpty() {
        return this.top == null;
    }

    public int length() {return this.length;}

}
