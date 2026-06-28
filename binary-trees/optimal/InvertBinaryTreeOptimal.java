
// Problem: Invert Binary Tree
// Approach: Optimal (Recursive DFS)
// Time Complexity: O(n) - har node ek baar visit hoti hai
// Space Complexity: O(h) - h tree ki height hai (recursion stack)


public class InvertBinaryTreeOptimal {

    // TreeNode class - binary tree ka ek node
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static TreeNode invertTree(TreeNode root) {

        // Step 1: Base case - agar node null hai to null return karo
        if (root == null) return null;

        // Step 2: Pehle left subtree ko recursively invert karo
        TreeNode left = invertTree(root.left);

        // Step 3: Phir right subtree ko recursively invert karo
        TreeNode right = invertTree(root.right);

        // Step 4: Left aur right children swap karo
        root.left = right;
        root.right = left;

        // Step 5: Root return karo
        return root;
    }

    // Tree print karne ka helper method (Level Order)
    public static void printTree(TreeNode root) {
        if (root == null) {
            System.out.println("Empty Tree");
            return;
        }
        java.util.Queue<TreeNode> queue = new java.util.LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.val + " ");
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
        System.out.println();
    }

    public static void main(String[] args) {


        TreeNode root1 = new TreeNode(4);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(7);
        root1.left.left = new TreeNode(1);
        root1.left.right = new TreeNode(3);
        root1.right.left = new TreeNode(6);
        root1.right.right = new TreeNode(9);

        System.out.print("Before: ");
        printTree(root1);
        invertTree(root1);
        System.out.print("After:  ");
        printTree(root1); // 4 7 2 9 6 3 1

        // Test Case 2: Empty tree
        TreeNode root2 = null;
        System.out.println("Test 2: " + invertTree(root2)); // null
    }
}