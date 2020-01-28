package java401challenges.utilities;

import java401challenges.tree.Node;
import java401challenges.tree.Tree;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.Assert.*;

//                   15
//                 /   \
//                2     3
//               / \   / \
//              4   5 6   7
//


public class FizzBuzzTreeTest {
    FizzBuzzTree tree;

    @Before
    public void setUp() {
        tree = new FizzBuzzTree();
        Node left = new Node(2, new Node(4), new Node(5));
        Node right = new Node(3, new Node(6), new Node(7));
        Node root = new Node(15, left, right);
        tree.root = root;

    }
        @Test
        public void fizzBuzzTree () {
            System.out.println(tree.preOrder());
            assertEquals("Original tree [15, 2, 4, 5, 3, 6, 7] ","[FizzBuzz, 2, 4, Buzz, Fizz, Fizz, 7]", tree.traversefb(tree.root) );
        }
}