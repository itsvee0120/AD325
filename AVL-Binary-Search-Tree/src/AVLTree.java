class AVLTree {
    // Node class representing each element in the AVL tree
    class Node {
        int key, height; // Key stores the value, height is used for balancing
        Node left, right; // References to left and right child nodes

        Node(int key) {
            this.key = key;
            this.height = 1; // A new node is initially added at height 1
        }
    }

    private Node root; // Root node of the AVL tree

    // Returns the height of a node (or 0 if null)
    private int height(Node node) {
        return node == null ? 0 : node.height;
    }

    // Calculates the balance factor of a node
    private int getBalance(Node node) {
        return node == null ? 0 : height(node.left) - height(node.right);
    }

    // Performs a right rotation to fix left-heavy imbalance
    private Node rotateRight(Node y) {
        Node x = y.left; // x is the left child of y
        Node T2 = x.right; // Store the right subtree of x

        x.right = y; // y moves down to the right of x
        y.left = T2; // T2 becomes the left child of y

        // Update heights after rotation
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x; // New root after rotation
    }

    // Performs a left rotation to fix right-heavy imbalance
    private Node rotateLeft(Node x) {
        Node y = x.right; // y is the right child of x
        Node T2 = y.left; // Store the left subtree of y

        y.left = x; // x moves down to the left of y
        x.right = T2; // T2 becomes the right child of x

        // Update heights after rotation
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y; // New root after rotation
    }

    // Public method to insert a key into the AVL tree
    public void insert(int key) {
        root = insert(root, key);
    }

    // Recursive function to insert a key and balance the tree
    private Node insert(Node node, int key) {
        if (node == null) return new Node(key); // Create a new node if the position is empty

        if (key < node.key)
            node.left = insert(node.left, key); // Insert in the left subtree
        else if (key > node.key)
            node.right = insert(node.right, key); // Insert in the right subtree
        else
            return node; // Duplicate keys are not allowed

        // Update height of the current node
        node.height = 1 + Math.max(height(node.left), height(node.right));
        int balance = getBalance(node);

        // Perform rotations if the node is unbalanced
        if (balance > 1 && key < node.left.key)
            return rotateRight(node); // Left-left case
        if (balance < -1 && key > node.right.key)
            return rotateLeft(node); // Right-right case
        if (balance > 1 && key > node.left.key) {
            node.left = rotateLeft(node.left); // Left-right case
            return rotateRight(node);
        }
        if (balance < -1 && key < node.right.key) {
            node.right = rotateRight(node.right); // Right-left case
            return rotateLeft(node);
        }

        return node; // Return the updated node
    }

    // Public method to search for a key in the tree
    public boolean search(int key) {
        return search(root, key);
    }

    // Recursive function to search for a key in the AVL tree
    private boolean search(Node node, int key) {
        if (node == null) return false; // Key not found
        if (node.key == key) return true; // Key found
        return key < node.key ? search(node.left, key) : search(node.right, key); // Search left or right
    }

    // Public method to delete a key from the AVL tree
    public void delete(int key) {
        root = delete(root, key);
    }

    // Recursive function to delete a key and balance the tree
    private Node delete(Node root, int key) {
        if (root == null) return root; // Key not found, return unchanged tree

        if (key < root.key)
            root.left = delete(root.left, key); // Recur on the left subtree
        else if (key > root.key)
            root.right = delete(root.right, key); // Recur on the right subtree
        else {
            // Node with one or no child
            if ((root.left == null) || (root.right == null)) {
                Node temp = root.left != null ? root.left : root.right;
                if (temp == null) {
                    temp = root;
                    root = null;
                } else
                    root = temp;
            } else {
                // Node with two children: find the inorder successor (smallest in the right subtree)
                Node temp = getMinValueNode(root.right);
                root.key = temp.key; // Copy inorder successor's key
                root.right = delete(root.right, temp.key); // Delete the inorder successor
            }
        }

        if (root == null) return root; // If tree had only one node

        // Update height
        root.height = Math.max(height(root.left), height(root.right)) + 1;
        int balance = getBalance(root);

        // Perform rotations if the node is unbalanced
        if (balance > 1 && getBalance(root.left) >= 0)
            return rotateRight(root); // Left-left case
        if (balance > 1 && getBalance(root.left) < 0) {
            root.left = rotateLeft(root.left); // Left-right case
            return rotateRight(root);
        }
        if (balance < -1 && getBalance(root.right) <= 0)
            return rotateLeft(root); // Right-right case
        if (balance < -1 && getBalance(root.right) > 0) {
            root.right = rotateRight(root.right); // Right-left case
            return rotateLeft(root);
        }

        return root;
    }

    // Finds the node with the smallest key in a subtree
    private Node getMinValueNode(Node node) {
        Node current = node;
        while (current.left != null)
            current = current.left;
        return current;
    }

    // Public method to print the tree in ascending order
    public void inOrderTraversal() {
        inOrderTraversal(root);
        System.out.println();
    }

    // Recursive function for in-order traversal
    private void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.key + " "); // Print node key
            inOrderTraversal(node.right);
        }
    }
}
