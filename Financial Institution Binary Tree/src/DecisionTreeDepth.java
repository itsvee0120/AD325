class DecisionTreeNode {
    String question;
    DecisionTreeNode yesBranch;
    DecisionTreeNode noBranch;

public DecisionTreeNode(String question){
    this.question = question;
    this.yesBranch = null;
    this.noBranch = null;

}
}

public class DecisionTreeDepth {

    public static int maxDepth(DecisionTreeNode root){
        if(root == null){
            return 0;
        }

        int leftDepth = maxDepth(root.yesBranch);
        int rightDepth = maxDepth(root.noBranch);

        return Math.max(leftDepth, rightDepth) + 1;

    }

    public static void printTree(DecisionTreeNode root, String prefix, boolean isLeft) {
        if(root != null){
            System.out.println(prefix + (isLeft ? "├── " : "└── ") + root.question);
            printTree(root.yesBranch, prefix + (isLeft ? "│   " : "    "), true);
            printTree(root.noBranch, prefix + (isLeft ? "│   " : "    "), false);

        }

    }



    // Test Case 1: Tree with more than one level
    public static void testCase1() {
        System.out.println("Test Case 1: Tree with more than one level");
        DecisionTreeNode root = new DecisionTreeNode("Start");
        root.yesBranch = new DecisionTreeNode("Loan Inquiry");
        root.noBranch = new DecisionTreeNode("Investment Inquiry");

        root.yesBranch.yesBranch = new DecisionTreeNode("Home Loan");
        root.yesBranch.noBranch = new DecisionTreeNode("Car Loan");

        root.noBranch.yesBranch = new DecisionTreeNode("Stocks");
        root.noBranch.noBranch = new DecisionTreeNode("Bonds");

        System.out.println("Maximum depth of the tree: " + maxDepth(root));
        System.out.println("Tree structure:");
        printTree(root, "", false);
    }

    // Test Case 2: Tree with 2 levels
    public static void testCase2() {
        System.out.println("\nTest Case 2: Tree with 2 levels");
        DecisionTreeNode root = new DecisionTreeNode("Start");
        root.yesBranch = new DecisionTreeNode("Loan Inquiry");
        root.noBranch = new DecisionTreeNode("Investment Inquiry");

        System.out.println("Maximum depth of the tree: " + maxDepth(root));
        System.out.println("Tree structure:");
        printTree(root, "", false);
    }

    // Test Case 3: Tree with deeper hierarchy
    public static void testCase3() {
        System.out.println("\nTest Case 3: Tree with deeper hierarchy");
        DecisionTreeNode root = new DecisionTreeNode("Start");
        root.yesBranch = new DecisionTreeNode("Loan Inquiry");
        root.yesBranch.yesBranch = new DecisionTreeNode("Home Loan");
        root.yesBranch.noBranch = new DecisionTreeNode("Car Loan");
        root.yesBranch.yesBranch.yesBranch = new DecisionTreeNode("Mortgage");

        System.out.println("Maximum depth of the tree: " + maxDepth(root));
        System.out.println("Tree structure:");
        printTree(root, "", false);
    }

    // Edge Test Case 1: Empty tree (root is null)
    public static void testCase4() {
        System.out.println("\nTest Case 4: Empty tree (root is null)");
        DecisionTreeNode root = null;

        System.out.println("Maximum depth of the tree: " + maxDepth(root));
    }

    // Edge Test Case 2: Tree with only one node (root)
    public static void testCase5() {
        System.out.println("\nTest Case 5: Tree with only one node (root)");
        DecisionTreeNode root = new DecisionTreeNode("Start");

        System.out.println("Maximum depth of the tree: " + maxDepth(root));
        System.out.println("Tree structure:");
        printTree(root, "", false);
    }

    // Edge Test Case 3: Tree with all branches as null
    public static void testCase6() {
        System.out.println("\nTest Case 6: Tree with all branches as null");
        DecisionTreeNode root = new DecisionTreeNode("Start");
        root.yesBranch = null;
        root.noBranch = null;

        System.out.println("Maximum depth of the tree: " + maxDepth(root));
        System.out.println("Tree structure:");
        printTree(root, "", false);
    }

    public static void main(String[] args) {
        // Running all test cases
        testCase1();
        testCase2();
        testCase3();
        testCase4();
        testCase5();
        testCase6();
    }
}
