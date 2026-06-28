
// Problem: Kth Largest Element in Array
// Approach: Brute Force (Sort descending, return index k-1)
// Time Complexity: O(n log n) - sorting
// Space Complexity: O(1) - koi extra space nahi


import java.util.Arrays;

public class KthLargestElementBrute {

    public static int findKthLargest(int[] nums, int k) {

        // Step 1: Array ko ascending order mein sort karo
        Arrays.sort(nums);

        // Step 2: Kth largest element ka index nikalo
        // Ascending sort mein kth largest = length - k index pe hoga
        int n = nums.length;

        // Step 3: Kth largest element return karo
        return nums[n - k];
    }

    public static void main(String[] args) {

        // Test Case 1
        int[] nums1 = {3, 2, 1, 5, 6, 4};
        System.out.println("Test 1: " + findKthLargest(nums1, 2)); // 5

        // Test Case 2
        int[] nums2 = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        System.out.println("Test 2: " + findKthLargest(nums2, 4)); // 4

        // Test Case 3: Single element
        int[] nums3 = {1};
        System.out.println("Test 3: " + findKthLargest(nums3, 1)); // 1

        // Test Case 4: k = 1 (largest element)
        int[] nums4 = {5, 3, 8, 1, 9};
        System.out.println("Test 4: " + findKthLargest(nums4, 1)); // 9
    }
}