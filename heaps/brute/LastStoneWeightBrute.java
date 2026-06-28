
// Problem: Last Stone Weight
// Approach: Brute Force (Sort on every iteration)
// Time Complexity: O(n^2 log n) - har baar sort karna padta hai
// Space Complexity: O(n) - ArrayList use ho rahi hai


import java.util.ArrayList;
import java.util.Collections;

public class LastStoneWeightBrute {

    public static int lastStoneWeight(int[] stones) {

        // Step 1: Array ko ArrayList mein convert karo
        // Taake easily remove kar sakein
        ArrayList<Integer> list = new ArrayList<>();
        for (int stone : stones) {
            list.add(stone);
        }

        // Step 2: Jab tak list mein 1 se zyada stones hain
        while (list.size() > 1) {

            // Step 3: List ko har baar sort karo ascending order mein
            Collections.sort(list);

            // Step 4: Do sabse bhaari stones nikalo (last two elements)
            int n = list.size();
            int y = list.get(n - 1); // sabse bhaari
            int x = list.get(n - 2); // doosra bhaari

            // Step 5: Dono stones remove karo
            list.remove(n - 1);
            list.remove(n - 2);

            // Step 6: Agar dono alag hain to difference add karo
            if (y != x) {
                list.add(y - x);
            }
            // Agar equal hain to dono khatam - kuch add nahi karte
        }

        // Step 7: Agar koi stone bacha hai to return karo
        // Warna 0 return karo
        return list.isEmpty() ? 0 : list.get(0);
    }

    public static void main(String[] args) {

        // Test Case 1
        int[] stones1 = {2, 7, 4, 1, 8, 1};
        System.out.println("Test 1: " + lastStoneWeight(stones1)); // 1

        // Test Case 2: Single stone
        int[] stones2 = {1};
        System.out.println("Test 2: " + lastStoneWeight(stones2)); // 1

        // Test Case 3: Dono equal
        int[] stones3 = {3, 3};
        System.out.println("Test 3: " + lastStoneWeight(stones3)); // 0
    }
}