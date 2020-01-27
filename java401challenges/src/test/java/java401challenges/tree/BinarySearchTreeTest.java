package java401challenges.tree;

import java401challenges.BinarySearch;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    BinarySearchTree bsTree;

    @Before
    public void setUp() {
        bsTree = new BinarySearchTree();
        bsTree.add(10);
        bsTree.add(6);
        bsTree.add(3);
        bsTree.add(7);
        bsTree.add(15);
        bsTree.add(13);
        bsTree.add(17);
    }

    @Test
    public void sizeTest() {
        assertEquals("size should equal to 7", 7, bsTree.getSize(bsTree.root));
    }

    @Test
    public void bstAddTest() {
        assertEquals("root should be 10", 10, bsTree.root.value);
        assertEquals("left value of root should be 6", 6, bsTree.root.left.value);
        assertEquals("right value of root should be 15", 15, bsTree.root.right.value);
    }

    @Test
    public void containsTest() {
        assertTrue(bsTree.contains(13));
        assertTrue(bsTree.contains(6));
        assertTrue(bsTree.contains(7));
        assertFalse(bsTree.contains(20));
        assertFalse(bsTree.contains(5));
    }


}
