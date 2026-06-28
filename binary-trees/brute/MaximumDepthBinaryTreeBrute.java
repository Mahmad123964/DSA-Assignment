
// Problem: Maximum Depth of Binary Tree
// Approach: Brute Force (BFS Level Counter)
// Time Complexity: O(n) - har node ek baar visit hoti hai
// Space Complexity: O(n) - queue mein nodes store hoti hain


import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthBinaryTreeBrute {

    // TreeNode class
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static int maxDepth(TreeNode root) {

        // Step 1: Agar tree empty hai to depth 0 hai
        if (root == null) return 0;

        // Step 2: Queue banao BFS ke liye
        Queue<TreeNode> queue = new LinkedList<>();

        // Step 3: Root ko queue mein daalo
        queue.add(root);

        // Step 4: Depth counter
        int depth = 0;

        // Step 5: Jab tak queue empty nahi hoti
        while (!queue.isEmpty()) {

            // Step 6: Current level ke kitne nodes hain
            int levelSize = queue.size();

            // Step 7: Current level ke saare nodes process karo
            for (int i = 0; i < levelSize; i++) {

                // Step 8: Queue se node nikalo
                TreeNode current = queue.poll();

                // Step 9: Left child queue mein daalo
                if (current.left != null) {
                    queue.add(current.left);
                }

                // Step 10: Right child queue mein daalo
                if (current.right != null) {
                    queue.add(current.right);
                }
            }

            // Step 11: Ek level complete hua, depth badao
            depth++;
        }

        // Step 12: Maximum depth return karo
        return depth;
    }

    public static void main(String[] args) {


        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(9);
        root1.right = new TreeNode(20);
        root1.right.left = new TreeNode(15);
        root1.right.right = new TreeNode(7);
        System.out.println("Test 1: " + maxDepth(root1)); // 3

        // Test Case 2: Single node
        TreeNode root2 = new TreeNode(1);
        System.out.println("Test 2: " + maxDepth(root2)); // 1

        // Test Case 3: Empty tree
        System.out.println("Test 3: " + maxDepth(null)); // 0
    }
}