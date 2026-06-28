
// Problem: Linked List Cycle
// Approach: Optimal (Floyd's Cycle Detection)
// Fast/Slow Pointers - Tortoise and Hare Algorithm
// Time Complexity: O(n) - ek baar poori list traverse
// Space Complexity: O(1) - koi extra space nahi


public class LinkedListCycleOptimal {

    // ListNode class
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static boolean hasCycle(ListNode head) {

        // Step 1: Agar list empty hai ya sirf ek node hai
        if (head == null || head.next == null) return false;

        // Step 2: Do pointers banao
        // Slow pointer - ek step aage badhta hai
        ListNode slow = head;

        // Fast pointer - do step aage badhta hai
        ListNode fast = head;

        // Step 3: Jab tak fast aur fast.next exist karte hain
        while (fast != null && fast.next != null) {

            // Step 4: Slow ek step aage badho
            slow = slow.next;

            // Step 5: Fast do step aage badho
            fast = fast.next.next;

            // Step 6: Agar dono pointers mil gaye to cycle hai
            if (slow == fast) {
                return true; // cycle mil gayi!
            }
        }

        // Step 7: Fast pointer null ho gaya - koi cycle nahi
        return false;
    }

    public static void main(String[] args) {

        // Test Case 1: Cycle hai
        ListNode head1 = new ListNode(3);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(0);
        head1.next.next.next = new ListNode(-4);
        head1.next.next.next.next = head1.next; // cycle banao
        System.out.println("Test 1: " + hasCycle(head1)); // true

        // Test Case 2: Cycle nahi hai
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        System.out.println("Test 2: " + hasCycle(head2)); // false

        // Test Case 3: Single node
        ListNode head3 = new ListNode(1);
        System.out.println("Test 3: " + hasCycle(head3)); // false

        // Test Case 4: Self loop
        ListNode head4 = new ListNode(1);
        head4.next = head4; // apne aap se connected
        System.out.println("Test 4: " + hasCycle(head4)); // true
    }
}