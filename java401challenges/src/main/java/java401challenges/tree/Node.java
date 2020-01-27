package java401challenges.tree;

public class Node {

    int value;
    Node left;
    Node right;

    // Constructor
    public Node( int val) {
        this.value = val;
    }

    public Node(int val, Node left, Node right) {
        this.value = val;
        this.left = left;
        this.right = right;
    }


    public String toString() {
        return String.valueOf(this.value);
    }
}
