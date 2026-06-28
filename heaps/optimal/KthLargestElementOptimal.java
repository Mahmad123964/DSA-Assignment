
// Problem: Kth Largest Element in Array
// Approach: Optimal (Min Heap of size k)
// Time Complexity: O(n log k) - har element ke liye log k heap operation
// Space Complexity: O(k) - heap mein sirf k elements store hote hain


import java.util.PriorityQueue;

public class KthLargestElementOptimal {

    public static int findKthLargest(int[] nums, int k) {

        // Step 1: Min Heap banao size k ka
        // Java mein default PriorityQueue min-heap hoti hai
        // Sabse chota element hamesha upar rehta hai
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Step 2: Har element ko heap mein daalo
        for (int num : nums) {

            // Step 3: Current element heap mein add karo
            minHeap.offer(num);

            // Step 4: Agar heap ka size k se bada ho gaya
            if (minHeap.size() > k) {

                // Step 5: Sabse chota element nikalo
                // Is tarah heap mein hamesha k largest elements rehte hain
                minHeap.poll();
            }
        }

        // Step 6: Heap ka root return karo
        // Root = sabse chota element heap mein
        // = k largest elements mein sabse chota
        // = poore array ka Kth largest element
        return minHeap.peek();
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