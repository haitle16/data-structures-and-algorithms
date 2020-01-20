package stacksandqueues;

public class Node<T> {

    T value;
    Node<T> next;

    // Constructor
    public Node(T val) {
        this.value = val;
        this.next = null;
    }

    public Node(T val, Node<T> next) {
        this.value = val;
        this.next = next;
    }

    public String toString() {
        return String.valueOf(this.value);
    }
}
