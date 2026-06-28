
// Problem: Maximum Depth of Binary Tree
// Approach: Optimal (Recursive DFS)
// Time Complexity: O(n) - har node ek baar visit hoti hai
// Space Complexity: O(h) - h tree ki height hai (recursion stack)


public class MaximumDepthBinaryTreeOptimal {

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

        // Step 1: Base case - agar node null hai to depth 0 hai
        if (root == null) return 0;

        // Step 2: Left subtree ki depth recursively nikalo
        int leftDepth = maxDepth(root.left);

        // Step 3: Right subtree ki depth recursively nikalo
        int rightDepth = maxDepth(root.right);

        // Step 4: Dono mein se jo zyada hai us mein 1 add karo
        // 1 current node ke liye add ho raha hai
        return 1 + Math.max(leftDepth, rightDepth);
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


        TreeNode root3 = new TreeNode(1);
        root3.right = new TreeNode(2);
        root3.right.right = new TreeNode(3);
        System.out.println("Test 4: " + maxDepth(root3)); // 3
    }
}