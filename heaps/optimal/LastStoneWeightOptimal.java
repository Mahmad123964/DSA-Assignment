
// Problem: Last Stone Weight
// Approach: Optimal (Max Heap - Priority Queue)
// Time Complexity: O(n log n) - heap operations log n time leti hain
// Space Complexity: O(n) - heap mein stones store hoti hain


import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeightOptimal {

    public static int lastStoneWeight(int[] stones) {

        // Step 1: Max Heap banao
        // Java mein default PriorityQueue min-heap hoti hai
        // Collections.reverseOrder() se max-heap banate hain
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Step 2: Saare stones heap mein daalo
        for (int stone : stones) {
            maxHeap.offer(stone);
        }

        // Step 3: Jab tak heap mein 1 se zyada stones hain
        while (maxHeap.size() > 1) {

            // Step 4: Do sabse bhaari stones nikalo
            // poll() automatically sabse bada element nikalta hai
            int y = maxHeap.poll(); // sabse bhaari
            int x = maxHeap.poll(); // doosra bhaari

            // Step 5: Agar dono alag hain to difference wapas daalo
            if (y != x) {
                maxHeap.offer(y - x);
            }
            // Agar equal hain to dono khatam - kuch add nahi karte
        }

        // Step 6: Agar koi stone bacha hai to return karo
        // Warna 0 return karo
        return maxHeap.isEmpty() ? 0 : maxHeap.peek();
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

        // Test Case 4: Sab equal
        int[] stones4 = {2, 2, 2, 2};
        System.out.println("Test 4: " + lastStoneWeight(stones4)); // 0
    }
}