# Binary Search Tree (BST) Implementation in Java

This repository contains a Java implementation of a Binary Search Tree (BST). The implementation includes basic operations such as insertion, search, deletion, and in-order traversal. It also includes a test suite to verify the correctness of the operations using JUnit.

## Features

- **Insertion**: Add a value to the BST.
- **Search**: Check if a value exists in the BST.
- **Deletion**: Remove a value from the BST (handles nodes with 0, 1, or 2 children).
- **In-order Traversal**: Print the values of the tree in sorted order.

## Requirements

- Java 8 or higher
- JUnit 5 for testing

## File Structure

- `TreeNode.java`: Defines the structure of a tree node.
- `BinarySearchTree.java`: Contains the methods for BST operations like insert, search, delete, and in-order traversal.
- `TestBinarySearchTree.java`: A JUnit test class that tests the BST operations.

## How to Run

### 1. Compile the Java Files

Make sure all the Java files (`TreeNode.java`, `BinarySearchTree.java`, `TestBinarySearchTree.java`) are in the same directory or package.

```bash
javac TreeNode.java BinarySearchTree.java TestBinarySearchTree.java
```

### 2. Run the JUnit Tests

If you are using Maven, you can run the tests with the following command:

```bash
mvn test
```

If you are using an IDE (such as IntelliJ IDEA or Eclipse), you can run the tests directly from the IDE.

### 3. Expected Output

- **Insertion**: The tree will successfully insert values into the correct positions.
- **Search**: The program will return `true` for values that exist and `false` for values that don't.
- **Deletion**: The tree will remove the node correctly, whether it has 0, 1, or 2 children.
- **In-order Traversal**: The output will display the tree values in sorted order.

## Example Usage

### Insertion & Traversal

```java
BinarySearchTree bst = new BinarySearchTree();
bst.insert(10);
bst.insert(5);
bst.insert(20);
bst.insert(15);
bst.inorder();  // Expected output: 5 10 15 20
```

### Search

```java
boolean result = bst.search(10);  // Expected output: true
boolean result = bst.search(100); // Expected output: false
```

### Deletion

```java
bst.delete(10);  // Removes the node with value 10
bst.inorder();   // Expected output after deletion: 5 15 20
```

## Test Cases

The project includes test cases for various operations:

- **Insertion**: Tests that values are inserted correctly into the tree.
- **Search**: Tests that the search operation works for existing and non-existing values.
- **Deletion**: Tests deleting nodes with no children, one child, and two children.
- **In-order Traversal**: Tests the in-order traversal to ensure the tree is printed in sorted order.
