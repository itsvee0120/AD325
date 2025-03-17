# Leftist Tree Operations

This document outlines the drawing operations for Leftist Trees, including insertion, deletion, and merging. The leftist tree is a type of binary tree used for efficient merge operations. It maintains a leftist property where the left child has a shorter or equal rank compared to the right child.

## Assignment Tasks

### 1. Drawing Operations on Leftist Trees

#### Insertion

- **Task**: Start with an empty tree and insert the elements: **15, 10, 20, 8, 12, 17, 25**. Draw the tree after each insertion, ensuring the leftist property is maintained.
- **Steps**:

  1. **Insert 15**: The tree is empty, so 15 becomes the root.

     ```
     15
     ```

  2. **Insert 10**: Insert 10 as the left child of 15.

     ```
       15
      /
     10
     ```

  3. **Insert 20**: Insert 20 as the right child of 15.

     ```
       15
      /  \
     10   20
     ```

  4. **Insert 8**: Insert 8 as the left child of 10.

     ```
       15
      /  \
     10   20
     /
     8
     ```

     - **Maintain Leftist Property**: Swap the left and right subtrees of 10 to maintain the leftist property.

     ```
       15
      /  \
     8    20
      \
       10
     ```

  5. **Insert 12**: Insert 12 as the right child of 8.

     ```
       15
      /  \
     8    20
      \
       10
        \
         12
     ```

  6. **Insert 17**: Insert 17 as the left child of 20.

     ```
       15
      /  \
     8    20
      \   /
       10 17
        \
         12
     ```

  7. **Insert 25**: Insert 25 as the right child of 20.
     ```
       15
      /  \
     8    20
      \   / \
       10 17 25
        \
         12
     ```

---

#### Deletion

- **Task**: Delete the minimum element three times from the final tree after insertion. Show the steps and maintain the leftist property.
- **Steps**:

  1. **Delete 8**:

     - Remove 8 and merge its left and right subtrees.
     - The new tree:
       ```
         15
        /  \
       10   20
        \   / \
         12 17 25
       ```

  2. **Delete 10**:

     - Remove 10 and merge its left and right subtrees.
     - The new tree:
       ```
         15
        /  \
       12   20
            / \
           17 25
       ```

  3. **Delete 12**:
     - Remove 12 and merge its left and right subtrees.
     - The new tree:
       ```
         15
        /  \
       17   20
            /
           25
       ```

---

#### Merging

- **Task**: Merge two Leftist Trees:
  - **Tree 1**: 15, 10, 20
    ```
      15
     /  \
    10   20
    ```
  - **Tree 2**: 8, 12, 17, 25
    ```
       8
      / \
     12  17
         \
          25
    ```
- **Steps**:
  1. Compare the roots: 8 < 15, so 8 becomes the new root.
  2. Recursively merge the right subtree of 8 (Tree 2) with Tree 1.
  3. The final merged tree:
     ```
           8
          / \
        12  15
            /  \
           10   20
                \
                 17
                  \
                   25
     ```
