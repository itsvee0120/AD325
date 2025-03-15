// TestBinarySearchTree.java
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestBinarySearchTree {
    private BinarySearchTree bst;

    @BeforeEach
    public void setUp() {
        bst = new BinarySearchTree();
    }

    @Test
    public void testInsert() {
        bst.insert(10);
        bst.insert(20);
        bst.insert(5);

        assertTrue(bst.search(10));
        assertTrue(bst.search(20));
        assertTrue(bst.search(5));
        assertFalse(bst.search(30));
    }

    @Test
    public void testSearch() {
        bst.insert(15);
        bst.insert(25);
        bst.insert(5);

        assertTrue(bst.search(15));
        assertTrue(bst.search(25));
        assertTrue(bst.search(5));
        assertFalse(bst.search(100));
    }

    @Test
    public void testDeleteLeafNode() {
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);

        bst.delete(20);
        assertFalse(bst.search(20));
    }

    @Test
    public void testDeleteNodeWithOneChild() {
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);

        bst.delete(5);
        assertFalse(bst.search(5));
    }

    @Test
    public void testDeleteNodeWithTwoChildren() {
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(12);

        bst.delete(10);
        assertFalse(bst.search(10));
        assertTrue(bst.search(12));
    }

    @Test
    public void testInorderTraversal() {
        bst.insert(10);
        bst.insert(5);
        bst.insert(20);
        bst.insert(15);

        bst.inorder(); // Should print: 5 10 15 20
    }
}
