# AVLTree Class

The `AVLTree` class implements an **AVL (Adelson-Velsky and Landis)** tree, a self-balancing binary search tree. The height difference between the left and right subtrees of any node is at most 1, ensuring that the tree remains balanced, providing **O(log n)** time complexity for search, insert, and delete operations.

## Features

- **Insertion:** The tree supports inserting elements while maintaining balance.
- **Deletion:** Allows deleting elements while ensuring the tree remains balanced.
- **Search:** Implements searching for an element within the tree.
- **Balancing:** The AVL tree automatically rebalances itself using rotations when needed.
- **In-order Traversal:** Prints the elements of the tree in ascending order.

## Operations

### 1. `insert(int key)`
Inserts a key into the AVL tree, balancing the tree after insertion to ensure it remains balanced.

### 2. `search(int key)`
Searches for a key in the AVL tree and returns `true` if the key is found, `false` otherwise.

### 3. `delete(int key)`
Deletes a key from the AVL tree, rebalancing the tree after deletion.

### 4. `inOrderTraversal()`
Performs an in-order traversal of the tree, printing the elements in ascending order.

## Rotations

- **Right Rotation:** Applied when the tree is left-heavy.
- **Left Rotation:** Applied when the tree is right-heavy.
- **Left-Right Rotation:** A combination of a left rotation followed by a right rotation.
- **Right-Left Rotation:** A combination of a right rotation followed by a left rotation.

## Usage Example

```java
public class Main {
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();

        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(10);
        tree.insert(25);

        System.out.println("In-order Traversal:");
        tree.inOrderTraversal(); // Outputs: 10 20 25 30 40

        tree.delete(20);
        System.out.println("After Deletion:");
        tree.inOrderTraversal(); // Outputs: 10 25 30 40

        System.out.println("Search for 25: " + tree.search(25)); // Outputs: true
        System.out.println("Search for 20: " + tree.search(20)); // Outputs: false
    }
}
```

## Explanation

- **Node Structure:** Each node in the AVL tree contains a `key`, `height`, and references to its left and right children.
- **Balancing Factor:** The balance factor of a node is calculated as the difference between the heights of its left and right subtrees. If the balance factor is greater than 1 or less than -1, the tree is unbalanced, and rotations are performed to restore balance.
- **Rotations:**
    - Right rotation is performed when there is a left-heavy imbalance.
    - Left rotation is performed when there is a right-heavy imbalance.
    - Left-right and right-left rotations are used to fix double rotations.

## Time Complexity

- **Search, Insert, Delete:** O(log n) on average, where `n` is the number of nodes in the tree.
- **In-order Traversal:** O(n), where `n` is the number of nodes in the tree.

