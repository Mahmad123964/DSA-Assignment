
// Problem: Linked List Cycle
// Approach: Brute Force (HashSet mein visited nodes store karo)
// Time Complexity: O(n) - ek baar poori list traverse
// Space Complexity: O(n) - HashSet mein nodes store hoti hain


import java.util.HashSet;

public class LinkedListCycleBrute {

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

        // Step 2: Ek HashSet banao visited nodes store karne ke liye
        HashSet<ListNode> visited = new HashSet<>();

        // Step 3: List traverse karo
        ListNode current = head;

        while (current != null) {

            // Step 4: Agar current node pehle se visited mein hai
            if (visited.contains(current)) {
                return true; // cycle mil gayi!
            }

            // Step 5: Current node ko visited mein add karo
            visited.add(current);

            // Step 6: Aage badho
            current = current.next;
        }

        // Step 7: Koi cycle nahi mili
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
    }
}