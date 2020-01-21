package java401challenges.stacksandqueues;


import java.util.NoSuchElementException;

public class Queue<T>{

    Node <T> front;
    Node <T> back;
    int length = 0;

    public void enqueue(T value) {
        Node<T> newNode = new Node<>(value);
        if(front == null) {
            front = newNode;
        } else {
            back.next = newNode;
        }
        back = newNode;
        length ++;
    }

    public T dequeue() {
        try{
            Node<T> current = front;
            front = front.next;
            length--;
            return current.value;
        } catch(NullPointerException e){
            throw new NoSuchElementException("Empty queue, nothing to dequeue!");
        }
    }

    public T peek() {
        if(front == null) {
            throw new NoSuchElementException("Cannot peek at an empty queue!");
        }
        return front.value;
    }

    public boolean isEmpty() {
        return this.front == null;
    }

    public int length() {return this.length;}
}
