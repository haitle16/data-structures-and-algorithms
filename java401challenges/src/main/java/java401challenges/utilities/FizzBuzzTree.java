package java401challenges.utilities;

import java401challenges.tree.Node;
import java401challenges.tree.Tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FizzBuzzTree {


    public Node root;

    List<String> result = new LinkedList<>();

    public String traversefb(Node root) {
        if (root == null) return "The Tree is empty!";
        if (root != null) {
            if (root.value % 3 == 0 && root.value % 5 == 0) result.add("FizzBuzz");
            else if (root.value % 3 == 0) result.add("Fizz");
            else if (root.value % 5 == 0) result.add("Buzz");
            else result.add(String.valueOf(root.value));
        }
        traversefb(root.left);
        traversefb(root.right);
        return result.toString();
    }

    // Left - Root - Right
    public List<String> preOrder() {
        return this.preOrder(this.root);
    }

    public List<String> preOrder(Node node) {
        List<String> result = new LinkedList<>();
        if (node != null) {
            result.add(String.valueOf(node.value)); // Root
            result.addAll(preOrder(node.left)); // Left
            result.addAll(preOrder(node.right)); // Right
        }
        return result;
    }
}
