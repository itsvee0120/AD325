# Binary Tree Traversal Implementation

## Overview
This project implements four different binary tree traversal algorithms in Java:
1. **Preorder Traversal** (Root → Left → Right)
2. **Inorder Traversal** (Left → Root → Right)
3. **Postorder Traversal** (Left → Right → Root)
4. **Level Order Traversal** (Breadth-First using a Queue)

The program constructs a sample binary tree and demonstrates each traversal method.

## Implementation Details
- The `TreeNode` class defines the structure of a binary tree node.
- The `BinaryTree` class includes methods for each traversal technique.
- The `main` function builds a sample binary tree and prints traversal results.

## Tree Structure Used for Testing
```
         10
        /  \
       5    15
      / \   /  \
     3   7 12  18
    / \      /  \
   1   4    17   20
```

## Expected Outputs
- **Preorder**:   `[10, 5, 3, 1, 4, 7, 15, 12, 18, 17, 20]`
- **Inorder**:    `[1, 3, 4, 5, 7, 10, 12, 15, 17, 18, 20]`
- **Postorder**:  `[1, 4, 3, 7, 5, 12, 17, 20, 18, 15, 10]`
- **Level Order**: `[10, 5, 15, 3, 7, 12, 18, 1, 4, 17, 20]`

## How to Run
1. Compile the Java file:
   ```sh
   javac BinaryTree.java
   ```
2. Run the program:
   ```sh
   java BinaryTree
   ```

