package java401challenges.tree;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

public class TreeIntersectionTest {

    TreeIntersection treeIntersection = new TreeIntersection();

    Tree tree;
    Tree tree2;
    @Before
    public void setUp() {
        tree = new Tree();
        Node left = new Node(70, null, new Node(17));
        Node right = new Node(77, new Node(90), new Node(5));
        Node root = new Node(50, left, right);
        tree.root = root;

        tree2 = new Tree();
        Node left2 = new Node(17, null, new Node(7));
        Node right2 = new Node(70, new Node(77), new Node(5));
        Node root2 = new Node(20, left2, right2);
        tree2.root = root2;
    }

    @Test
    public void treeIntersectionTest() {
        List<Integer> result = treeIntersection.tree_intersection(tree.root, tree2.root);
        List<Integer> actual = asList(70,17,77,5);
        assertEquals(actual,result);
        System.out.println(Arrays.toString(new List[]{treeIntersection.tree_intersection(tree.root, tree2.root)}));
    }

    @Test
    public void preOrderTest() {
        System.out.println(Arrays.toString(treeIntersection.preOrder(tree.root)));
        Integer[] result = new Integer[]{50,70,17,77,90,5};
        assertArrayEquals("Should return by Root - Left - Right Order",result , treeIntersection.preOrder(tree.root));
    }




}