package optimal;


// Problem: Two Sum
// Approach: Optimal (HashMap)
// Time Complexity: O(n) - sirf ek baar array traverse
// Space Complexity: O(n) - HashMap mein elements store hote hain


import java.util.HashMap;

public class TwoSumOptimal {

    public static int[] twoSum(int[] nums, int target) {

        // Step 1: Ek empty HashMap banao
        // Key: number, Value: us number ka index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 2: Array ke har element ko traverse karo
        for (int i = 0; i < nums.length; i++) {

            // Step 3: Current number ka complement nikalo
            // Complement = target - current number
            int complement = target - nums[i];

            // Step 4: Check karo ke complement pehle se HashMap mein hai
            if (map.containsKey(complement)) {

                // Step 5: Dono indexes return karo
                // complement ka index map se lo, current index i hai
                return new int[]{map.get(complement), i};
            }

            // Step 6: Agar complement nahi mila to current number ko map mein add karo
            map.put(nums[i], i);
        }

        // Step 7: Koi pair nahi mila
        return new int[]{};
    }

    public static void main(String[] args) {

        // Test Case 1
        int[] nums1 = {2, 7, 11, 15};
        int[] result1 = twoSum(nums1, 9);
        System.out.println(result1[0] + ", " + result1[1] ); // [0, 1]

        // Test Case 2
        int[] nums2 = {3, 2, 4};
        int[] result2 = twoSum(nums2, 6);
        System.out.println( result2[0] + ", " + result2[1] ); // [1, 2]

        // Test Case 3
        int[] nums3 = {3, 3};
        int[] result3 = twoSum(nums3, 6);
        System.out.println(result3[0] + ", " + result3[1] ); // [0, 1]
    }
}
