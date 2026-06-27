// ============================================
// Problem: Find Closest Number to Zero
// Approach: Optimal
// Time Complexity: O(n)
// Space Complexity: O(1)
// ============================================

public class FindClosestNumberToZeroOptimal {

    public static int findClosestNumber(int[] nums) {

        // Step 1: Pehle element ko closest consider kar lyea ha
        int closest = nums[0];

        // Step 2: Enhanced for loop se poora array traverse karo
        for (int num : nums) {

            // Step 3: Agar current number zero ke zyada kareeb hai
            if (Math.abs(num) < Math.abs(closest)) {
                closest = num; // closest update karo
            }

            // Step 4: Tie case - dono equally close hain
            // Math.max() automatically positive prefer karta hai
            else if (Math.abs(num) == Math.abs(closest)) {
                closest = Math.max(closest, num);
            }
        }

        // Step 5: Answer return karo
        return closest;
    }

    public static void main(String[] args) {

        // Test Case 1: Normal case
        int[] nums1 = {-4, -2, 1, 4, 8};
        System.out.println("Test 1: " + findClosestNumber(nums1)); // Output: 1

        // Test Case 2: Tie case
        int[] nums2 = {2, -2, 3};
        System.out.println("Test 2: " + findClosestNumber(nums2)); // Output: 2

        // Test Case 3: Zero present hai
        int[] nums3 = {0, 5, -3};
        System.out.println("Test 3: " + findClosestNumber(nums3)); // Output: 0
    }
}
