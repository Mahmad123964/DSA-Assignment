
// Problem: Find Closest Number to Zero
// Approach: Brute Force
// Time Complexity: O(n)
// Space Complexity: O(1)


public class FindClosestNumberToZeroBrute {

    public static int findClosestNumber(int[] nums) {

        // Step 1: pehly first element ko closest consider karty han
        int closest = nums[0];

        // Step 2: Poore array mein har number check karny ky lyea
        for (int i = 1; i < nums.length; i++) {

            // Step 3: Current number ka zero se distance nikalny ky lyea
            int currentDiff = Math.abs(nums[i]);

            // Step 4: Closest ka zero se distance nikalo
            int closestDiff = Math.abs(closest);

            // Step 5: Agar current zero ke zyada kareeb hai
            if (currentDiff < closestDiff) {
                closest = nums[i]; // update karo
            }

            // Step 6: Tie case - dono equally close hain
            // Positive number prefer karo
            else if (currentDiff == closestDiff) {
                if (nums[i] > closest) {
                    closest = nums[i];
                }
            }
        }

        // Step 7: Answer return karo
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