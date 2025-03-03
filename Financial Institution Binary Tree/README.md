# Decision Tree Depth and Structure

This project defines a simple decision tree structure, calculates the maximum depth of the tree, and prints the tree structure in a readable format.

## Features

- **DecisionTreeNode**: A class representing a node in the decision tree, which contains a question, and branches for 'Yes' and 'No' responses.
- **maxDepth**: A method to calculate the maximum depth of the decision tree.
- **printTree**: A method to print the tree structure in a readable format.
- **Test Cases**: Several test cases are provided to validate the functionality, including normal and edge cases.


## Class Definitions

### DecisionTreeNode
This class represents a node in the decision tree, with the following attributes:
- `question`: A question stored at this node.
- `yesBranch`: A branch for the 'Yes' response.
- `noBranch`: A branch for the 'No' response.

### Methods

#### `maxDepth(DecisionTreeNode root)`
- **Purpose**: Calculates the maximum depth of the decision tree.
- **Time Complexity**: O(n), where `n` is the number of nodes in the tree.
- **Space Complexity**: O(n), due to recursion stack.

#### `printTree(DecisionTreeNode root, String prefix, boolean isLeft)`
- **Purpose**: Prints the decision tree structure in a human-readable format, showing branches as `├──` for left and `└──` for right.
  
## Test Cases

### Normal Test Cases

1. **Test Case 1**: Tree with more than one level
   - Example tree:
     ```
     Start
     ├── Loan Inquiry
     │   ├── Home Loan
     │   └── Car Loan
     └── Investment Inquiry
         ├── Stocks
         └── Bonds
     ```
   - **Expected Output**:
     - Maximum depth: 3
     - Tree structure printed

2. **Test Case 2**: Tree with 2 levels
   - Example tree:
     ```
     Start
     ├── Loan Inquiry
     └── Investment Inquiry
     ```
   - **Expected Output**:
     - Maximum depth: 2
     - Tree structure printed

3. **Test Case 3**: Tree with a deeper hierarchy
   - Example tree:
     ```
     Start
     ├── Loan Inquiry
     │   ├── Home Loan
     │   │   └── Mortgage
     │   └── Car Loan
     ```
   - **Expected Output**:
     - Maximum depth: 4
     - Tree structure printed

### Edge Test Cases

1. **Test Case 4**: Empty tree (root is `null`)
   - **Expected Output**:
     - Maximum depth: 0

2. **Test Case 5**: Tree with only one node (root)
   - **Expected Output**:
     - Maximum depth: 1
     - Tree structure printed

3. **Test Case 6**: Tree with all branches as `null`
   - **Expected Output**:
     - Maximum depth: 1
     - Tree structure printed

## Running the Program

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/decision-tree-depth.git
   ```

2. Navigate to the project directory:
   ```bash
   cd decision-tree-depth
   ```

3. Compile and run the Java program:
   ```bash
   javac DecisionTreeDepth.java
   java DecisionTreeDepth
   ```

