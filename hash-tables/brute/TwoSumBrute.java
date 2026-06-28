package brute;


// Problem: Two Sum
// Approach: Brute Force
// Time Complexity: O(n^2) - har pair check karo
// Space Complexity: O(1) - koi extra space nahi

public class TwoSumBrute {

    public static int[] twoSum(int[] nums, int target) {

        // Step 1: Har element ko baaki sab se compare karo
        for (int i = 0; i < nums.length; i++) {

            // Step 2: i ke baad wale saare elements check karo
            for (int j = i + 1; j < nums.length; j++) {

                // Step 3: Agar dono ka sum target ke barabar hai
                if (nums[i] + nums[j] == target) {

                    // Step 4: Dono indexes return karo
                    return new int[]{i, j};
                }
            }
        }

        // Step 5: Koi pair nahi mila
        return new int[]{};
    }

    public static void main(String[] args) {

        // Test Case 1
        int[] nums1 = {2, 7, 11, 15};
        int[] result1 = twoSum(nums1, 9);
        System.out.println( result1[0] + ", " + result1[1]); // [0, 1]

        // Test Case 2
        int[] nums2 = {3, 2, 4};
        int[] result2 = twoSum(nums2, 6);
        System.out.println( result2[0] + ", " + result2[1] ); // [1, 2]

        // Test Case 3
        int[] nums3 = {3, 3};
        int[] result3 = twoSum(nums3, 6);
        System.out.println( result3[0] + ", " + result3[1] ); // [0, 1]
    }
}