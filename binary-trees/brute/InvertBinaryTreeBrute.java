
// Problem: Invert Binary Tree
// Approach: Brute Force (Iterative BFS Queue)
// Time Complexity: O(n) - har node ek baar visit hoti hai
// Space Complexity: O(n) - queue mein nodes store hoti hain


import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTreeBrute {

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

        // Step 1: Agar tree empty hai to null return karo
        if (root == null) return null;

        // Step 2: Ek Queue banao BFS ke liye
        Queue<TreeNode> queue = new LinkedList<>();

        // Step 3: Root ko queue mein daalo
        queue.add(root);

        // Step 4: Jab tak queue empty nahi hoti
        while (!queue.isEmpty()) {

            // Step 5: Queue se ek node nikalo
            TreeNode current = queue.poll();

            // Step 6: Current node ke left aur right children swap karo
            TreeNode temp = current.left;
            current.left = current.right;
            current.right = temp;

            // Step 7: Left child queue mein daalo agar exist karta hai
            if (current.left != null) {
                queue.add(current.left);
            }

            // Step 8: Right child queue mein daalo agar exist karta hai
            if (current.right != null) {
                queue.add(current.right);
            }
        }

        // Step 9: Inverted tree ka root return karo
        return root;
    }

    // Tree print karne ka helper method (Level Order)
    public static void printTree(TreeNode root) {
        if (root == null) {
            System.out.println("Empty Tree");
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
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