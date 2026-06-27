package brute;
// Problem: Contains Duplicate
// Approach: Brute Force
// Time Complexity: O(n^2) - har element ko baaki sab se compare karo
// Space Complexity: O(1) - koi extra space nahi


public class ContainsDuplicateBrute {

    public static boolean containsDuplicate(int[] nums) {

        // Step 1: Har element ko baaki sab elements se compare karo
        for (int i = 0; i < nums.length; i++) {

            // Step 2: i ke baad wale saare elements check karo
            for (int j = i + 1; j < nums.length; j++) {

                // Step 3: Agar koi do elements equal hain
                if (nums[i] == nums[j]) {
                    return true; // duplicate mil gaya!
                }
            }
        }

        // Step 4: Koi duplicate nahi mila
        return false;
    }

    public static void main(String[] args) {

        // Test Case 1: Duplicate hai
        int[] nums1 = {1, 2, 3, 1};
        System.out.println("Test 1: " + containsDuplicate(nums1)); // true

        // Test Case 2: Koi duplicate nahi
        int[] nums2 = {1, 2, 3, 4};
        System.out.println("Test 2: " + containsDuplicate(nums2)); // false

        // Test Case 3: Sab same hain
        int[] nums3 = {1, 1, 1, 1};
        System.out.println("Test 3: " + containsDuplicate(nums3)); // true

        // Test Case 4: Sirf ek element
        int[] nums4 = {1};
        System.out.println("Test 4: " + containsDuplicate(nums4)); // false
    }
}