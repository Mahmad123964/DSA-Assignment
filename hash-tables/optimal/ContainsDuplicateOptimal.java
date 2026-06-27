package optimal;


// Problem: Contains Duplicate
// Approach: Optimal (HashSet)
// Time Complexity: O(n) - sirf ek baar array traverse
// Space Complexity: O(n) - HashSet mein elements store hote hain


import java.util.HashSet;

public class ContainsDuplicateOptimal {

    public static boolean containsDuplicate(int[] nums) {

        // Step 1: Ek empty HashSet banao
        // HashSet duplicate values allow nahi karta
        HashSet<Integer> seen = new HashSet<>();

        // Step 2: Array ke har element ko traverse karo
        for (int num : nums) {

            // Step 3: Check karo ke yeh number pehle se HashSet mein hai
            if (seen.contains(num)) {
                return true; // duplicate mil gaya!
            }

            // Step 4: Agar nahi hai to HashSet mein add karo
            seen.add(num);
        }

        // Step 5: Koi duplicate nahi mila
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