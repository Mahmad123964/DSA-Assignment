
// Problem: Remove Duplicates from Sorted List
// Approach: Brute Force (Convert to List, deduplicate, rebuild)
// Time Complexity: O(n) - ek baar traverse
// Space Complexity: O(n) - ArrayList mein values store hoti hain


import java.util.ArrayList;

public class RemoveDuplicatesBrute {

    // ListNode class - linked list ka ek node
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {

        // Step 1: Agar list empty hai ya sirf ek node hai
        if (head == null || head.next == null) return head;

        // Step 2: Ek ArrayList banao values store karne ke liye
        ArrayList<Integer> values = new ArrayList<>();

        // Step 3: Linked list traverse karo aur unique values ArrayList mein daalo
        ListNode current = head;
        while (current != null) {

            // Step 4: Agar value already list mein nahi hai to add karo
            if (!values.contains(current.val)) {
                values.add(current.val);
            }

            current = current.next;
        }

        // Step 5: ArrayList se naya linked list banao
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        for (int val : values) {
            temp.next = new ListNode(val);
            temp = temp.next;
        }

        // Step 6: Naya linked list return karo
        return dummy.next;
    }

    // Helper method - linked list print karo
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) System.out.print(" -> ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Test Case 1: 1 -> 1 -> 2 -> 3 -> 3
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(1);
        head1.next.next = new ListNode(2);
        head1.next.next.next = new ListNode(3);
        head1.next.next.next.next = new ListNode(3);
        System.out.print("Test 1: ");
        printList(deleteDuplicates(head1)); // 1 -> 2 -> 3

        // Test Case 2: 1 -> 1 -> 2
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(1);
        head2.next.next = new ListNode(2);
        System.out.print("Test 2: ");
        printList(deleteDuplicates(head2)); // 1 -> 2

        // Test Case 3: Single node
        ListNode head3 = new ListNode(1);
        System.out.print("Test 3: ");
        printList(deleteDuplicates(head3)); // 1
    }
}