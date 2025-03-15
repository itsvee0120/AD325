import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AVLTreeTest {
    private AVLTree avl;

    @BeforeEach
    void setUp() {
        avl = new AVLTree();
    }

    @Test
    void testSimpleInsertion() {
        avl.insert(10);
        avl.insert(20);
        avl.insert(30);
        assertTrue(avl.search(10));
        assertTrue(avl.search(20));
        assertTrue(avl.search(30));
    }

    @Test
    void testSingleRotationInsertion() {
        avl.insert(30);
        avl.insert(20);
        avl.insert(10);  // Right rotation needed
        assertTrue(avl.search(10));
        assertTrue(avl.search(20));
        assertTrue(avl.search(30));
    }

    @Test
    void testDoubleRotationInsertion() {
        avl.insert(30);
        avl.insert(10);
        avl.insert(20);  // Left-Right rotation needed
        assertTrue(avl.search(10));
        assertTrue(avl.search(20));
        assertTrue(avl.search(30));
    }

    @Test
    void testDeletionCausingRebalancing() {
        avl.insert(10);
        avl.insert(20);
        avl.insert(30);
        avl.insert(40);
        avl.insert(50);
        avl.delete(10);
        assertFalse(avl.search(10));
        assertTrue(avl.search(20));
        assertTrue(avl.search(30));
        assertTrue(avl.search(40));
        assertTrue(avl.search(50));
    }

    @Test
    void testDeleteNonExistentKey() {
        avl.insert(10);
        avl.insert(20);
        avl.delete(30);
        assertTrue(avl.search(10));
        assertTrue(avl.search(20));
    }

    @Test
    void testInsertDuplicateKey() {
        avl.insert(10);
        avl.insert(10);
        avl.insert(20);
        assertTrue(avl.search(10));
        assertTrue(avl.search(20));
    }

    @Test
    void testSearchExistingAndNonExistingKeys() {
        avl.insert(10);
        avl.insert(20);
        assertTrue(avl.search(10));
        assertFalse(avl.search(30));
    }
}
