import java.util.*;

class TreeNode{
    int val;
    TreeNode left, right;
    TreeNode(int val){
        this.val = val;
        this.left = this.right = null;

    }
}
public class BinaryTree {
    // Pre-Order Traversal
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;

        result.add(root.val);
        result.addAll(preorderTraversal(root.left));
        result.addAll(preorderTraversal(root.right));

        return result;

    }

    //In-Order Traversal
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;

        result.addAll(inorderTraversal(root.left));
        result.add(root.val);
        result.addAll(inorderTraversal(root.right));
        return result;
    }

    //Post-Order Traversal
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        result.addAll(postorderTraversal(root.left));
        result.addAll(postorderTraversal(root.right));
        result.add(root.val);
        return result;
    }

    //Level-Order Traversal
    public static List<Integer> levelOrder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            result.add(node.val);
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
        }
        return result;

    }

    public static void main(String[] args) {
        // Example Tree:
        //        1
        //       /  \
        //      2    3
        //     / \  /
        //    4   5 6
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        System.out.println("Pre-Order Traversal: " + preorderTraversal(root));
        System.out.println("In-Order Traversal: " + inorderTraversal(root));
        System.out.println("Post-Order Traversal: " + postorderTraversal(root));
        System.out.println("Level-Order Traversal: " + levelOrder(root));

        // Additional Test Cases
        // Edge case: Empty tree
        TreeNode emptyTree = null;
        System.out.println("Empty Tree Preorder: " + preorderTraversal(emptyTree));

        // Skewed Tree (Right-heavy)
        TreeNode skewedRight = new TreeNode(1);
        skewedRight.right = new TreeNode(2);
        skewedRight.right.right = new TreeNode(3);
        skewedRight.right.right.right = new TreeNode(4);
        System.out.println("Right-skewed Tree Level Order: " + levelOrder(skewedRight));

        // Skewed Tree (Left-heavy)
        TreeNode skewedLeft = new TreeNode(1);
        skewedLeft.left = new TreeNode(2);
        skewedLeft.left.left = new TreeNode(3);
        skewedLeft.left.left.left = new TreeNode(4);
        System.out.println("Left-skewed Tree Level Order: " +levelOrder(skewedLeft));


        // Large Tree Test Case
        //
        //         10
        //        /  \
        //       5    15
        //      / \   /  \
        //     3   7 12  18
        //    / \      /  \
        //   1   4    17   20
        TreeNode largeTree = new TreeNode(10);
        largeTree.left = new TreeNode(5);
        largeTree.right = new TreeNode(15);
        largeTree.left.left = new TreeNode(3);
        largeTree.left.right = new TreeNode(7);
        largeTree.right.left = new TreeNode(12);
        largeTree.right.right = new TreeNode(18);
        largeTree.left.left.left = new TreeNode(1);
        largeTree.left.left.right = new TreeNode(4);
        largeTree.right.right.left = new TreeNode(17);
        largeTree.right.right.right = new TreeNode(20);
        System.out.println("Large Tree Preorder: " + preorderTraversal(largeTree));
        System.out.println("Large Tree Inorder: " + inorderTraversal(largeTree));
        System.out.println("Large Tree Postorder: " + postorderTraversal(largeTree));
        System.out.println("Large Tree Level Order: " + levelOrder(largeTree));
    }

}
