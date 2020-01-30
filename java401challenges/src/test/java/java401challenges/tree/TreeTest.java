package java401challenges.tree;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import static org.junit.Assert.*;


public class TreeTest {

    Tree tree;
    @Before
    public void setUp() {
        tree = new Tree();
        Node left = new Node(2, new Node(4), new Node(5));
        Node right = new Node(3, new Node(6), new Node(7));
        Node root = new Node(1, left, right);
        tree.root = root;

        // Another way to instantiates the nodes.
//        Node root = new Node(1);
//        tree.root = root;
//        root.left = new Node(2);
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);
//        root.right = new Node(3);
//        root.right.left = new Node(6);
//        root.right.right = new Node(7);
    }

    @Test
    public void getSizeTest() {
        assertEquals(7, tree.getSize(tree.root));
    }

    @Test
    public void emptyTreeTest() {
        Tree tree2 = new Tree();
        assertEquals("This tree is empty!", 0, tree2.getSize(tree2.root));
    }

    @Test
    public void treeTest(){
        Tree tree3 = new Tree();
        tree3.root = new Node(10);
        assertEquals(10, tree3.root.value);
        tree3.root.left = new Node(20);
        tree3.root.right = new Node(30);
        assertEquals(10, tree3.root.value);
        assertEquals(20, tree3.root.left.value);
        assertEquals(30, tree3.root.right.value);
    }

    @Test
    public void preOrderTest() {
        System.out.println(Arrays.toString(tree.preOrder()));
        assertArrayEquals(new Integer[]{1, 2, 4, 5, 3, 6, 7}, tree.preOrder());
    }

    @Test
    public void inOrderTest() {
        System.out.println(Arrays.toString(tree.inOrder()));
        assertArrayEquals(new Integer[]{4, 2, 5, 1, 6, 3, 7}, tree.inOrder());
    }

    @Test
    public void postOrderTest() {
        System.out.println(Arrays.toString(tree.postOrder()));
        assertArrayEquals(new Integer[]{4, 5, 2, 6, 7, 3, 1}, tree.postOrder());
    }

    @Test
    public void levelTest() {
        System.out.println(tree.levelOrder());
        assertEquals("[1, 2, 3, 4, 5, 6, 7]", tree.levelOrder().toString());
    }





}
