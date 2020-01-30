package java401challenges.tree;

import java401challenges.stacksandqueues.Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Tree {
    public Node root;
    static Queue<Node> queue = new Queue<>();


    public int getSize (Node root) {
        if(root == null) {
            return 0;
        } else {
            return 1 + getSize(root.left) + getSize(root.right);
        }
    }

    // Root - Left - Right
    public Integer[] preOrder() {
        return this.preOrder(this.root);
    }

    public Integer[] preOrder(Node node) {
        List<Integer> result = new LinkedList<>();
        if(node != null) {
            result.add(node.value); // Root
            result.addAll(Arrays.asList(preOrder(node.left))); // Left
            result.addAll(Arrays.asList(preOrder(node.right))); // Right
        }
        return result.toArray(new Integer[result.size()]);
    }

    // Left - Root - Right
    public Integer[] inOrder() {
        return this.inOrder(this.root);
    }

    public Integer[] inOrder(Node node) {
        List<Integer> result = new LinkedList<>();
        if(node != null) {
            result.addAll(Arrays.asList(inOrder(node.left))); // Left
            result.add(node.value); // Root
            result.addAll(Arrays.asList(inOrder(node.right))); // Right
        }
        return result.toArray(new Integer[result.size()]);
    }

    // Left - Right - Root
    public Integer[] postOrder() {
        return this.postOrder(this.root);
    }

    public Integer[] postOrder(Node node) {
        List<Integer> result = new LinkedList<>();
        if(node != null) {
            result.addAll(Arrays.asList(postOrder(node.left))); // Left
            result.addAll(Arrays.asList(postOrder(node.right))); // Right
            result.add(node.value); // Root
        }
        return result.toArray(new Integer[result.size()]);
    }

    // Level Order

    public List levelOrder() {
        LinkedList<Node> result = new LinkedList<>();
        if(this.root != null) {
            queue.enqueue(this.root);
        }
        while(!queue.isEmpty()) {
            Node current = queue.dequeue();
            result.add(current);
            if(current.left != null) {
                queue.enqueue(current.left);
            }
            if(current.right != null) {
                queue.enqueue(current.right);
            }

        }
        return result;
    }









}
